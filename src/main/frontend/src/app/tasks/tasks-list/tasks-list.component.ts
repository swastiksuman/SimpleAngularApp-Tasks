import {TaskService} from '../task.service';
import {Component, OnInit} from '@angular/core';
import {Task} from '../task.model';

@Component({
  selector: 'app-tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

  tasks: Task[] = [];

  constructor(private taskService: TaskService) {

  }

  ngOnInit() {
    //    this.tasks.push(new Task(1, "T1", true, "07/07/18"));
    console.log(this.taskService.getTaks());
    this.taskService.getTaks().subscribe(
      (tasks: any[]) => {
        this.tasks = tasks;
      },
      (error) => console.log(error)
    );
    this.taskService.onTaskAdded.subscribe((task: Task) => this.tasks.push(task));
  }

  getDueDateLabel(task: Task) {
    return task.completed ? 'label-success' : 'label-primary';
  }

  onTaskChange(event, task) {
    console.log('Task has changed');
    this.taskService.saveTask(task, event.target.checked).subscribe();
  }
}

export class Task {
  public id: number;
  public name: string;
  public completed: boolean;
  public dueDate: string;

  constructor(name: string, dueDate: string, completed:  boolean) {
    this.name = name;
    this.completed = completed;
    this.dueDate = dueDate;
  }
}

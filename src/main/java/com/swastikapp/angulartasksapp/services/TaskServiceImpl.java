package com.swastikapp.angulartasksapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.swastikapp.angulartasksapp.domains.Task;
import com.swastikapp.angulartasksapp.repositories.TaskRepository;

@Component
public class TaskServiceImpl implements TaskService{
	@Autowired
	TaskRepository taskRepository;
	
	public List<Task> getTasks(){
		List<Task> taskList = new ArrayList<Task>();
		taskRepository.findAll().forEach(task -> taskList.add(task));
		return taskList;
	}

	@Override
	public Iterable<Task> list() {
		return taskRepository.findAll();
	}

	@Override
	public Task save(Task task) {
		return taskRepository.save(task);
	}
}

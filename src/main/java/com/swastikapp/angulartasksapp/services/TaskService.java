package com.swastikapp.angulartasksapp.services;

import com.swastikapp.angulartasksapp.domains.Task;

public interface TaskService {

	Iterable<Task> list();

	Task save(Task task);
}
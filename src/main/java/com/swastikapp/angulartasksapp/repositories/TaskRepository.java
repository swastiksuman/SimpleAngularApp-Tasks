package com.swastikapp.angulartasksapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.swastikapp.angulartasksapp.domains.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task,Long> {

}
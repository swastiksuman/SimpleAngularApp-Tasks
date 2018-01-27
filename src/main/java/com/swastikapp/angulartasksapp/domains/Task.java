package com.swastikapp.angulartasksapp.domains;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
public class Task {
	public Task(Long id, String name, LocalDate dueDate, Boolean completed) {
		this.id = id;
		this.name = name;
		this.dueDate = dueDate;
		this.completed = completed;
	}

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate dueDate;
	private Boolean completed;

	private Task() {
	}

}
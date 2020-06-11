package com.creatrix.todo.TODO.List.controller;

import com.creatrix.todo.TODO.List.model.Task;
import com.creatrix.todo.TODO.List.service.TaskService;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

	@Autowired
	private TaskService taskService;

	// Add a new Task
	@PostMapping(path = "/add-task")
	public @ResponseBody String addNewTask() {
		Task newTask = new Task();
		newTask.setTitle("New Title for test");
		newTask.setText("New Text for test");
		newTask.setCreatedDate(new Date());

		taskService.saveTask(newTask);
		return "Saved";
	}

	// Retrieve all task
	@GetMapping(path = "/all-task")
	public @ResponseBody Iterable<Task> getAllUsers() {
		return taskService.getAllTask();
	}
}
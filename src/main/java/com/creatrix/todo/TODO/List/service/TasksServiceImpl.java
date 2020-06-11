package com.creatrix.todo.TODO.List.service;

import com.creatrix.todo.TODO.List.model.Task;
import com.creatrix.todo.TODO.List.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TasksServiceImpl implements TaskService {

	@Autowired
	private TaskRepository taskRepository;

	@Override
	public void saveTask(Task newTask) {
		taskRepository.save(newTask);
	}

	@Override
	public Iterable<Task> getAllTask() {
		return taskRepository.findAll();
	}

}

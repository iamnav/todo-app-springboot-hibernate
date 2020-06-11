package com.creatrix.todo.TODO.List.service;

import com.creatrix.todo.TODO.List.model.Task;

public interface TaskService {

	public void saveTask(Task task);

	public Iterable<Task> getAllTask();
}

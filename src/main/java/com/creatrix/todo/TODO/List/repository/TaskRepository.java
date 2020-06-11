package com.creatrix.todo.TODO.List.repository;

import com.creatrix.todo.TODO.List.model.Task;

import org.springframework.data.repository.CrudRepository;

//	This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//	CRUD - Create, Read, Update, Delete
public interface TaskRepository extends CrudRepository<Task, Integer> {

}

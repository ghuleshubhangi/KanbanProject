package com.springboot.example.service;

import java.util.List;


import com.springboot.example.entity.Task;

public interface TaskService {
	List<Task> findAll();

	void insertTask(Task tsk);

	void updateTask(Task tsk);

//	void executeUpdateTask(Task tsk);

	void deleteTask(Task tsk);

}

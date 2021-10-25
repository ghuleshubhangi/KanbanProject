package com.springboot.example.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;


import com.springboot.example.dao.TaskDao;
import com.springboot.example.entity.Task;

@Component
public class TaskServiceImpl implements TaskService{
	
	@Resource 
	TaskDao taskDao;
	@Override
	public List<Task> findAll() {
		return taskDao.findAll();
	}
	@Override
	public void insertTask(Task tsk) {
		taskDao.insertTask(tsk);
		
	}
	@Override
	public void updateTask(Task tsk) {
		taskDao.updateTask(tsk);
		
	}
//	@Override
//	public void executeUpdateTask(Task tsk) {		
//		taskDao.executeUpdateTask(tsk);
//		
//	}

	@Override
	public void deleteTask(Task tsk) {
		taskDao.deleteTask(tsk);
		
	}
	
}

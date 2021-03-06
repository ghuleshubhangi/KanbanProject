package com.springboot.example.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.springboot.example.entity.Task;
import com.springboot.example.service.TaskService;

@RestController
@RequestMapping("/kanban")
@CrossOrigin(origins = "http://localhost:4200")
public class TaskController {
	
	@Autowired
	TaskService taskService;
	
	@GetMapping(value = "/taskList")
	public List<Task> getTasklist() {
		return taskService.findAll();
	
	}
	
	@PostMapping(value = "/createTask")
	public void createTask(@RequestBody Task tsk) {
		taskService.insertTask(tsk);
	
	}
	@PutMapping(value = "/updateTask")
	public void updateTask(@RequestBody Task tsk) {
		taskService.updateTask(tsk);
	
	}
//	@PutMapping(value = "/executeUpdateTask")
//	public void executeUpdateTask(@RequestBody Task tsk) {
//		taskService.executeUpdateTask(tsk);
//	
//	}
	
	@DeleteMapping(value = "/deleteTaskById")
	public void deleteTask(@RequestBody Task tsk) {
		taskService.deleteTask(tsk);
	
	}
	
	
}

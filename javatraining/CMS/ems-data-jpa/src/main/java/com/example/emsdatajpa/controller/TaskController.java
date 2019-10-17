package com.example.emsdatajpa.controller;

import com.example.emsdatajpa.model.Task;
import com.example.emsdatajpa.service.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/task")
public class TaskController {

    @Autowired
    TaskServiceImpl taskService;

    @RequestMapping(value = "/tasks",method = RequestMethod.GET)
    public List<Task> getTasks(){

        return taskService.getTasks();
    }

    @RequestMapping(value = "/tasks",method = RequestMethod.POST)
    public Task save(@RequestBody Task task){

        return taskService.save(task);

    }

    @RequestMapping(value = "/task/{id}",method = RequestMethod.GET)
    public Optional<Task> getEmployeeById(@PathVariable int id){
        return taskService.getTaskById(id);
    }





}

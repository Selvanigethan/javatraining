package com.example.emsdatajpa.service;

import com.example.emsdatajpa.model.Task;
import com.example.emsdatajpa.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl {

    @Autowired
    TaskRepository taskRepository;


    public List<Task> getTasks() {

       return taskRepository.findAll();
    }

    public Task save(Task task) {

        /*for(Project project:employee.getProjects()){
            project.setEmployees((List<Employee>) employee);
        }
*/
        return taskRepository.save(task);
    }

    public Optional<Task> getTaskById(Integer id) {

        return taskRepository.findById(id);
    }



}

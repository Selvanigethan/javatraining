package com.example.emsdatajpa.controller;

import com.example.emsdatajpa.model.Operation;
import com.example.emsdatajpa.service.OperationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/op")
public class OperationController  {
    @Autowired
    OperationServiceImpl operationService;

    @RequestMapping(value = "/operations/{id}",method = RequestMethod.GET)
    public List<Operation> getOperations(@PathVariable Integer id){
        return operationService.getOperationById(id);
    }

    public void save(@RequestBody Operation operation) {
        operationService.save(operation);
    }

    }

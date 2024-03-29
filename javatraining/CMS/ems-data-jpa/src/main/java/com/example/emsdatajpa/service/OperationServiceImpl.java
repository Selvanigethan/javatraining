package com.example.emsdatajpa.service;

import com.example.emsdatajpa.model.Operation;
import com.example.emsdatajpa.repository.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationServiceImpl {

    @Autowired
    OperationRepository operationRepository;

    public List<Operation> getOperationById(Integer id) {

        return  operationRepository.findOperationsByEmployeeId(id);
    }

    public void save(Operation operation) {

        operationRepository.save(operation);
    }

}

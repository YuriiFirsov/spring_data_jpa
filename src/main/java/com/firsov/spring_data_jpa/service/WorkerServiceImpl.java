package com.firsov.spring_data_jpa.service;

import com.firsov.spring_data_jpa.dao.WorkerRepository;
import com.firsov.spring_data_jpa.entity.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService{

    @Autowired
    private WorkerRepository workerRepository;

    @Override
    public List<Worker> getAllWorkers() {
        return workerRepository.findAll();
    }

    @Override
    public List<Worker> findAllByDepartment(String department) {
        return workerRepository.findAllByDepartment(department);
    }

    @Override
    public Worker getWorker(int id) {
        return workerRepository.findById(id).get();
    }



    @Override
    public void saveNewWorker(Worker worker) {
        workerRepository.save(worker);
    }


    @Override
    public void deleteWorker(int id) {
        workerRepository.deleteById(id);
    }



}

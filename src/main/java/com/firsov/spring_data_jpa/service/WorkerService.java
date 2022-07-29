package com.firsov.spring_data_jpa.service;

import com.firsov.spring_data_jpa.entity.Worker;

import java.util.List;

public interface WorkerService {
    public List<Worker> getAllWorkers();

    public List<Worker> findAllByDepartment(String department);

    public void saveNewWorker(Worker worker);

    public Worker getWorker(int id);

    public void deleteWorker(int id);


}

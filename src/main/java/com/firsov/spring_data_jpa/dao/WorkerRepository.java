package com.firsov.spring_data_jpa.dao;


import com.firsov.spring_data_jpa.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkerRepository extends JpaRepository<Worker, Integer> {
    public List<Worker> findAllByDepartment(String department);

}

package com.firsov.spring_data_jpa.controller;



import com.firsov.spring_data_jpa.entity.Worker;
import com.firsov.spring_data_jpa.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTController {

    @Autowired
    private WorkerService workerService;

    @GetMapping("/workers")
    public List<Worker> getAllWorkers() {
        return workerService.getAllWorkers();
    }

    @GetMapping("/workers/department/{department}")
    public List<Worker> findAllByDepartment(@PathVariable String department) {
        return workerService.findAllByDepartment(department);
    }


    @GetMapping("/worker/{id}")
    public Worker getWorker(@PathVariable int id) {

        Worker worker = workerService.getWorker(id);

        return worker;
    }

    @PostMapping("/worker")
    public Worker addWorker(@RequestBody Worker worker){
        workerService.saveNewWorker(worker);

        return worker;
    }

    @PutMapping("/worker")
    public Worker updateWorker(@RequestBody Worker worker){
        workerService.saveNewWorker(worker);

        return worker;
    }

    @DeleteMapping("/worker/{id}")
    public String deleteWorker(@PathVariable int id){
      //  Worker worker = workerService.getWorker(id);

        workerService.deleteWorker(id);

        return "Worker with id = " + id + " deleted";
    }

}

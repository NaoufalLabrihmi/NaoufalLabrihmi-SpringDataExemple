package com.springdata.demo.controller;

import com.springdata.demo.model.dto.EmployeeDto;
import com.springdata.demo.model.entity.Employee;
import com.springdata.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmpService empService;

    @GetMapping("/get-emp")
    public EmployeeDto getUser(@RequestParam Integer id) {
        return empService.getUser(id);
    }

    @PostMapping("/save-emp")
    public Employee saveUser(@RequestBody Employee emp) {
        return empService.saveEmp(emp);
    }

    @PostMapping("/update-emp")
    public Employee updateUser(@RequestBody Employee emp) {
        return empService.saveEmp(emp);
    }

    @GetMapping("/delete-emp")
    public void deleteUser(@RequestParam Integer id) {
         empService.delete(id);
    }

    @GetMapping("/get-all")
    public List<Employee> getAll() {
        return this.empService.getAll();
    }


}

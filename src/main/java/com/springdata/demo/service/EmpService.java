package com.springdata.demo.service;

import com.springdata.demo.model.dto.EmployeeDto;
import com.springdata.demo.model.entity.Employee;
import com.springdata.demo.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmpService {
    @Autowired
    private EmpRepo empRepo;

    public EmployeeDto getUser(Integer id) {
        Optional<Employee> emp =  this.empRepo.findById(id);
        if (emp.isPresent()) {
            return EmployeeDto.toDto(emp.get());
        }else return null;
    }

    public Employee saveEmp(Employee emp) {
        return this.empRepo.save(emp);
    }

    public void delete(Integer id) {
        this.empRepo.deleteById(id);
    }

    public List<Employee> getAll() {
        return this.empRepo.findAll();
    }
}

package com.springdata.demo.repository;

import com.springdata.demo.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}

package com.guselnikov.spring.springboot.spring_data_rest.spring_course_springboot_spring_data_rest.dao;


import com.guselnikov.spring.springboot.spring_data_rest.spring_course_springboot_spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByName(String name);
}

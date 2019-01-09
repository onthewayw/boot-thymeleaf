package com.example.demo.service;


import com.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    int deleteByPrimaryKey(Long id);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Employee record);

    List<Employee> queryEmployeeList();
}
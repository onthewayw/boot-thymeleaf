package com.example.demo.mapper;

import com.example.demo.entity.Employee;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
public interface EmployeeMapper extends Mapper{
    int deleteByPrimaryKey(Long id);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Employee record);

    List<Employee> queryEmployeeList();
    
    List<Employee> queryEmpByDeptId(Long id);
}
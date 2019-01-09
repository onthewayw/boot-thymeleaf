package com.example.demo.mapper;

import com.example.demo.entity.Employee;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
public interface EmployeeMapper extends Mapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Employee record);

    List<Employee> queryEmployeeList();
}
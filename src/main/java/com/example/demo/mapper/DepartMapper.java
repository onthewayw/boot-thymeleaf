package com.example.demo.mapper;


import com.example.demo.entity.Depart;
import com.example.demo.entity.Employee;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

public interface DepartMapper extends Mapper{
    int deleteByPrimaryKey(Long id);

    int insertSelective(Depart record);

    Depart selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Depart record);

    List<Depart> queryDepartList();
    
    List<Employee> queryEmployeeByDeptId(Long id);
}
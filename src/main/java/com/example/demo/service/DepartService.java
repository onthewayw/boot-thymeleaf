package com.example.demo.service;


import com.example.demo.entity.Depart;
import com.example.demo.entity.Employee;

import java.util.List;

public interface DepartService {
    int deleteByPrimaryKey(Long id);

    int insertSelective(Depart record);

    Depart selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Depart record);

    List<Depart> queryDepartList();
    
}
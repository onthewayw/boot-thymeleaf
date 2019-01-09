package com.example.demo.mapper;


import com.example.demo.entity.Depart;

import java.util.List;

public interface DepartMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(Depart record);

    Depart selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Depart record);

    List<Depart> queryDepartList();
}
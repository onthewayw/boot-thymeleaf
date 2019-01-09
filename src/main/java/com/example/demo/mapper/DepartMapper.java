package com.example.demo.mapper;


import com.example.demo.entity.Depart;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface DepartMapper extends Mapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(Depart record);

    Depart selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Depart record);

    List<Depart> queryDepartList();
}
package com.example.demo.serviceImpl;

import com.example.demo.entity.Depart;
import com.example.demo.entity.Employee;
import com.example.demo.mapper.DepartMapper;
import com.example.demo.service.DepartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartServiceImpl implements DepartService {

    @Autowired(required = false)
    private DepartMapper departMapper;

    public int deleteByPrimaryKey(Long id) {
        return departMapper.deleteByPrimaryKey(id);
    }

    public int insertSelective(Depart record) {
        return departMapper.insertSelective(record);
    }

    public Depart selectByPrimaryKey(Long id) {
        return departMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Depart record) {
        return departMapper.updateByPrimaryKeySelective(record);
    }

    public List<Depart> queryDepartList() {
        return departMapper.queryDepartList();
    }

}

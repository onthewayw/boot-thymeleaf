package com.example.demo.serviceImpl;

import com.example.demo.entity.Employee;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired(required = false)
    private EmployeeMapper employeeMapper;

    public int deleteByPrimaryKey(Long id) {
        return employeeMapper.deleteByPrimaryKey(id);
    }

    public int insertSelective(Employee record) {
        return employeeMapper.insertSelective(record);
    }

    public Employee selectByPrimaryKey(Long id) {
        return employeeMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Employee record) {
        return employeeMapper.updateByPrimaryKeySelective(record);
    }

    public List<Employee> queryEmployeeList() {
        return employeeMapper.queryEmployeeList();
    }

	public List<Employee> queryEmpByDeptId(Long id) {
		return employeeMapper.queryEmpByDeptId(id);
	}
}

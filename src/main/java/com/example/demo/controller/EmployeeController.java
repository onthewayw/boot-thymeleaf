package com.example.demo.controller;


import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
* 员工控制器
* */
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired(required = false)
    private EmployeeService employeeService;

    /**
     * 获取员工列表
     * */
    @GetMapping
    private ModelAndView getEmployeeList(Model model){
        model.addAttribute("employeeList", employeeService.queryEmployeeList());
        return new ModelAndView("employee/list","employeeModel",model);
    }

    /**
     * 根据id查询用户
     * */
    @GetMapping("{id}")
    public ModelAndView view(@PathVariable("id") Long id,Model model){
        Employee employee = employeeService.selectByPrimaryKey(id);
        model.addAttribute("employee", employee);
        return new ModelAndView("employee/view","employeeModel", model);
    }

    /**
     * 新建员工
     * @return
     */
    @PostMapping
    public ModelAndView create(Employee employee) {
        employeeService.insertSelective(employee);
        return new ModelAndView("redirect:/users");
    }
    /**
     * 更新员工
     * @return
     */
    @GetMapping(value = "modify/{id}")
    public ModelAndView update(Employee employee) {
        employeeService.updateByPrimaryKeySelective(employee);
        return new ModelAndView("redirect:/users");
    }
}

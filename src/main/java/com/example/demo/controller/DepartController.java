package com.example.demo.controller;

import com.example.demo.entity.Depart;
import com.example.demo.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/depart")
public class DepartController{
    @Autowired(required = false)
    private DepartService departService;

    /**
     * 获取部门列表
     * */
    @GetMapping
    private ModelAndView getEmployeeList(Model model){
        model.addAttribute("employeeList", departService.queryDepartList());
        return new ModelAndView("employee/list","employeeModel",model);
    }

    /**
     * 根据id查询用户
     * */
    @GetMapping("{id}")
    public ModelAndView view(@PathVariable("id") Long id, Model model){
        Depart depart = departService.selectByPrimaryKey(id);
        model.addAttribute("employee", depart);
        return new ModelAndView("employee/view","employeeModel", model);
    }

    /**
     * 新建员工
     * @return
     */
    @PostMapping
    public void create(Depart depart) {
        departService.insertSelective(depart);
        //return new ModelAndView("redirect:/users");
    }
    /**
     * 更新员工
     * @return
     */
    @GetMapping(value = "modify/{id}")
    public void update(Depart depart) {
        departService.updateByPrimaryKeySelective(depart);
        //return new ModelAndView("redirect:/users");
    }
}

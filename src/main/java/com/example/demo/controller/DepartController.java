package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Depart;
import com.example.demo.entity.Employee;
import com.example.demo.service.DepartService;
import com.example.demo.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/depart")
public class DepartController{
	
    @Autowired(required = false)
    private DepartService departService;
    @Autowired
    private EmployeeService empService;
    
    /**
     * 部门列表
     * */
    @GetMapping("/list")
    public ModelAndView list(Model model){
    	List<Depart> list =departService.queryDepartList();
    	model.addAttribute("departList",list );
    	model.addAttribute("title", "部门管理");
    	model.addAttribute("comment", "对应员工");
    	return new ModelAndView("users/list", "departModel", model);
    }
    
    @GetMapping("/form")
    public ModelAndView createForm(Model model){
    	model.addAttribute("depart", new Depart());
    	model.addAttribute("title", "创建部门");
    	return new ModelAndView("users/form", "departModel", model);
    }
    
    /**
     * 根据id修改部门
     * */
    @GetMapping(value="modify/{id}")
    public ModelAndView modifyDepart(@PathVariable("id")Long id,Model model){
    	Depart depart = this.departService.selectByPrimaryKey(id);
    	model.addAttribute("depart", depart);
    	model.addAttribute("title", "修改用户");
    	return new ModelAndView("depart/form", "departModel", model);
    }
    
    /**
     * 根据id删除部门
     * @throws IOException 
     * */
    @GetMapping(value="delete/{id}")
    public void deleteDepart(@PathVariable("id")Long id,Model model,HttpServletResponse response) throws IOException{
    	this.departService.deleteByPrimaryKey(id);
    	response.sendRedirect("/depart/list");
    }

    /**
     * 根据id查询部门
     * */
    @GetMapping("{id}")
    public ModelAndView view(@PathVariable("id") Long id, Model model){
        Depart depart = departService.selectByPrimaryKey(id);
        model.addAttribute("depart", depart);
        model.addAttribute("title", "查看部门");
        return new ModelAndView("users/view","departModel", model);
    }

    /**
     * 新建部门
     * @return
     * @throws IOException 
     */
    @PostMapping
    public void create(Depart depart,HttpServletResponse response) throws IOException {
        departService.insertSelective(depart);
        response.sendRedirect("/depart/list");
    }
    
    /**
     * 修改部门
     * @return
     * @throws IOException 
     */
    @PostMapping("/update")
    public void update(Depart depart,HttpServletResponse response) throws IOException {
        departService.updateByPrimaryKeySelective(depart);
        response.sendRedirect("/depart/list");
    }
    
    /**
     * 根据部门id查询其对应的员工列表
     * @return
     */
    @GetMapping(value="employee/{id}")
    public ModelAndView queryEmp(@PathVariable("id")Long id,Model model) {
    	List<Employee> list = empService.queryEmpByDeptId(id);
    	model.addAttribute("empList", list);
    	model.addAttribute("title", "查看员工");
    	return new ModelAndView("users/empList","departModel", model);
    }
    
}




























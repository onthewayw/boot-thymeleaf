package com.example.demo.entity;

import javax.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;

@XmlRootElement
public class Depart implements Serializable {
    private static final long serialVersionUID = 1L;

    //部门id 对应员工的deptId
    private Long id;

    //部门名称
    private String deptName;

    //部门简介
    private String deptIntro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptIntro() {
        return deptIntro;
    }

    public void setDeptIntro(String deptIntro) {
        this.deptIntro = deptIntro;
    }

	public Depart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Depart(Long id, String deptName, String deptIntro) {
		super();
		this.id = id;
		this.deptName = deptName;
		this.deptIntro = deptIntro;
	}

	@Override
	public String toString() {
		return "Depart [id=" + id + ", deptName=" + deptName + ", deptIntro="
				+ deptIntro + "]";
	}
    
}

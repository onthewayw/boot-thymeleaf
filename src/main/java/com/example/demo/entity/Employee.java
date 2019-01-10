package com.example.demo.entity;

import javax.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;

@XmlRootElement
public class Employee implements Serializable {
    private static final long serialVersionUID = -8472167157459633403L;

    //员工id 主键
    private Long id;
    //部门id
    private Long deptId;

    //员工名字
    private String name;

    // 员工卡号
    private String cardNo;
    
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Long id, Long deptId, String name, 
			String cardNo) {
		super();
		this.id = id;
		this.deptId = deptId;
		this.name = name;
		this.cardNo = cardNo;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", deptId=" + deptId + ", name=" + name
				+ ", cardNo=" + cardNo + "]";
	}

	
    
}

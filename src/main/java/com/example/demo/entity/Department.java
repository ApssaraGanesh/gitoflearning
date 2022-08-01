package com.example.demo.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="department")
public class Department {
	@Id
	@Column(name="DeptNo")
	private int deptno;
	
	@Column(name="DName")
	private String dname;
	
	@Column(name="Location")
	private String location;
	
	public Department() {}
	
	public Department(int deptno, String dname, String location) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.location = location;
	}
	public int getDeptNo() {
		return deptno;
	}
	public void setDeptNo(int deptno) {
		this.deptno = deptno;
	}
	public String getDName() {
		return dname;
	}
	public void setDName(String dname) {
		this.dname = dname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", dname=" + dname + ", location=" + location + "]";
	}
}
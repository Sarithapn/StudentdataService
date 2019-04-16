/**
 * 
 */
package com.webexample.springbootweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * @author Saritha Pilli
 *
 */

@Entity
public class studentdata {
	@Id
	private int studentid;
	@Column(length=20)
	private String name;
	@Column(length=20)
	private String deptname;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	@Override
	public String toString() {
		System.out.println("hai");
		return "studentdata [studentid=" + studentid + ", name=" + name + ", deptname=" + deptname + "]";
	}
	
	
	

}

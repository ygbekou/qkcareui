package com.qkcare.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.qkcare.model.enums.BloodGroup;

@Entity
@Table(name = "EMPLOYEE")
public class Employee extends BaseEntity {
	
	@Id
	@Column(name = "EMPLOYEE_ID")
	@GeneratedValue
	private Long id;
	@OneToOne
	@JoinColumn(name = "USER_ID")
	private User user;
	private String designation;
	@ManyToOne
	@JoinColumn(name = "DEPARTMENT_ID")
	private Department department;
	@Column(name="SHORT_BIOGRAPHIE")
	private String shortBiographie;
	private String specialist;
	@Column(name="BLOOD_GROUP")
	private BloodGroup bloodGroup;
	private String resume;
	private int status;
	
	
	public Employee() {}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getShortBiographie() {
		return shortBiographie;
	}

	public void setShortBiographie(String shortBiographie) {
		this.shortBiographie = shortBiographie;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	// TRansient fields for UI
	
	public String getFirstName() {
		return this.user.getFirstName();
	}
	public String getLastName() {
		return this.user.getLastName();
	}
	public String getMiddleName() {
		return this.user.getMiddleName();
	}
	public String getDepartmentName() {
		return this.department.getName();
	}
	public String getEmail() {
		return this.user.getEmail();
	}
	public String getPhone() {
		return this.user.getPhone();
	}
	public String getAddress() {
		return this.user.getAddress();
	}
	public String getSex() {
		return this.user.getSex();
	}
	public String getName() {
		return this.user.getFirstName() + " " + this.user.getLastName();
	}
}

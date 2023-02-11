package com.westagile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact")
public class PleaseProvideTheInfoBelow {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "full_name",length = 45,nullable = false)
	private String fullName;
	@Column(name = "email_address",length = 128,nullable = false,unique = true)
	private String emailAddress;
	@Column(name = "phone_number",length = 10,nullable = false,unique = true)
	private String phoneNumber;
	@Column(name = "project_description",length = 256,nullable = false)
	private String projectDescription;
	public PleaseProvideTheInfoBelow() {
		
	}
	
	public PleaseProvideTheInfoBelow(String fullName, String emailAddress, String phoneNumber,
			String projectDescription) {
		this.fullName = fullName;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.projectDescription = projectDescription;
	}

	public long getId() {
		return id;
	}
	public String getFullName() {
		return fullName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	

}

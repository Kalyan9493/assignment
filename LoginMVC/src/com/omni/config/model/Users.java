package com.omni.config.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Users {
	@Id
	@Column(name="id")
	private int userid;
	private String name;
	private String country;
	
	
	
	public Users(int userid, String name, String country) {
		this.userid = userid;
		this.name = name;
		this.country = country;
	}
	
	
	public Users() {
		// TODO Auto-generated constructor stub
	}


	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return country;
	}
	public void setEmailid(String country) {
		this.country = country;
	}
	
	

}

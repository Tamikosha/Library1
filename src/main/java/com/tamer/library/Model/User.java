package com.tamer.library.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int id;
	private String email;
	private String name;
	private String address;
	private String  student_id;
	private String role;
	private String password;
	@OneToMany(mappedBy="user")
	private List<Borrow> borrow;
	

	
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public List<Borrow> getBorrow() {
		return borrow;
	}
	public void setBorrow(List<Borrow> borrow) {
		this.borrow = borrow;
	}
}
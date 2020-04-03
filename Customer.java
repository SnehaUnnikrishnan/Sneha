package com.cognizant.project.entity;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

  // entity class customer 
@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
 private int id;
	
	@NotEmpty(message="cannot be empty ")
	@Column(name="first_name")
	
	private String firstName;
	
	@NotEmpty(message="cannot be empty ")
	@Column(name="last_name")
	
 private String lastName;
	
	

	@Column(name="dob")
	
	 private Date dob;
	
	@NotEmpty(message="cannot be empty ")
	@Column(name="gender")
	
	 private String gender;
	
	@NotEmpty(message="cannot be empty ")
	@Column(name="email")
	
 private String email;
	
	@NotEmpty(message="cannot be empty ")

	@Size(max=9,message="requires 9 numbers")
	@Column(name="phn")
	
	 private String phn;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhn() {
		return phn;
	}

	public void setPhn(String phn) {
		this.phn = phn;
	}

	public Customer() {
		
	}

	public Customer(int id, String firstName, String lastName, Date dob, String gender, String email, String phn) {
	
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
		this.phn = phn;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", gender=" + gender + ", email=" + email + ", phn=" + phn + "]";
	}
	
}
	
 

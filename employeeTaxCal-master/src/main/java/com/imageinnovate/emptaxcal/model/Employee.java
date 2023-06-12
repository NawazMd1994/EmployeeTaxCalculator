package com.imageinnovate.emptaxcal.model;

import java.sql.Date;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull(message = "FirstName cannot be null")
	@NotEmpty(message = "FirstName cannot be Empty!")
	private String firstName;
	@NotNull(message = "LastName cannot be null")
	@NotEmpty(message = "LastName cannot be Empty!")
	private String lastName;
	@Email(message = "Email should be valid")
	private String email;
	@NotNull(message = "PhoneNumber cannot be null")
	@NotEmpty(message = "PhoneNumber cannot be Empty!")
	private List<String> phoneNumber;
	@NotNull(message = "Date of Join  cannot be null")
	private Date doj;
	@NotNull(message = "Salary cannot be null")
	private Double Sal;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Double getSal() {
		return Sal;
	}

	public void setSal(Double sal) {
		Sal = sal;
	}

}

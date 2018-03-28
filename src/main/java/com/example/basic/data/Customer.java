package com.example.basic.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_sample")
public class Customer {

	@Id
	@Column(name = "id")
	private Long customerId;

	@Column
	private String name;

	@Column
	private String address;

	@Column
	private Long age;

	@Column(name = "points")
	private Double customerPoints;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
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

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public Double getCustomerPoints() {
		return customerPoints;
	}

	public void setCustomerPoints(Double customerPoints) {
		this.customerPoints = customerPoints;
	}

	public Customer(Long customerId, String name, String address, Long age, Double customerPoints) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.age = age;
		this.customerPoints = customerPoints;
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", address=" + address + ", age=" + age
				+ ", customerPoints=" + customerPoints + "]";
	}

	
}

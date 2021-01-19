package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class PersonDTO implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 901130684891485391L;

	private Long id;

    private String name;

    private Integer age;

    private Date joined;

    private boolean active;
    
    private Long addressId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getJoined() {
		return joined;
	}

	public void setJoined(Date joined) {
		this.joined = joined;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
}

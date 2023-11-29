package com.example.demo.modelpojo;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity  
public class Model { 
	
	@Id
	private int id;
	private String name;

	
	public String toString() {
		return name +":"+id;
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

	
	
}

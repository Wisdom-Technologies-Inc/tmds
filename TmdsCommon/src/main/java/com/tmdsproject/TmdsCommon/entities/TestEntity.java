package com.tmdsproject.TmdsCommon.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TestEntity {

	@Id
	private Long id;
	
	private String name;

	public TestEntity(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

	public TestEntity() {
		
	}



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

	@Override
	public String toString() {
		return "TestEntity [id=" + id + ", name=" + name + "]";
	}
	
	
}

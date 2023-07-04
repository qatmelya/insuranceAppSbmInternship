package com.sbm.application.entities.abstracts;

import org.springframework.data.annotation.Id;

public abstract class Entity {

	@Id
	private int id;

	public Entity(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

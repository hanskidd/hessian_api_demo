package com.kidd.api.domain;

import java.io.Serializable;

/**
 * 用户实体类
 * @author kidd
 *
 */
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6022973364082179332L;

	private Integer id;
	
	private String name;
	
	private int sex;

	
	
	
	public User() {
	}

	public User(Integer id, String name, int sex) {
		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}
}

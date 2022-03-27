package com.bus.entity;
//实体类：和数据库对应的类，它的属性和数据库里对应的表的字段一一对应
public class Admin {
	private Integer id;
	private String name;
	private String password;
	public Admin() {
		super();
	}
	public Admin(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public Admin(Integer id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	

}

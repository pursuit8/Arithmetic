package com.bus.entity;

public class Grade {
	private Integer grade_id;
	private Integer grade;
	private Integer id;
	public Grade() {
		super();
	}
	public Grade(Integer grade, Integer id) {
		super();
		this.grade = grade;
		this.id = id;
	}
	public Grade(Integer grade_id, Integer grade, Integer id) {
		super();
		this.grade_id = grade_id;
		this.grade = grade;
		this.id = id;
	}
	public Integer getGrade_id() {
		return grade_id;
	}
	public void setGrade_id(Integer grade_id) {
		this.grade_id = grade_id;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Grade [grade_id=" + grade_id + ", grade=" + grade + ", id=" + id + "]";
	}
	public Grade(Integer grade) {
		super();
		this.grade = grade;
	}
	
}

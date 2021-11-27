package com.montrealcollege.rest.model;

public class Course {
	
	private String name;
	private Integer totalHours;

	public Course() {
		super();
	}

	public Course(String name, Integer totalHours) {
		super();
		this.name = name;
		this.totalHours = totalHours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(Integer totalHours) {
		this.totalHours = totalHours;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", totalHours=" + totalHours + "]";
	}
}

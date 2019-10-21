package com.springboot.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CourseId")
	private Integer CourseId;
	@Column(name = "CourseName")
	private String CourseName;
	@Column(name = "CourseDuration")
	private Integer CourseDuration;
	@Column(name = "Fees")
	private Integer Fees;
	
	public Integer getCourseId() {
		return CourseId;
	}
	public void setCourseId(Integer courseId) {
		CourseId = courseId;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public Integer getCourseDuration() {
		return CourseDuration;
	}
	public void setCourseDuration(Integer courseDuration) {
		CourseDuration = courseDuration;
	}
	public Integer getFees() {
		return Fees;
	}
	public void setFees(Integer fees) {
		Fees = fees;
	}
	@Override
	public String toString() {
		return "Course [CourseId=" + CourseId + ", CourseName=" + CourseName + ", CourseDuration=" + CourseDuration
				+ ", Fees=" + Fees + "]";
	}
	public Course() {
		super();
	}
	
	

}

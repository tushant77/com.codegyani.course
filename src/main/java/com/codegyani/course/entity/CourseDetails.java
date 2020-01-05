package com.codegyani.course.entity;
/* Copyright (c) 2019 
 * Company: MyToshika
 * project Name: Code Gyani
 * Module:Course
 * version: 1.0
 * Date: 12/2019
 * author: ALI SNSA
*/
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "course_details")
public class CourseDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "duration")
	private String duration;
	
	@Column(name = "size")
	private String size;

	@Column(name = "demo_video_url")
	private String demoVideoUrl;

	@Column(name = "instructor_id")//Temporary 
	private String instructorId;
	

//Relation
	//courseId ==>course
	
	//InstructorId====> UK
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="course_id")
	private Course course;

//Getter-Setter
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


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getDemoVideoUrl() {
		return demoVideoUrl;
	}


	public void setDemoVideoUrl(String demoVideoUrl) {
		this.demoVideoUrl = demoVideoUrl;
	}


	public String getInstructorId() {
		return instructorId;
	}


	public void setInstructorId(String instructorId) {
		this.instructorId = instructorId;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}
	


	
}

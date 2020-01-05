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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.codegyani.course.dto.TypeName;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="course_section_content")
public class CourseSectionContent {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="duration")
	private Integer duration;
	
	@Column(name="url")
	private String url;
	
	@Column(name="description")
	private String description;
	
	@Column(name="title")
	private String title;
	
	@Column(name="sequence")
	private String sequence;
	
	@Column(name="content_type")
	@Enumerated(EnumType.STRING)
	private TypeName contentType;
	
//Relation
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="course_id")
	private Course course;
	
	@JsonIgnore
	@JoinColumn(name="section_id")
	@ManyToOne
	private CourseSection courseSection;

//Getter-Setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public TypeName getContentType() {
		return contentType;
	}

	public void setContentType(TypeName contentType) {
		this.contentType = contentType;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public CourseSection getCourseSection() {
		return courseSection;
	}

	public void setCourseSection(CourseSection courseSection) {
		this.courseSection = courseSection;
	}
	
	
}

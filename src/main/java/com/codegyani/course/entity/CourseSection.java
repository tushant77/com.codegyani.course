package com.codegyani.course.entity;
/* Copyright (c) 2019 
 * Company: MyToshika
 * project Name: Code Gyani
 * Module:Course
 * version: 1.0
 * Date: 12/2019
 * author: ALI SNSA
*/
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="course_section")
public class CourseSection {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="title")
	private String title;
	
	@Column(name = "description")
	private String description;
		
	@Column(name = "sequence")
	private Integer sequence;
	
//Relation
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="course_id")
	private Course course;
	
	@OneToMany(mappedBy="courseSection")
	List<CourseSectionContent> courseSectionContent;
	
	@OneToMany(mappedBy="courseSection")
	List<CourseSectionFeedback> courseSectionFeedback;

//Getter-Setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public List<CourseSectionContent> getCourseSectionContent() {
		return courseSectionContent;
	}

	public void setCourseSectionContent(List<CourseSectionContent> courseSectionContent) {
		this.courseSectionContent = courseSectionContent;
	}

	public List<CourseSectionFeedback> getCourseSectionFeedback() {
		return courseSectionFeedback;
	}

	public void setCourseSectionFeedback(List<CourseSectionFeedback> courseSectionFeedback) {
		this.courseSectionFeedback = courseSectionFeedback;
	}
	
}

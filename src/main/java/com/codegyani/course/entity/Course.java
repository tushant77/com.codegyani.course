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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.codegyani.course.dto.CourseStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "course")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "course_id")
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(name = "course_status", length = 50, nullable = false)
	private CourseStatus courseStatus;

// Relation

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "course_type")
	private CourseType courseType;

	@OneToMany(mappedBy = "course")
	private List<CourseDetails> courseDetails;

	@OneToMany(mappedBy = "course")
	private List<CourseFeedback> courseFeedback;

	@OneToMany(mappedBy = "course")
	private List<Comment> userComment;

	@OneToMany(mappedBy = "course")
	private List<CourseSection> courseSection;

	@OneToMany(mappedBy = "course")
	private List<CourseSectionContent> courseSectionContent;

	@OneToMany(mappedBy = "course")
	private List<CourseSectionFeedback> courseSectionFeedback;

// Getter-Setter
	public CourseType getCourseType() {
		return courseType;
	}

	public void setCourseType(CourseType courseType) {
		this.courseType = courseType;
	}

	public List<Comment> getComment() {
		return userComment;
	}

	public void setComment(List<Comment> userComment) {
		this.userComment = userComment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CourseStatus getCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(CourseStatus courseStatus) {
		this.courseStatus = courseStatus;
	}

	public CourseType getCoursetype() {
		return courseType;
	}

	public void setCoursetype(CourseType coursetype) {
		this.courseType = coursetype;
	}

	public List<CourseDetails> getCourseDetails() {
		return courseDetails;
	}

	public void setCourseDetails(List<CourseDetails> courseDetails) {
		this.courseDetails = courseDetails;
	}

	public List<CourseFeedback> getCourseFeedback() {
		return courseFeedback;
	}

	public void setCourseFeedback(List<CourseFeedback> courseFeedback) {
		this.courseFeedback = courseFeedback;
	}

	public List<CourseSection> getCourseSection() {
		return courseSection;
	}

	public void setCourseSection(List<CourseSection> courseSection) {
		this.courseSection = courseSection;
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

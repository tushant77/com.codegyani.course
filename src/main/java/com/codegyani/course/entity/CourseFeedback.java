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
@Table(name = "course_feedback")
public class CourseFeedback {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "is_like")
	private Boolean isLike;

	@Column(name = "rating")
	private Float rating;

	@Column(name = "student_id") // Temporary
	private Long studentId;
	
	@Column(name = "email") // Temporary
	private String email;

//Relation

	// studentId ==> present in another DB

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="comment_id")
	private Comment comment;

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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Boolean getIsLike() {
		return isLike;
	}

	public void setIsLike(Boolean isLike) {
		this.isLike = isLike;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float f) {
		this.rating = f;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}

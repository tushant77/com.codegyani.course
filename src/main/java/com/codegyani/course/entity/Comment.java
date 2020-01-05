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
@Table(name="comment")
public class Comment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="user_comment")
	private String userComment;
	
	@Column(name="comment_id")
	private Long commentCommentId;
	
	@Column(name="student_id")// this is temporary as Student Db is not present.
	private Long studentId;
	
	//temporary field : email
	@Column(name="email")
	private String email;
//Relation
	//studentId ==> in student Db
//	@OneToMany(mappedBy = "comment")
//	private List<Student> student;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="course_id")
	private Course course;
	
	@OneToMany(mappedBy = "comment")
	private List<CourseFeedback> courseFeedback;

//Getter-Setter
	public Long getId() {
		return id;
	}

	public void setUserComment(String userComment) {
		this.userComment = userComment;
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

	public String getUserComment() {
		return userComment;
	}

	public void setComment(String userComment) {
		this.userComment = userComment;
	}

	public Long getCommentCommentId() {
		return commentCommentId;
	}

	public void setCommentCommentId(Long commentCommentId) {
		this.commentCommentId = commentCommentId;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public List<CourseFeedback> getCourseFeedback() {
		return courseFeedback;
	}

	public void setCourseFeedback(List<CourseFeedback> courseFeedback) {
		this.courseFeedback = courseFeedback;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}

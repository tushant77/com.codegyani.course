package com.codegyani.course.dto;

import javax.validation.constraints.NotNull;

import com.codegyani.course.entity.Comment;

public class CourseFeedbackDto {

	@NotNull
	private long studentId;

	@NotNull
	private Boolean isLike;

	@NotNull
	private Float rating;
	
	@NotNull
	private String email;
		
	//private String Comment;
	
	//private String Course;

//Getter-Setter
	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public Boolean getIsLike() {
		return isLike;
	}

	public void setIsLike(Boolean isLike) {
		this.isLike = isLike;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "CourseFeedbackDto [studentId=" + studentId + ", isLike=" + isLike + ", rating=" + rating + ", email="
				+ email + "]";
	}

//	public String getComment() {
//		return Comment;
//	}
//
//	public void setComment(String comment) {
//		Comment = comment;
//	}
//
//	public String getCourse() {
//		return Course;
//	}
//
//	public void setCourse(String course) {
//		Course = course;
//	}

	

}

package com.codegyani.course.dto;


public class CreateCommenteDto {
	

	private String userComment;
	
	private Long commentCommentId;
	
	private Long studentId;

//Getter-Setter
	public String getUserComment() {
		return userComment;
	}

	public void setUserComment(String userComment) {
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
	

}

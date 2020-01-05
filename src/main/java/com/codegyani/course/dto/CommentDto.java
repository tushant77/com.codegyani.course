package com.codegyani.course.dto;

import javax.validation.constraints.NotNull;

public class CommentDto {

	@NotNull
	private String comment;

	@NotNull
	private long studentId;

	@NotNull
	private long selfLoopCommentId;

//Getter-Setter
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public long getSelfLoopCommentId() {
		return selfLoopCommentId;
	}

	public void setSelfLoopCommentId(long selfLoopCommentId) {
		this.selfLoopCommentId = selfLoopCommentId;
	}

}

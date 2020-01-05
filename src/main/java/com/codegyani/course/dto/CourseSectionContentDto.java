package com.codegyani.course.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

public class CourseSectionContentDto {

	@NotNull
	@Enumerated(EnumType.STRING)
	private TypeName typeName;

	@NotNull
	private long contentDuration;

	@NotNull
	private String contentUrl;

	@NotNull
	private String contentTitle;

	@NotNull
	private String contentDescription;

	@NotNull
	private String contentSequence;

//Getter-Setter
	public TypeName getTypeName() {
		return typeName;
	}

	public void setTypeName(TypeName typeName) {
		this.typeName = typeName;
	}

	public long getContentDuration() {
		return contentDuration;
	}

	public void setContentDuration(long contentDuration) {
		this.contentDuration = contentDuration;
	}

	public String getContentUrl() {
		return contentUrl;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

	public String getContentTitle() {
		return contentTitle;
	}

	public void setContentTitle(String contentTitle) {
		this.contentTitle = contentTitle;
	}

	public String getContentDescription() {
		return contentDescription;
	}

	public void setContentDescription(String contentDescription) {
		this.contentDescription = contentDescription;
	}

	public String getContentSequence() {
		return contentSequence;
	}

	public void setContentSequence(String contentSequence) {
		this.contentSequence = contentSequence;
	}

}

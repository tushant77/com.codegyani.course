package com.codegyani.course.dto;

import javax.validation.constraints.NotNull;

public class CourseSectionDto {

	@NotNull
	private String sectionTitle;

	@NotNull
	private String sectionDescription;

	@NotNull
	private Long sectionSequence;

//Getter-Setter
	public String getSectionTitle() {
		return sectionTitle;
	}

	public void setSectionTitle(String sectionTitle) {
		this.sectionTitle = sectionTitle;
	}

	public String getSectionDescription() {
		return sectionDescription;
	}

	public void setSectionDescription(String sectionDescription) {
		this.sectionDescription = sectionDescription;
	}

	public Long getSectionSequence() {
		return sectionSequence;
	}

	public void setSectionSequence(@NotNull Long sectionSequence) {
		this.sectionSequence = sectionSequence;
	}

}

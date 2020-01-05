package com.codegyani.course.dto;

import javax.validation.constraints.NotNull;

import com.codegyani.course.entity.Course;
import com.codegyani.course.entity.CourseSection;

public class CourseSectionFeedbackDto {

	@NotNull
	private Course courseId;
	
	@NotNull
	private CourseSection sectionTitle;
	
	@NotNull
	private String description;
	
	@NotNull
	private String sequence;

//Getter-Setter
	public Course getCourseId() {
		return courseId;
	}

	public void setCourseId(Course courseId) {
		this.courseId = courseId;
	}

	public CourseSection getSectionTitle() {
		return sectionTitle;
	}

	public void setSectionTitle(CourseSection sectionTitle) {
		this.sectionTitle = sectionTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	
	
}

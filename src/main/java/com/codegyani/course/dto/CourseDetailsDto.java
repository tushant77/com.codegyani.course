package com.codegyani.course.dto;

import javax.validation.constraints.NotNull;

public class CourseDetailsDto {
	
	@NotNull
	private String courseName;
	
	@NotNull
	private String courseDescription;
	
	@NotNull
	private long instructorId;
	
	@NotNull
	private String duration;
	
	@NotNull
	private String demoVideoUrl;
	
//Getter-Setter	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public long getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(long instructorId) {
		this.instructorId = instructorId;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDemoVideoUrl() {
		return demoVideoUrl;
	}
	public void setDemoVideoUrl(String demoVideoUrl) {
		this.demoVideoUrl = demoVideoUrl;
	}
	
	

}

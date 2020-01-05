package com.codegyani.course.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

import com.codegyani.course.entity.CourseType;

public class CourseDto {
	   
		@NotNull
		@Enumerated(EnumType.STRING)
		private CourseType courseType;

		@NotNull
		@Enumerated(EnumType.STRING)
	    private CourseStatus courseStatus;
		
		@NotNull
		private String courseTitle;
		
		@NotNull
		private String courseDescription;
		
		@NotNull
	    private long instructorId;

//Getter-Setter
		public CourseType getCourseType() {
			return courseType;
		}

		public void setCourseType(CourseType courseType) {
			this.courseType = courseType;
		}

		public CourseStatus getCourseStatus() {
			return courseStatus;
		}

		public void setCourseStatus(CourseStatus courseStatus) {
			this.courseStatus = courseStatus;
		}

		public String getCourseTitle() {
			return courseTitle;
		}

		public void setCourseTitle(String courseTitle) {
			this.courseTitle = courseTitle;
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

		


}

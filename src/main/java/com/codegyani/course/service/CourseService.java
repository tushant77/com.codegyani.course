package com.codegyani.course.service;
/* Copyright (c) 2019 
 * Company: MyToshika
 * project Name: Code Gyani
 * Module:Course
 * version: 1.0
 * Date: 12/2019
 * author: ALI SNSA
*/
import java.util.List;

import org.springframework.stereotype.Service;

import com.codegyani.course.dto.CourseDto;
import com.codegyani.course.dto.CourseSectionDto;
import com.codegyani.course.dto.CreateCourseDto;
import com.codegyani.course.entity.Course;
import com.codegyani.course.entity.CourseSection;
import com.codegyani.course.entity.CourseSectionContent;

@Service
public interface CourseService {

	Boolean createCourse(CreateCourseDto createCourseDto);

	List<Course> getCourseById();

	Boolean deleteCourseById(Long id);

	Boolean updateCourseDetails(CourseDto courseDto, Long id);

	Boolean createCourseSectionInfo(CourseSectionDto courseSectionDto);

	CourseSection getCourseSectionInfo(Long id);

	CourseSectionContent getCourseSectionContent(Long id);

	Boolean deleteCourseSectionContent(Long id);

}

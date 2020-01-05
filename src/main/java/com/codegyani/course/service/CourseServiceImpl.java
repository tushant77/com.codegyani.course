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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codegyani.course.dto.CourseDto;
import com.codegyani.course.dto.CourseSectionDto;
import com.codegyani.course.dto.CreateCourseDto;
import com.codegyani.course.entity.Course;
import com.codegyani.course.entity.CourseSection;
import com.codegyani.course.entity.CourseSectionContent;
import com.codegyani.course.entity.CourseType;
import com.codegyani.course.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public Boolean createCourse(CreateCourseDto createCourseDto) {

		if (createCourseDto != null) {
			Course course = new Course();
			CourseType courseType = course.getCoursetype();

			courseType.getTypeName();

			course.setCourseStatus(createCourseDto.getCourseStatus());
			course.setCoursetype(courseType);
			courseRepository.save(course);
			return true;
		}

		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Course> getCourseById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteCourseById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateCourseDetails(CourseDto courseDto, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean createCourseSectionInfo(CourseSectionDto courseSectionDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseSection getCourseSectionInfo(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseSectionContent getCourseSectionContent(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteCourseSectionContent(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}

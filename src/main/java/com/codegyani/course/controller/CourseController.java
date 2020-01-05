package com.codegyani.course.controller;
/* Copyright (c) 2019 
 * Company: MyToshika
 * project Name: Code Gyani
 * Module:Course
 * version: 1.0
 * Date: 12/2019
 * author: ALI SNSA
*/
import java.util.List;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codegyani.course.dto.CourseDto;
import com.codegyani.course.dto.CreateCourseDto;
import com.codegyani.course.entity.Comment;
import com.codegyani.course.entity.Course;
import com.codegyani.course.service.CourseService;

@RestController
@Path(value = "/api/courseMs/course")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@RequestMapping(value = "/createCourse", method = RequestMethod.POST)
	private ResponseEntity<?> createCourse(@RequestBody CreateCourseDto createCourseDto) {
		Boolean available = courseService.createCourse(createCourseDto);
		if (available)
			return new ResponseEntity<>("course created succesfully", HttpStatus.OK);
		return new ResponseEntity<>("course can not be created", HttpStatus.OK);
	}

	@RequestMapping(value = "/getCourseById/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getCourseById(@PathVariable Long id) {
		List<Course> course = courseService.getCourseById();
		if (course != null)
			return new ResponseEntity<>(course, HttpStatus.OK);
		return new ResponseEntity<>("Course can not be Displayed", HttpStatus.OK);

	}

	@RequestMapping(value = "/deleteCourseById/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteCourseById(@PathVariable Long id) {
		boolean course = courseService.deleteCourseById(id);
		if (course)
			return new ResponseEntity<>(course, HttpStatus.OK);
		return new ResponseEntity<>("Course can not be Displayed", HttpStatus.OK);

	}

	@RequestMapping(value = "/updatecoursedetails", method = RequestMethod.POST)
	public boolean updatecoursedetails(@RequestBody CourseDto courseDto, @PathVariable Long id) {
		Boolean course = courseService.updateCourseDetails(courseDto, id);
		return true;

	}

}

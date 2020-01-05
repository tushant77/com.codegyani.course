package com.codegyani.course.controller;
/* Copyright (c) 2019 
 * Company: MyToshika
 * project Name: Code Gyani
 * Module:Course
 * version: 1.0
 * Date: 12/2019
 * author: ALI SNSA
*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codegyani.course.dto.CourseSectionContentDto;
import com.codegyani.course.dto.CourseSectionDto;
import com.codegyani.course.service.CourseService;

@RestController
public class SectionController {
	@Autowired
	private CourseService courseService;

	@RequestMapping(value="/createCourseSectionInfo",method = RequestMethod.POST)
	public String createCourseSectionInfo(@RequestBody CourseSectionDto courseSectionDto)
	{
		Boolean createCourseSection = courseService.createCourseSectionInfo(courseSectionDto);
				
		if(createCourseSection)
		{
			return "CourseSection successfully created";
		}
		return "CourseSection failed to get created";
		
	}
//TO-DO	
/*
	@RequestMapping(value="/getCourseSectionInfo",method = RequestMethod.GET)
	public CourseSection getCourseSectionInfo(@RequestBody Long id)
	{
		 CourseSection courseSection = courseService.getCourseSectionInfo(id);
		return courseSection;
		
	}
	
	@RequestMapping(value="/deleteCourseSectionInfo",method = RequestMethod.DELETE)
	public String deleteCourseSectionInfo(@RequestBody Long id)
	{
		Boolean deleteCourseSection =courseService.deleteCourseSectionInfo(id);
		if(deleteCourseSection)
		{
		return "Course successfully deleted";
		}
		return "Id does not exist ";
		
	}
	
	@RequestMapping(value="/updateCourseSectionInfo",method = RequestMethod.POST)
	public Boolean updateCourseSectionInfo(@RequestBody CourseSectionDto courseSectionDto)
	{
		courseService.updateCourseSectionInfo(courseSectionDto);
		return true;
		
	}
	
	@RequestMapping(value="/insertCourseSectionContent",method = RequestMethod.POST)
	public String insertCourseSectionContent(@RequestBody CourseSectionContentDto courseSectionContentDto)
	{
		Boolean insertCourseSectionContent = courseService.insertCourseSectionContent(courseSectionContentDto);
				
				
		if(insertCourseSectionContent)
		{
			return "CourseSectionContent successfully inserted";
		}
		return "CourseSectionContent failed to get inserted";
		
	}
	
	@RequestMapping(value="/getCourseSectionContent",method = RequestMethod.GET)
	public CourseSectionContent getCourseSectionContent(@RequestBody Long id)
	{
		CourseSectionContent courseSectionContent=courseService.getCourseSectionContent(id);
		return courseSectionContent;
		
	}
	
	@RequestMapping(value="/deleteCourseSectionContent",method = RequestMethod.DELETE)
	public String deleteCourseSectionContent(@RequestBody Long id)
	{
		Boolean deleteCourseSectionContent =courseService.deleteCourseSectionContent(id);
		if(deleteCourseSectionContent)
		{
		return "CourseSectionContent successfully deleted";
		}
		return "Id does not exist ";
		
	}
	
	@RequestMapping(value="/updateCourseSectionContent",method = RequestMethod.POST)
	public Boolean updateCourseSectionContent(@RequestBody CourseSectionContentDto courseSectionContentDto)
	{
		courseService.updateCourseSectionContent(courseSectionContentDto);
		return true;
		
	}

*/
	


}

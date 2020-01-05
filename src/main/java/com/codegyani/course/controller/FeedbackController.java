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

import com.codegyani.course.dto.CourseFeedbackDto;
import com.codegyani.course.entity.CourseFeedback;
import com.codegyani.course.service.FeedbackService;
import com.codegyani.course.service.FeedbackServiceImpl;

@RestController
@RequestMapping("/api/courseMs/feedback")
public class FeedbackController {

	@Autowired
	private FeedbackService feedbackService;
	//Create Rating 
	//Delete Rating 
	//Edit Rating 
	//get Rating
	
	/*
	 * @RequestMapping(value="/createRating",method=RequestMethod.POST) private
	 * ResponseEntity<?> createRating(@RequestBody CourseFeedbackDto feedbackDto){
	 * Boolean available =feedbackService.createRating(feedbackDto);
	 * 
	 * if(available) return new
	 * ResponseEntity<>("Rating Done Successfully",HttpStatus.OK); return new
	 * ResponseEntity<>("Rating Attempt Unsuccessfully",HttpStatus.OK);
	 * 
	 * }
	 */
	@RequestMapping(value="/createCourseFeedback",method=RequestMethod.POST)
	private ResponseEntity<?> createCourseFeedback(@RequestBody CourseFeedbackDto feedbackDto){
		Boolean available = feedbackService.createCourseFeedback(feedbackDto);
		
		if(available)
		return new ResponseEntity<>("Feedback Given Successfully",HttpStatus.OK);
		return new ResponseEntity<>("Feedback Attempt Unsuccessfully",HttpStatus.OK);
		
	}
	@RequestMapping(value="/getCourseFeedback",method=RequestMethod.POST)
	private ResponseEntity<?> getCourseFeedback(){
		List<CourseFeedback> courseFeedback = feedbackService.getCourseFeedback();
		
		if(courseFeedback!=null)
		return new ResponseEntity<>("Rating Done Successfully",HttpStatus.OK);
		return new ResponseEntity<>("Rating Attempt Unsuccessfully",HttpStatus.OK);
		
	}
	@RequestMapping(value="/updateCourseFeedback/{email}",method=RequestMethod.POST)
	private ResponseEntity<?> updateCourseFeedback(@RequestBody CourseFeedbackDto courseFeedbackDto,@PathVariable String email){
		Boolean available=feedbackService.updateCourseFeedback(courseFeedbackDto, email);
		if(available)
		return new ResponseEntity<>("Rating Done Successfully",HttpStatus.OK);
		return new ResponseEntity<>("Rating Attempt Unsuccessfully",HttpStatus.OK);
		
	}
	@RequestMapping(value="/deleteCourseFeedback/{email}",method=RequestMethod.POST)
	private ResponseEntity<?> deleteCourseFeedback(@PathVariable String email){
	Boolean courseFeedback = feedbackService.deleteCourseFeedback(email);
		
		if(courseFeedback!=null)
		return new ResponseEntity<>("Feedback Deleted Successfully",HttpStatus.OK);
		return new ResponseEntity<>("Delition Attempt Unsuccessfully",HttpStatus.OK);
		
	}
	
}

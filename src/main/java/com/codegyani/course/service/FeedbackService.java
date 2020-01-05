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

import com.codegyani.course.dto.CourseFeedbackDto;
import com.codegyani.course.entity.CourseFeedback;

@Service
public interface FeedbackService {
	
	Boolean createCourseFeedback(CourseFeedbackDto courseFeedbackDto);

	List<CourseFeedback> getCourseFeedback();
	Boolean updateCourseFeedback(CourseFeedbackDto courseFeedbackDto,String email);
	Boolean deleteCourseFeedback(String email);
	
	// Boolean createRating(CourseFeedbackDto feedbackDto)

}

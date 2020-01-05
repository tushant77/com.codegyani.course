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

import com.codegyani.course.dto.CourseFeedbackDto;
import com.codegyani.course.entity.Comment;
import com.codegyani.course.entity.CourseFeedback;
import com.codegyani.course.repository.FeedbackRepository;

@Service
public class FeedbackServiceImpl implements FeedbackService {

	@Autowired
	private FeedbackRepository feedbackRepository;
	
	/*//TO-DO
	 * public Boolean createRating(CourseFeedbackDto feedbackDto) {
	 * if(feedbackDto!=null && feedbackRepository.findByRatingIsAvailable(rating))
	 * 
	 * CourseFeedback rating=new CourseFeedback(); feedbackRepository.save(rating);
	 * return null; }
	 */

	public Boolean createCourseFeedback(CourseFeedbackDto courseFeedbackDto) {
		if(courseFeedbackDto!=null)
		{
			CourseFeedback course = new CourseFeedback();
			course.setStudentId(courseFeedbackDto.getStudentId());
			course.setIsLike(courseFeedbackDto.getIsLike());
			course.setEmail(courseFeedbackDto.getEmail());
			course.setRating(courseFeedbackDto.getRating());
			
			//course.setComment(courseFeedbackDto.getComment());
			//course.setCourse(courseFeedbackDto.getCourse());
			//course.setEmail(courseFeedbackDto.getEmail());
//			Comment obj = new Comment();
//			course.setComment(obj);
//			couse.
			
			feedbackRepository.save(course);
			return true;
		}	
		return false;
	}

	public List<CourseFeedback> getCourseFeedback() {
		
		return feedbackRepository.findAll();
	}

	@Override
	public Boolean updateCourseFeedback(CourseFeedbackDto courseFeedbackDto,String email) {
		if(email!=null) {
		CourseFeedback courseFeedback = new CourseFeedback();
		courseFeedback.setStudentId(courseFeedbackDto.getStudentId());
		courseFeedback.setIsLike(courseFeedbackDto.getIsLike());
		courseFeedback.setRating(courseFeedbackDto.getRating());
		//courseFeedback.setComment(courseFeedbackDto.getComment());
		feedbackRepository.save(courseFeedback);
		return true;
		}
		return false;
	}

	@Override
	public Boolean deleteCourseFeedback(String email) {
		
		CourseFeedback course = feedbackRepository.findByEmail(email);
		if (course != null) {
			feedbackRepository.delete(course);
			// instructor.setIsAvailable(false);
			feedbackRepository.save(course);
			return true;
		}
		return false;
	}
}

package com.codegyani.course.repository;
/* Copyright (c) 2019 
 * Company: MyToshika
 * project Name: Code Gyani
 * Module:Course
 * version: 1.0
 * Date: 12/2019
 * author: ALI SNSA
*/
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codegyani.course.entity.CourseFeedback;

@Repository
public interface FeedbackRepository extends JpaRepository<CourseFeedback, Long>{

	CourseFeedback findByRating(Float rating);

	CourseFeedback findByEmail(String email);
	
}

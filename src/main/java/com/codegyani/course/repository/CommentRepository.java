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

import com.codegyani.course.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

	Comment findByEmail(String email);

}

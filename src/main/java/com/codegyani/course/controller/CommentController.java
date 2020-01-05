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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codegyani.course.dto.CommentDto;
import com.codegyani.course.entity.Comment;
import com.codegyani.course.service.CommentService;

@RestController
public class CommentController {

	@Autowired
	private CommentService commentService;
	// Create Comment
	// Delete Comment
	// Edit Comment
	// Get comment

	@RequestMapping(value = "/createComment", method = RequestMethod.POST)
	private ResponseEntity<?> createComment(@RequestBody CommentDto commentDto) {
		Boolean available = commentService.createComment(commentDto);
		if (available)
			return new ResponseEntity<>("Comment created succesfully", HttpStatus.OK);
		return new ResponseEntity<>("Comment can not be created", HttpStatus.OK);
	}

	@RequestMapping(value = "/updateComment/{email}", method = RequestMethod.PUT)
	private ResponseEntity<?> updateComment(@RequestBody CommentDto commentDto, @PathVariable String email) {
		Boolean available = commentService.updateComment(commentDto,email);
		if (available)
			return new ResponseEntity<>("Comment updated succesfully", HttpStatus.OK);
		return new ResponseEntity<>("Comment can not be updated", HttpStatus.OK);
	}

	@RequestMapping(value = "/deleteComment/{email}", method = RequestMethod.DELETE)
	private ResponseEntity<?> deleteComment(@PathVariable String email) {
		Boolean available = commentService.deleteComment(email);
		if (available)
			return new ResponseEntity<>("Comment updated succesfully", HttpStatus.OK);
		return new ResponseEntity<>("Comment can not be updated", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getComment", method = RequestMethod.GET)
	private ResponseEntity<?> getComment() {
		List<Comment> comment = commentService.getComment();
		if (comment !=null)
			return new ResponseEntity<>(comment, HttpStatus.OK);
			return new ResponseEntity<>("Comment can not be Displayed", HttpStatus.OK);
	
	}
}

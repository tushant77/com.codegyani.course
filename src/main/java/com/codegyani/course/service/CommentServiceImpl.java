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

import com.codegyani.course.dto.CommentDto;
import com.codegyani.course.entity.Comment;
import com.codegyani.course.repository.CommentRepository;
@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;

	@Override
	public Boolean createComment(CommentDto commentDto) {

		if (commentDto != null) {
			Comment comment = new Comment();
			comment.setStudentId(commentDto.getStudentId());
			comment.setCommentCommentId(commentDto.getSelfLoopCommentId());
			comment.setStudentId(commentDto.getStudentId());

			commentRepository.save(comment);
			return true;
		}
		return false;
	}

	@Override
	public Boolean updateComment(CommentDto commentDto,String email) {
		
		Comment comment = commentRepository.findByEmail(email);
		
		if (comment != null ) {
			//Comment comment = new Comment();
			comment.setStudentId(commentDto.getStudentId());
			comment.setCommentCommentId(commentDto.getSelfLoopCommentId());
			comment.setStudentId(commentDto.getStudentId());

			commentRepository.save(comment);
			return true;
		}
		return false;
	}
	
	@Override
	public Boolean deleteComment(String email) {
		
		Comment comment = commentRepository.findByEmail(email);
		if (comment != null) {
			commentRepository.delete(comment);
			// instructor.setIsAvailable(false);
			commentRepository.save(comment);
			return true;
		}
		return false;
	}

	@Override
	public List<Comment> getComment() {
		
		return commentRepository.findAll();
		 
	}

}

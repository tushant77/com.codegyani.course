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
import com.codegyani.course.dto.CommentDto;
import com.codegyani.course.entity.Comment;

@Service
public interface CommentService {

	Boolean createComment(CommentDto CommentDto);

	Boolean updateComment(CommentDto commentDto, String email);

	Boolean deleteComment(String email);

	List<Comment> getComment();

}

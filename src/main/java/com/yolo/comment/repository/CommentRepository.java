package com.yolo.comment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yolo.comment.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment,Integer>{

}

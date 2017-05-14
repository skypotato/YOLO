package com.yolo.bucket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yolo.board.domain.Board;

public interface BoardRepository extends JpaRepository<Board,Integer>{

}

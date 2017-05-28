package com.yolo.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

	@RequestMapping("/list")
	public String boardList() {
		
		return "/board/boardList";
	}
	
	@RequestMapping("/write")
	public String boardWrite() {
		
		return "/board/boardWrite";
	}
}

package com.yolo.board.domain;

public enum BoardStatus {

	
	/** 정상 **/
	ON("ON"),
	/** 삭제됨 **/
	DD("DD");
	
	private String description;

	public String getDescription() {
		return description;
	}

	BoardStatus(String description) {
		this.description = description;
	}
}

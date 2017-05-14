package com.yolo.comment.domain;

public enum CommentStatus {


	/** 정상 **/
	ON("ON"),
	/** 삭제됨 **/
	DD("DD");
	
	private String description;

	public String getDescription() {
		return description;
	}

	CommentStatus(String description) {
		this.description = description;
	}
}

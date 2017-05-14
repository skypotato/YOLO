package com.yolo.bucket.domain;

public enum BucketStatus {

	/** 할 것 **/
	TODO("TODO"),
	/** 하는 중 **/
	DOING("DOING"),
	/** 완료 **/
	COMP("COMPT"),
	/** 실패 **/
	FAIL("FAIL");
	
	private String description;

	public String getDescription() {
		return description;
	}

	BucketStatus(String description) {
		this.description = description;
	}
}

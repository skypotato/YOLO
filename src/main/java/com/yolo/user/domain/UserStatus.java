package com.yolo.user.domain;

public enum UserStatus {

	/** 정상 **/
	ON("ON"),
	/** 탈퇴 **/
	DD("DD"),
	/** 만료됨 **/
	EP("EP");
	
	private String description;

	public String getDescription() {
		return description;
	}

	UserStatus(String description) {
		this.description = description;
	}
}

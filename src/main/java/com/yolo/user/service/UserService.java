package com.yolo.user.service;

import com.yolo.user.domain.User;

public interface UserService {

	/**
	 * 유저 저장
	 * @param userId
	 * @param password
	 * @param tel
	 * @param email
	 * @return
	 */
	User saveUser(String userId, String password, String tel, String email);
	
	/**
	 * 유저 정보
	 * @param userNo
	 * @return
	 */
	User userInfo(Integer userNo);
}

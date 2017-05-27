package com.yolo.user.service;

import com.yolo.user.domain.User;
import com.yolo.user.domain.UserStatus;

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
	
	/**
	 * 유저 수정
	 * @param userNo
	 * @param password
	 * @param tel
	 * @param email
	 * @param userstatus
	 * @return
	 */
	User userUpdate(Integer userNo, String password, String tel, String email,UserStatus  userstatus);
	
	/**
	 * id로 유저 찾기
	 * @param userId
	 * @return
	 */
	User searchByUserId(String userId);
}

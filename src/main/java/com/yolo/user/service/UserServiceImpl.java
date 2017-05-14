package com.yolo.user.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yolo.user.domain.User;
import com.yolo.user.domain.UserStatus;
import com.yolo.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	UserRepository userRepository;
	
	/**
	 * 유저 저장
	 */
	@Transactional
	@Override
	public User saveUser(String userId, String password, String tel, String email) {
		
		User user = new User();
		
		try {
			
			user.setUserId(userId);
			user.setPassword(password);
			user.setTel(tel);
			user.setEmail(email);
			user.setRegDate(new Date());
			user.setUserStatus(UserStatus.ON);
			userRepository.save(user);
			
		} catch (Exception e) {
			
			logger.error("### error",e);
			
		}
		
		return user;
	}
	
	/**
	 * 유저 정보
	 */
	@Override
	public User userInfo(Integer userNo) {
		User user = new User();
		
		try {
			user = userRepository.findOne(userNo);
		} catch (Exception e) {
			logger.error("### error",e);
		}
		
		return user;
	}
}

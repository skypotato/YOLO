package com.yolo.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yolo.common.Response;
import com.yolo.user.domain.User;
import com.yolo.user.domain.UserStatus;
import com.yolo.user.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller("/api")
@Api(tags = "UserApi")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	/**
	 * 회원가입
	 * @return
	 */
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation("회원가입")
	public Response userRegist(@RequestParam String userId, @RequestParam String password,
			@RequestParam String tel, @RequestParam String email) {
		
		Response response = new Response();
		
		try {
			logger.debug("### userId = {}, password = {}, tel = {}, email = {}",userId,password,tel,email);
			User user = userService.saveUser(userId, password, tel, email);
			
			response.setStatus(Response.OK);
			response.setMessage("OK");
			response.setData(user);
			
		} catch (Exception e) {
			logger.error("### error",e);
			response.setStatus(Response.SERVER_ERROR);
			response.setMessage("Error !");
		}
		return response;
	}
	
	/**
	 * 유저정보
	 * @return
	 */
	@RequestMapping(value = "/user/{userNo}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation("유저 정보")
	public Response userInfo(@PathVariable Integer userNo) {
		Response response = new Response();
		
		try {
			User user = userService.userInfo(userNo);
			
			if (user != null) {
				response.setStatus(Response.OK);
				response.setMessage("OK");
				response.setData(user);
			} else {
				response.setStatus(Response.WRONG_PARAMETER);
				response.setMessage("존재하지 않는 유저입니다.");
			}
			
		} catch (Exception e) {
			logger.error("### error",e);
			response.setStatus(Response.SERVER_ERROR);
			response.setMessage("Error !");
		}
		return response;
	}
	
	/**
	 * 유저수정
	 * @return
	 */
	@RequestMapping(value = "/user/{userNo}", method = RequestMethod.PUT)
	@ResponseBody
	@ApiOperation("유저수정")
	public Response userUpdate(@PathVariable Integer userNo, @RequestParam String password,
			@RequestParam String tel, @RequestParam String email,@RequestParam String status) {
		
		Response response = new Response();
		try {
			logger.debug("### userNo = {}, password = {}, tel = {}, email = {}",userNo,password,tel,email);
			User user;
			if(status.equals("ON") == true){
				user = userService.userUpdate(userNo, password, tel, email,UserStatus.ON);
			}else{
				user = userService.userUpdate(userNo, password, tel, email,UserStatus.DD);
			}

			response.setStatus(Response.OK);
			response.setMessage("OK");
			response.setData(user);
			
		} catch (Exception e) {
			logger.error("### error",e);
			response.setStatus(Response.SERVER_ERROR);
			response.setMessage("Error !");
		}
		return response;
	}
}

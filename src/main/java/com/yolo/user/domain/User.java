package com.yolo.user.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity(name = "user")
public class User {

	@Id
	@Column(name = "USER_NO")
	@TableGenerator(name = "GEN_USER_NO", allocationSize = 1)
	@GeneratedValue(generator = "GEN_USER_NO", strategy = GenerationType.TABLE)
	private int userNo;
	
	@Column(name = "USER_ID")
	private String userId;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "TEL")
	private String tel;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "REG_DATE")
	private Date regDate;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "USER_STATUS")
	private UserStatus userStatus;

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public UserStatus getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(UserStatus userStatus) {
		this.userStatus = userStatus;
	}

	@Override
	public String toString() {
		return "User [userNo=" + userNo + ", userId=" + userId + ", password=" + password + ", tel=" + tel + ", email="
				+ email + ", regDate=" + regDate + ", userStatus=" + userStatus + "]";
	}
	
}

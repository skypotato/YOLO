package com.yolo.common;

public class Response {

	public static final Integer OK = 200;
	public static final Integer WRONG_REQUEST = 400;
	public static final Integer WRONG_PARAMETER = 402;
	public static final Integer NO_URL = 404;
	public static final Integer NO_PERMISSION = 406;
	public static final Integer SERVER_ERROR = 500;
	public static final Integer CHECKING_SERVER = 600;
	
	private Integer status;
	private String message;
	private Object data;
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Response [status=" + status + ", message=" + message + ", data=" + data + "]";
	}
}

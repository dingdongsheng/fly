package com.cosmos.fly.common;

import java.io.Serializable;

import com.cosmos.fly.common.enums.ResultCodeEnum;

/*
 * Return data structure
 */
public class Result <T> implements Serializable{
	
	/**
	 * Success mark
	 */
	boolean success;
	
	/**
	 * Execute status code
	 */
	int code;
	
	/**
	 * Prompt information,you can display on page
	 */
	String message;
	
	/**
	 * retuan data
	 */
	T data;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public long getCode() {
		return code;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public Result(boolean success, int code, String message, T data) {
		super();
		this.success = success;
		this.code = code;
		this.message = message;
		this.data = data;
	}

	/**
	 * Return data 
	 * @param data
	 * @return
	 */
	public static <T> Result<T> success(T data){
		return new Result<T>(true, ResultCodeEnum.SUCCESS.getCode(), ResultCodeEnum.SUCCESS.getDesc(), data);
	}
	
	
}

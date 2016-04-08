package com.cosmos.fly.common.enums;

public enum ResultCodeEnum {
	
	SUCCESS(1000,"操作成功");
	
	private int code;
	private String desc;
	
	private ResultCodeEnum(int code, String desc){
		this.code = code;
		this.desc = desc;
	}

	public int getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	
}

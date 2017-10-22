package com.service;


public class ServiceProvider {
	
	public String toUpper(String str){
		return blankNull(str).toUpperCase();
	}
	
	public String blankNull(String str){
		if(str == null){
			return "";
		}
		return str;
	}
	
}

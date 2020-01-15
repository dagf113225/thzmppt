package com.lixin.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lixin.demo1.model.Student;

//处理用户的业务请求 

//post,get,put,delete
//返回的数据格式是json格式
@RestController
public class UserController {

	@RequestMapping("/strs")
	public String getStrInfo() {
		System.out.println("UserController  is  getStrInfo  start...");

		String message = "第一个Springboot应用";

		return message;

	}

	@RequestMapping("/stusinfo")
	public Student getStus() {
		System.out.println("UserController  is  getStus  start...");

		Student s = new Student();
		s.setSnum(100);
		s.setSname("王可心");
		s.setSage(20);

		return s;

	}

}

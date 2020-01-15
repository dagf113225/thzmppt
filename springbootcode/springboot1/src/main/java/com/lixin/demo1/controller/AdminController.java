package com.lixin.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AdminController {

	@RequestMapping("/info")
	public String getInfo() {
		System.out.println("AdminController  is gestInfo  start...");
       /**
        * 	  <!-- th模板视图 html -->
		   <dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
        */
		return "userinfo";
	}
	
	@RequestMapping("/stus")
	@ResponseBody
	public String getMessage() {
		System.out.println("AdminController  is gestInfo  start...");

		return "userinfo的json格式";
	}
	

}

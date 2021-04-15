package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {
	
	@RequestMapping("index")
	public Object index(){
		return "hello word;liuyunqing version.v0.7 -merge --v0.8 -v11";

	}
	
	
}

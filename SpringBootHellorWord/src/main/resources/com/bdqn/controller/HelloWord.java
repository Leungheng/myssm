package com.bdqn.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWord {
	
	@RequestMapping("/hello")
	@ResponseBody
	public Map<String,Object> showHellorWord(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("msg", "HelloWrod");
		return map;
	}

}

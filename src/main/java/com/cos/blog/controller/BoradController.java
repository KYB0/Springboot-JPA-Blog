package com.cos.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoradController {

	@GetMapping({"/ ",""})
	public String index() {
		// WEB-INF/views/index.jsp
		return" index";
	}
}


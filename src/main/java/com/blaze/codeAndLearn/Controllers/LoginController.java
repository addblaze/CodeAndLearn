package com.blaze.codeAndLearn.Controllers;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blaze.codeAndLearn.dtos.CommonDTO;

@RestController
@RequestMapping(value = "/LoginController")
public class LoginController {
	
	
	@GetMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public CommonDTO welcomeController() {
		CommonDTO commonDto = new CommonDTO();
		commonDto.set_id("12344");
		return commonDto;
	}

}

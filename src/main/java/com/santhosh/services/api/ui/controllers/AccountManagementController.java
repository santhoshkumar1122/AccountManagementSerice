package com.santhosh.services.api.ui.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountManagementController {
	
	@GetMapping("/status/check")
	public String getAcc(){
		return"account services was called";
	}

}

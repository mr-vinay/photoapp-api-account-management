package com.appsdeveloperblog.photoapp.api.account.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/accounts")
public class AccountsController {
	
	@GetMapping(path="/status")
	public String getStatus() {
		return "Accounts API is UP and Running";
	}

}

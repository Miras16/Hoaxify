package com.hoaxify.hoaxify.user;

import com.hoaxify.hoaxify.error.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.nio.channels.AcceptPendingException;

@RestController
public class LoginController {
	
	@PostMapping("/api/1.0/login")
	void handleLogin() {
		
	}


}

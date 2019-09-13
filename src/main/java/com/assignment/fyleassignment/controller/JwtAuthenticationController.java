package com.assignment.fyleassignment.controller;

import java.util.Date;
import javax.servlet.ServletException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class JwtAuthenticationController {

	private static String jwtToken = "";
	// Set expiration time to 5 days
	private static long expirationTimeInHours = 5 * 24;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("emailId") String emailId, @RequestParam("password") String password)
			throws ServletException {
		return doGenerateToken(emailId);
	}

	private String doGenerateToken(String emailId) {
		long expirationTime = System.currentTimeMillis() + (expirationTimeInHours * 60 * 60 * 1000);
		jwtToken = Jwts.builder().setSubject(emailId).claim("roles", "user").setIssuedAt(new Date())
				.setExpiration(new Date(expirationTime)).signWith(SignatureAlgorithm.HS256, "secretkey").compact();
		return jwtToken;
	}

}
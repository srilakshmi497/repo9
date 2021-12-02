package com.miaozhen.tvdna.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miaozhen.tvdna.core.dao.AuthDAO;

@Service
public class AuthService {

	@Autowired
	private AuthDAO authDAO;
	
	
	
}


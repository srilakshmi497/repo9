package com.miaozhen.tvdna.core.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.miaozhen.tvdna.core.dao.AuthDAO;

@Component
public class AuthDAOImpl implements AuthDAO {
	
	@Autowired@Qualifier("jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
}

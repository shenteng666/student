package com.st.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.st.domain.user;
import com.st.mapper.userMapper;
import com.st.service.registerService;

@Service
public class registerServiceimpl implements registerService {
	@Autowired
	private userMapper usermapper;
	
	@Override
	public void insertUser(user user) {
		// TODO Auto-generated method stub
		 usermapper.insert(user);
	}

}

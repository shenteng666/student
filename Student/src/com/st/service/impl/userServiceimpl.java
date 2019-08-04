package com.st.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.st.domain.user;
import com.st.domain.userExample;
import com.st.domain.userExample.Criteria;
import com.st.mapper.userMapper;
import com.st.service.userService;

@Service
public class userServiceimpl implements userService {

	@Autowired
	private userMapper usermapper;
	//检验用户名是否登陆
	@Override
	public List<user> login() {
//		userExample example=new userExample();
//		Criteria criteria = example.createCriteria();
//		if(user!=null) {
//			if(user.getUsername()!=null) {
//				criteria.andUsernameEqualTo(user.getUsername());
//			}
//			if (user.getPassword()!=null) {
//				criteria.andPasswordEqualTo(user.getPassword());
//			}
//		}
		return usermapper.selectByExample(null);
		
	}

}

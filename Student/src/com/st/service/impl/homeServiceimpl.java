package com.st.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.st.domain.announcement;
import com.st.mapper.announcementMapper;
import com.st.service.homeService;

@Service
public class homeServiceimpl implements homeService {
	@Autowired
	private announcementMapper announcementmapper;
	@Override
	public List<announcement> findAll() {
		return announcementmapper.selectByExample(null);
		
	}

}

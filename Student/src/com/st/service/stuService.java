package com.st.service;

import java.util.List;

import com.st.domain.stu;
import com.st.domain.mydomain.PageResult;

public interface stuService {

	List<stu> findAll();

//	PageResult findPage(int page, int rows);

	void add(stu stu);

	stu findOne(Integer id);
	
	void delete(Integer[] ids);
	
	List<stu> findPage(stu stu);

	void update(stu stu);

	PageResult findPage(int page, int rows);



}

package com.st.service;

import java.util.List;

import com.st.domain.Grade;
import com.st.domain.stu;
import com.st.domain.mydomain.PageResult;

public interface gradeService {

	List<Grade> findAll();

	void add(Grade grade);

	Grade findOne(Integer id);
	
	void delete(Integer[] ids);

	void update(Grade grade);

	List<Grade> search(Grade grade);
	
	PageResult findPage(int page, int rows);
}

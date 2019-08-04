package com.st.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.st.domain.Grade;
import com.st.domain.GradeExample;
import com.st.domain.GradeExample.Criteria;
import com.st.domain.stu;
import com.st.domain.stuExample;
import com.st.domain.mydomain.PageResult;
import com.st.mapper.GradeMapper;
import com.st.service.gradeService;

@Service
public class gradeServiceimpl implements gradeService {
	@Autowired
	private GradeMapper grademapper;
    

	@Override
	public List<Grade> findAll() {
		return grademapper.selectByExample(null);

	}
	
	// 添加
	@Override
	public void add(Grade grade) {
		// TODO Auto-generated method stub
		grademapper.insertSelective(grade);
	}
	
	// 查询一个
	@Override
	public Grade findOne(Integer id) {
		return grademapper.selectByPrimaryKey(id);
	}

	// 修改
	@Override
	public void update(Grade grade) {
		grademapper.updateByPrimaryKey(grade);
	}
	
	// 删除
	@Override
	public void delete(Integer[] ids) {
		for (Integer id : ids) {
			grademapper.deleteByPrimaryKey(id);		
		}
	}


	// 根据条件查询
	@Override
	public List<Grade> search(Grade grade) {
		GradeExample example =new GradeExample();
		Criteria criteria = example.createCriteria();
		//创造条件
		if(grade!=null) {
			if(grade.getName()!=null&grade.getName().length()>0) {
				criteria.andNameLike("%"+grade.getName()+"%");
			}
		}
		List<Grade> list = grademapper.selectByExample(example);
		return list;
	
	}
	//分页查询
	@Override
	public PageResult findPage(int page, int rows) {
		//开启分页
		PageHelper.startPage(page, rows);//paged对应pageNum  rows对应pageSize
		List<Grade> list = grademapper.selectByExample(null);
				
		PageInfo<Grade> pageInfo= new PageInfo<Grade>(list);
		return new PageResult(pageInfo.getTotal(),pageInfo.getList());
	}
}

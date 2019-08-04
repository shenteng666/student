package com.st.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.st.domain.stu;
import com.st.domain.stuExample;
import com.st.domain.stuExample.Criteria;
import com.st.domain.mydomain.PageResult;
import com.st.mapper.stuMapper;
import com.st.service.stuService;
@Service
public class stuServiceimpl implements stuService {
	@Autowired
	private stuMapper stumapper;
	@Override
	public List<stu> findAll() {
		return stumapper.selectByExample(null);
		
	}
	
	public void demo() {
		System.out.println("有对象");
		
	}
	
	//分页查询
	public PageResult findPage(int page, int rows) {
		//开启分页
		PageHelper.startPage(page, rows);//paged对应pageNum  rows对应pageSize
		List<stu> list = stumapper.selectByExample(null);
		
		PageInfo<stu> pageInfo= new PageInfo<stu>(list);
		return new PageResult(pageInfo.getTotal(),pageInfo.getList());
	}

	//添加
	@Override
	public void add(stu stu) {
		stumapper.insertSelective(stu);
		// TODO Auto-generated method stub
		
	}

	//查询一个
	@Override
	public stu findOne(Integer id) {
		 return stumapper.selectByPrimaryKey(id);
	}

	//修改
	@Override
	public void update(stu stu) {
		stumapper.updateByPrimaryKey(stu);	
	}
	
	//删除
	@Override
	public void delete(Integer[] ids) {
		for (Integer id : ids) {
			stumapper.deleteByPrimaryKey(id);		
		}
	}


	//根据条件查询
	@Override
	public List<stu> findPage(stu stu) {
		stuExample example=new stuExample();
		Criteria criteria = example.createCriteria();
		if(stu!=null) {
			if(stu.getName()!=null&stu.getName().length()>0) {
				criteria.andNameLike("%"+stu.getName()+"%");
			}
		}
		List<stu> list = stumapper.selectByExample(example);
		return list;
	
	}

	

}

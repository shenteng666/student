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
		System.out.println("�ж���");
		
	}
	
	//��ҳ��ѯ
	public PageResult findPage(int page, int rows) {
		//������ҳ
		PageHelper.startPage(page, rows);//paged��ӦpageNum  rows��ӦpageSize
		List<stu> list = stumapper.selectByExample(null);
		
		PageInfo<stu> pageInfo= new PageInfo<stu>(list);
		return new PageResult(pageInfo.getTotal(),pageInfo.getList());
	}

	//���
	@Override
	public void add(stu stu) {
		stumapper.insertSelective(stu);
		// TODO Auto-generated method stub
		
	}

	//��ѯһ��
	@Override
	public stu findOne(Integer id) {
		 return stumapper.selectByPrimaryKey(id);
	}

	//�޸�
	@Override
	public void update(stu stu) {
		stumapper.updateByPrimaryKey(stu);	
	}
	
	//ɾ��
	@Override
	public void delete(Integer[] ids) {
		for (Integer id : ids) {
			stumapper.deleteByPrimaryKey(id);		
		}
	}


	//����������ѯ
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

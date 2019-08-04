package com.st.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.domain.stu;
import com.st.domain.mydomain.PageResult;
import com.st.domain.mydomain.Result;
import com.st.service.stuService;
import com.st.service.impl.stuServiceimpl;

@RequestMapping("stu")
@RestController
public class stuController {
	@Autowired
	private stuService stuService;

	
	@RequestMapping("findAll")
	public List<stu> findAll(){
		List<stu> list = stuService.findAll();
		return list;
		
	}
	
	//分页查询
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		PageResult findPage = stuService.findPage(page, rows);
	   return findPage;
	}
	
	//添加
	@RequestMapping("/add")
	public Result add(@RequestBody stu stu){
	    try {
	    	stuService.add(stu);
	        return new Result(true,"成功");
	    } catch (Exception e) {
	        e.printStackTrace();
	        return new Result(false, "失败");
	    }
	}
	
	
	//查询一个
	@RequestMapping("/findOne")
	public stu findOne(Integer id){
	    return stuService.findOne(id);
	}
	
	//修改
	@RequestMapping("update")
	public Result update(@RequestBody stu stu){
	    try {
	    	stuService.update(stu);
	        return new Result(true,"成功");
	    } catch (Exception e) {
	        e.printStackTrace();
	        return new Result(false, "失败");
	    }
	}
	
	//删除
	@RequestMapping("delete")
	public Result delete(Integer[] ids){
	    try {
	    	stuService.delete(ids);
	        return new Result(true,"成功");
	    } catch (Exception e) {
	        e.printStackTrace();
	        return new Result(false, "失败");
	    }
	}
	

	
	//根据条件查询
	@RequestMapping("/search")
	public List<stu> search(@RequestBody stu stu){
	    return stuService.findPage(stu);
	}
	
	
	
}

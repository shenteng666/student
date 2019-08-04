package com.st.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.domain.Grade;
import com.st.domain.stu;
import com.st.domain.mydomain.PageResult;
import com.st.domain.mydomain.Result;
import com.st.service.gradeService;

@RequestMapping("grade")
@RestController
public class gradeController {
	@Autowired
	private gradeService gradeService;
	
	@RequestMapping("findAll")
	public List<Grade> findAll(){
		List<Grade> list=gradeService.findAll();
		return list;
	}
	
	//分页查询
		@RequestMapping("/findPage")
		public PageResult findPage(int page, int rows){
			PageResult findPage = gradeService.findPage(page, rows);
		   return findPage;
		}
	
	//添加
		@RequestMapping("add")
		public Result add(@RequestBody Grade grade){
		    try {
		    	gradeService.add(grade);
		    	System.out.println(grade);
		        return new Result(true,"成功");
		    } catch (Exception e) {
		        e.printStackTrace();
		        return new Result(false, "失败");
		    }
		}
		
		
		//查询一个
		@RequestMapping("findOne")
		public Grade findOne(Integer id){
		    return gradeService.findOne(id);
		}
		
		//修改
		@RequestMapping("update")
		public Result update(@RequestBody Grade grade){
		    try {
		    	gradeService.update(grade);
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
		    	gradeService.delete(ids);
		        return new Result(true,"成功");
		    } catch (Exception e) {
		        e.printStackTrace();
		        return new Result(false, "失败");
		    }
		}
		
		//根据条件查询
		@RequestMapping("/search")
		public List<Grade> search(@RequestBody Grade grade){
			List<Grade> list = gradeService.search(grade);
			for (Grade grade2 : list) {
				System.out.println(grade2);
			}
		    return list;
		}
}

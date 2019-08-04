package com.st.domain.mydomain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author Administrator
 * @date 2019/1/23 16:17
 * @description
 */

public class PageResult implements Serializable {
    private long total;//总记录数
    private List rows;//当前结果页 
    
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	public PageResult(long total, List rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	public PageResult() {
		super();
		// TODO Auto-generated constructor stub
	}
    

    
}

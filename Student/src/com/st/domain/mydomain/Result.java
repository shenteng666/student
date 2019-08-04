package com.st.domain.mydomain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


public class Result implements Serializable {

    private boolean flag;
    private boolean success;
    private String message;


    public Result(boolean success, String message) {
        this.success=success;
        this.flag = success;
        this.message = message;
    }


	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}


	public boolean isFlag() {
		return flag;
	}


	public void setFlag(boolean flag) {
		this.flag = flag;
	}


	public boolean isSuccess() {
		return success;
	}


	public void setSuccess(boolean success) {
		this.success = success;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


}

package com.pretty.ssm.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 用户
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

	private long userId;
	
	private String userName;
	
	private long userPhone;
	
	private Date createTime;
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}

package com.luo.Redis.model;

import java.io.Serializable;

/**
 * user实体类
 * 
 * @author admin
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String userName;
	private String userAge;
	private String userAddress;

	public User() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAge() {
		return userAge;
	}

	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public String toString() {
		return "【ID】:" + id + ",【姓名】：" + userName + ",【年龄】：" + userAge + ",【现居住地址】：" + userAddress;
	}
}

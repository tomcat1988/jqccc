package com.frd.model;
import java.io.Serializable;
import java.util.Date;
/**
 * 用户类
 * @author Administrator
 * 2017年 10月10日 16:00:00
 */

public class UserInfo implements Serializable
{
	
	/**
	 * 序列化版本号
	 */
	private static final long serialVersionUID = -4650114325785735589L;
	
	public Integer id;
	
	public String username;
	
	public String sex;
	
	public String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}

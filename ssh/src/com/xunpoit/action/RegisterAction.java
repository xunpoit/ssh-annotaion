package com.xunpoit.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xunpoit.beans.User;
import com.xunpoit.service.UserService;

public class RegisterAction extends ActionSupport {

	private Integer id;
	private String username;
	private String sex;
	private int age;
	private String address;

	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String execute() throws Exception {
        User user=new User(0,username,sex,age,address);
        userService.addUser(user);
		return SUCCESS;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

package com.xunpoit.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xunpoit.beans.User;
import com.xunpoit.service.UserService;

public class QueryAction extends ActionSupport {
	private UserService userService;

	private int id;

	public void setId(int id) {
		this.id = id;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String execute() throws Exception {
		User user = userService.queryUserById(id);
		System.out.println(user);
		return SUCCESS;
	}
}

package com.sheefee.simple.sso.server.service;

import com.sheefee.simple.sso.client.domain.User;

public interface UserService {
	/**
	 * 根据username和password查找数据库中的用户并返回
	 * 
	 * @param user
	 * @return User
	 */
	public User find(User user);
}
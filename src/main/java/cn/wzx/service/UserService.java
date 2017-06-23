package cn.wzx.service;

import org.springframework.beans.factory.annotation.Autowired;

import cn.wzx.entity.User;
import cn.wzx.mapper.UserMapper;

public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public User findByUsername(String username){
		return userMapper.findByUsername(username);
	}
	public void insertUser(User user){
		userMapper.insertUser(user);
	}

}

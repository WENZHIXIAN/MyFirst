package cn.wzx.mapper;

import cn.wzx.entity.User;

public interface UserMapper {
	
	public User findByUsername(String username);
	public void insertUser(User user);

}

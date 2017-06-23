package cn.wzx.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.wzx.entity.User;
import cn.wzx.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	/**
	 * 
	 * @author  温志贤
	 * @Description 前台用户名查询异步校验。
	 * 
	 * @param username
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("user_findByName.action")
	public void findByUserame(String username,HttpServletResponse response) throws IOException{
		User user= userService.findByUsername(username);
		//System.out.println(user);
		PrintWriter writer=response.getWriter();
		if(user==null){
			writer.write("<front style='color:green'>用户名可用</front>");
			
		}else{
			writer.write("<front style='color:red'>用户名已存在</front>");
		}
		
	}
	
	/**
	 * 
	 * @author  温志贤
	 * @Description 实现注册认证和将用户存储到数据库中。
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping("user_regist.action")
	public String userRegist(User user){
		userService.insertUser(user);
		
		return "index";
	}

}

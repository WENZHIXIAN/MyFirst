package cn.wzx.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.wzx.service.CategoryService;
import cn.wzx.service.ProductService;


/**
 * 
 *@ClassName  IndexController
 *@Description  页面导航的Controller
 *@author 温志贤
 *@data  2017-5-22  下午2:01:36
 */
@Controller
public class IndexController {
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private ProductService productService;
	
	//跳转到主页面
	@RequestMapping("index.action")
	public String gotoIndex(HttpSession session){
		//把一级分类的数据存入session中，这样就不用每次都从数据库查询
		if(session.getAttribute("firstcategorys")==null){
		session.setAttribute("firstcategorys", categoryService.findFirstCategory());
		}
		if(session.getAttribute("hotproducts")==null){
			session.setAttribute("hotproducts", productService.findHotProduct());
		}
		if(session.getAttribute("newproducts")==null){
			session.setAttribute("newproducts", productService.findNewProduct());
		}
		return "index";
	}
	
	//跳转到登录页面
	@RequestMapping("user_loginPage.action")
	public String gotoLoginPage(){
		return "login";
	}
	
	//跳转到注册页面
	@RequestMapping("user_registPage.action")
	public String gotoRegistPage(){
		return "regist";
	}

}

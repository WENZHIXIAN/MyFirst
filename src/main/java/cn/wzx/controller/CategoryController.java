package cn.wzx.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.wzx.service.CategoryService;

/**
 * 
 *@ClassName  CategoryController
 *@Description  分类模块的Controller对象。
 *@author 温志贤
 *@data  2017-5-23  上午11:53:27
 */

@Controller
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	//跳转到二级分类页面
	@RequestMapping("categorySecond.action")
	public String getSecondCategory(HttpSession session){
		return "categorylist";
	}

}

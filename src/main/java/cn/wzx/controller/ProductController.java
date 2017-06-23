package cn.wzx.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.wzx.entity.Product;
import cn.wzx.entity.User;
import cn.wzx.service.ProductService;
@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	/**
	 * 通过商品id查找到商品的详细信息。
	 * */
	@RequestMapping("product_findByPid.action")
	public String findByPid(Integer pid,HttpServletRequest request){
		
		Product product=productService.findByPid(pid);
		request.setAttribute("product", product);		
		return "product";
	}

}

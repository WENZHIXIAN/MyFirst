package cn.wzx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.wzx.entity.Product;
import cn.wzx.mapper.ProductMapper;

public class ProductService {
	@Autowired
	private ProductMapper productMapper;
	
	public List<Product> findHotProduct(){
		return productMapper.findHotProduct();
	}
	public List<Product> findNewProduct(){
		return productMapper.findNewProduct();
	}
	public Product findByPid(Integer pid) {
		// TODO Auto-generated method stub
		return productMapper.findByPid(pid);
	}
	

}

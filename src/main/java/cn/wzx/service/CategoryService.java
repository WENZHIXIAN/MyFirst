package cn.wzx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.wzx.entity.Category;
import cn.wzx.mapper.CategoryMapper;




public class CategoryService {
	@Autowired
	private CategoryMapper categoryMapper;
	
	public List<Category> findFirstCategory(){
		return categoryMapper.findFirstCategory();
	}
	
	
	
}

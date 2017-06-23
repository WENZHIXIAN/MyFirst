package cn.wzx.mapper;

import java.util.List;

import cn.wzx.entity.Category;

/**
 * 
 *@ClassName  CategoryMapper
 *@Description  分类的mapper接口文件。
 *@author 温志贤
 *@data  2017-5-23  上午11:54:49
 */
public interface CategoryMapper {
	
	/**
	 * 
	 * @author  温志贤
	 * @Description 查询所有的一级分类，返回一个所有分类的list集合。
	 * 
	 * @return
	 */
	public List<Category> findFirstCategory();

}

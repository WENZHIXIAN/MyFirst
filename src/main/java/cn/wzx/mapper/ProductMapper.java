package cn.wzx.mapper;

import java.util.List;
import java.util.Map;

import cn.wzx.entity.Product;

public interface ProductMapper {
	
	public List<Product> findHotProduct();
	public List<Product> findNewProduct();
	public Product findByPid(Integer pid);


}

package com.blackyak.b2c.dao;

import com.blackyak.b2c.vo.ProductVo;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.ui.Model;


@Mapper
public interface ProductDao {
	
	List<ProductVo> selectProductList(String prod_cd);	
	
	ProductVo selectProductInfo(Model model);
}

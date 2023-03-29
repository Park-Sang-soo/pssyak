package com.blackyak.b2c.service;

import java.util.List;

import org.springframework.ui.Model;

import com.blackyak.b2c.vo.ProductVo;

public interface ProductService {
	
	List<ProductVo> selectProductList(String prod_cd) throws Exception;
	
	ProductVo selectProductInfo(Model model);;
}

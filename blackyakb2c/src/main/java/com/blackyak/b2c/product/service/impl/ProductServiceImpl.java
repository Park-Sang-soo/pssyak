package com.blackyak.b2c.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackyak.b2c.product.mapper.ProductMapper;
import com.blackyak.b2c.product.service.ProductService;
import com.blackyak.b2c.product.mapper.dto.ProductDto;
import com.blackyak.b2c.product.vo.ProductVo;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductMapper productMapper;
	/*
	@Override
	public List<ProductVo> selectProductList(String prod_cd) {
		return productMapper.selectProductList(prod_cd);
	}
	*/	

	@Override
	public ProductDto selectProductInfo(ProductVo request) {
		return productMapper.selectProductInfo();
	}


}
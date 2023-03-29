package com.blackyak.b2c.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.blackyak.b2c.dao.ProductDao;
import com.blackyak.b2c.service.ProductService;
import com.blackyak.b2c.vo.ProductVo;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao productDao;
	
	@Override
	public List<ProductVo> selectProductList(String prod_cd) {
		return productDao.selectProductList(prod_cd);
	}
	
	
	@Override
	public ProductVo selectProductInfo(Model model) {
		return productDao.selectProductInfo(model);
	}

}
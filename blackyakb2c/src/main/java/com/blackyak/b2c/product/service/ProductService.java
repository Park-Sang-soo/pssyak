package com.blackyak.b2c.product.service;

import com.blackyak.b2c.product.mapper.dto.ProductDto;
import com.blackyak.b2c.product.vo.ProductVo;

public interface ProductService {
	
	//List<ProductVo> selectProductList(String prod_cd) throws Exception;
	
	ProductDto selectProductInfo(ProductVo request);


	//Response selectProductInfo();
}

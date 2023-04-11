package com.blackyak.b2c.product.mapper;

import com.blackyak.b2c.product.mapper.dto.ProductDto;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ProductMapper {
	
	//List<ProductVo> selectProductList(String prod_cd);		
	
	ProductDto selectProductInfo(ProductDto productDto);
}

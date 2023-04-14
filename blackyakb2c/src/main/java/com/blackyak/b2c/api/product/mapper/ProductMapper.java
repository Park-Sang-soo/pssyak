package com.blackyak.b2c.api.product.mapper;

import com.blackyak.b2c.api.product.mapper.dto.ProductDto;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {	
	
	ProductDto selectProductInfo(ProductDto productDto);
}

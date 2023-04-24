package com.blackyak.b2c.common.db.mapper;

import com.blackyak.b2c.common.db.dto.ProductDto;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {	
	
	ProductDto selectProductInfo(ProductDto productDto);
}

package com.blackyak.b2c.api.product.mapper;

import org.mapstruct.Mapper;

import com.blackyak.b2c.api.product.vo.ProductVo;
import com.blackyak.b2c.common.db.entity.ProductInfoEntity;


@Mapper(componentModel = "spring")
public interface ProductInfoMapper { 	
	
	/* TODO : Entity 에서 Vo로 매핑*/
	ProductVo.Response toProductVoResponse(ProductInfoEntity productInfoEntity);
	
	/* TODO : Vo 에서 Entity로 매핑*/
	ProductInfoEntity toProductInfoEntity(ProductVo.Response ProductVo);
	
}

package com.blackyak.b2c.api.product.service;

import org.springframework.stereotype.Service;

import com.blackyak.b2c.common.db.repository.ProductInfoRepository;

import lombok.RequiredArgsConstructor;

import com.blackyak.b2c.common.db.entity.ProductInfoEntity;
import com.blackyak.b2c.common.db.mapper.ProductInfoMapper;
import com.blackyak.b2c.api.product.vo.ProductVo;

/**
 * 제품 상세정보 조회
 * 
 * @param companyCode 회사코드
 * @param productCode 제품코드
 * @param colorCode 칼라코드
 * @param sizeCode 사이즈코드
 * 
 * @return 제품 상세정보 목록
 *
 */

@RequiredArgsConstructor
@Service
public class ProductService {	
	
	private final ProductInfoRepository productInfoRepository;
	
	private final ProductInfoMapper productInfoMapper;
	
	public ProductVo.Response selectProductInfo(ProductVo.Request request) {
				
		ProductInfoEntity productInfo = productInfoRepository.findByCompanyCodeAndProductCodeAndColorCodeAndSizeCode(request.getCompanyCode(), 
																													 request.getProductCode(), 
																													 request.getColorCode(), 
																													 request.getSizeCode());
		ProductVo.Response response = productInfoMapper.ToVo(productInfo);
		
		return response;
	}
}

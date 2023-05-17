package com.blackyak.b2c.api.product.service;

import org.springframework.stereotype.Service;

import com.blackyak.b2c.common.db.repository.ProductInfoRepository;

import lombok.RequiredArgsConstructor;

import com.blackyak.b2c.common.db.entity.ProductInfoEntity;
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
	
	public ProductVo.Response selectProductInfo(ProductVo.Request request) {
				
		ProductInfoEntity productInfo = productInfoRepository.findByCompanyCodeAndProductCodeAndColorCodeAndSizeCode(request.getCompanyCode(), 
																													 request.getProductCode(), 
																													 request.getColorCode(), 
																													 request.getSizeCode());
				
		return ProductVo.Response.builder()
				.companyCode(productInfo.getCompanyCode())				
				.refCompanyCode(productInfo.getRefCompanyCode())
				.goodsGubun(productInfo.getGoodsGubun())
				.brandCode(productInfo.getBrandCode())
				.productCode(productInfo.getProductCode())
				.productName(productInfo.getProductName())
				.productDivision(productInfo.getProductDivision())
				.productDivisionName(productInfo.getProductDivisionName())
				.goodKindCode(productInfo.getGoodKindCode())
				.goodKindName(productInfo.getGoodKindName())
				.planYear(productInfo.getPlanYear())
				.planYearName(productInfo.getPlanYearName())
				.seasonCode(productInfo.getSeasonCode())
				.seasonName(productInfo.getSeasonName())
				.sexDivision(productInfo.getSexDivision())
				.sexDivisionName(productInfo.getSexDivisionName())
				.productLineCode(productInfo.getProductLineCode())
				.productLineName(productInfo.getProductLineName())
				.colorCode(productInfo.getColorCode())
				.colorName(productInfo.getColorName())
				.sizeCode(productInfo.getSizeCode())
				.normalRetailPrice(productInfo.getNormalRetailPrice())
				.madeYymm(productInfo.getMadeYymm())
				.originNativeCode(productInfo.getOriginNativeCode())
				.originNativeName(productInfo.getOriginNativeName())
				.displayOrder(productInfo.getDisplayOrder())
				.productKeyword(productInfo.getProductKeyword())
				.keywordUpdateDate(productInfo.getKeywordUpdateDate())
				.build();
	}
}

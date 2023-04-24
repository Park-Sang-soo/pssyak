package com.blackyak.b2c.api.product.service;

import org.springframework.stereotype.Service;

import com.blackyak.b2c.common.db.mapper.ProductMapper;
import com.blackyak.b2c.common.db.dto.ProductDto;
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
@Service
public class ProductService {	
	
	private static ProductMapper productMapper;

    public ProductService(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }
	
	public static ProductVo.Response selectProductInfo(ProductVo.Request request) {
		
		ProductDto productConditionDto = ProductDto.builder()
				.compCd(request.getCompanyCode())
				.prodCd(request.getProductCode())
				.colrCd(request.getColorCode())
				.sizeCd(request.getSizeCode())
				.build();
		
		ProductDto productResultDto = productMapper.selectProductInfo(productConditionDto);
		
		return ProductVo.Response.builder()
				.companyCode(productResultDto.getCompCd())				
				.refCompanyCode(productResultDto.getRefCompCd())
				.goodsGubun(productResultDto.getGoodsGb())
				.brandCode(productResultDto.getBrndCd())
				.productCode(productResultDto.getProdCd())
				.productName(productResultDto.getProdNm())
				.productDivision(productResultDto.getProdDiv())
				.productDivisionName(productResultDto.getProdDivNm())
				.goodKindCode(productResultDto.getGoodKindCd())
				.goodKindName(productResultDto.getGoodKindNm())
				.planYear(productResultDto.getPlanYear())
				.planYearName(productResultDto.getPlanYearNm())
				.seasonCode(productResultDto.getSesnCd())
				.seasonName(productResultDto.getSesnNm())
				.sexDivision(productResultDto.getSexDiv())
				.sexDivisionName(productResultDto.getSexDivNm())
				.productLineCode(productResultDto.getProdLineCd())
				.productLineName(productResultDto.getProdLineNm())
				.colorCode(productResultDto.getColrCd())
				.colorName(productResultDto.getColrNm())
				.sizeCode(productResultDto.getSizeCd())
				.normalRetailPrice(productResultDto.getNormRtalPrce())
				.madeYymm(productResultDto.getMadeYymm())
				.originNativeCode(productResultDto.getOrigNatCd())
				.originNativeName(productResultDto.getOrigNatNm())
				.displayOrder(productResultDto.getDispOrd())
				.build();
	}
}

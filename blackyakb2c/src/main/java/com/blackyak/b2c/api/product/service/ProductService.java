package com.blackyak.b2c.api.product.service;

import org.springframework.stereotype.Service;

import com.blackyak.b2c.api.product.mapper.ProductMapper;
import com.blackyak.b2c.api.product.mapper.dto.ProductDto;
import com.blackyak.b2c.api.product.vo.ProductVo;

@Service
public class ProductService {	
	
	private static ProductMapper productMapper;

    public ProductService(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }
	
	public static ProductVo.Response selectProductInfo(ProductVo.Request request) {
		
		ProductDto productConditionDto = ProductDto.builder()
				.comp_cd(request.getCompanyCode())
				.prod_cd(request.getProductCode())
				.colr_cd(request.getColorCode())
				.size_cd(request.getSizeCode())
				.build();
		
		ProductDto productResultDto = productMapper.selectProductInfo(productConditionDto);
		
		return ProductVo.Response.builder()
				.companyCode(productResultDto.getComp_cd())				
				.refCompanyCode(productResultDto.getRef_comp_cd())
				.goodsGubun(productResultDto.getGoods_gb())
				.brandCode(productResultDto.getBrnd_cd())
				.productCode(productResultDto.getProd_cd())
				.productName(productResultDto.getProd_nm())
				.productDivision(productResultDto.getProd_div())
				.productDivisionName(productResultDto.getProd_div_nm())
				.goodKindCode(productResultDto.getGood_kind_cd())
				.goodKindName(productResultDto.getGood_kind_nm())
				.planYear(productResultDto.getPlan_year())
				.planYearName(productResultDto.getPlan_year_nm())
				.seasonCode(productResultDto.getSesn_cd())
				.seasonName(productResultDto.getSesn_nm())
				.sexDivision(productResultDto.getSex_div())
				.sexDivisionName(productResultDto.getSex_div_nm())
				.productLineCode(productResultDto.getProd_line_cd())
				.productLineName(productResultDto.getProd_line_nm())
				.colorCode(productResultDto.getColr_cd())
				.colorName(productResultDto.getColr_nm())
				.sizeCode(productResultDto.getSize_cd())
				.normalRetailPrice(productResultDto.getNorm_rtal_prce())
				.madeYymm(productResultDto.getMade_yymm())
				.originNativeCode(productResultDto.getOrig_nat_cd())
				.originNativeName(productResultDto.getOrig_nat_nm())
				.displayOrder(productResultDto.getDisp_ord())
				.build();
				
	}
}

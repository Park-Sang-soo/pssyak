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
				.comp_cd(request.getCompCd())
				.prod_cd(request.getProdCd())
				.colr_cd(request.getColrCd())
				.size_cd(request.getSizeCd())
				.build();
		
		ProductDto productResultDto = productMapper.selectProductInfo(productConditionDto);
		
		return ProductVo.Response.builder()
				.comp_cd(productResultDto.getComp_cd())				
				.ref_comp_cd(productResultDto.getRef_comp_cd())
				.goods_gb(productResultDto.getGoods_gb())
				.brnd_cd(productResultDto.getBrnd_cd())
				.prod_cd(productResultDto.getProd_cd())
				.prod_nm(productResultDto.getProd_nm())
				.prod_div(productResultDto.getProd_div())
				.prod_div_nm(productResultDto.getProd_div_nm())
				.good_kind_cd(productResultDto.getGood_kind_cd())
				.good_kind_nm(productResultDto.getGood_kind_nm())
				.plan_year(productResultDto.getPlan_year())
				.plan_year_nm(productResultDto.getPlan_year_nm())
				.sesn_cd(productResultDto.getSesn_cd())
				.sesn_nm(productResultDto.getSesn_nm())
				.sex_div(productResultDto.getSex_div())
				.sex_div_nm(productResultDto.getSex_div_nm())
				.prod_line_cd(productResultDto.getProd_line_cd())
				.prod_line_nm(productResultDto.getProd_line_nm())
				.colr_cd(productResultDto.getColr_cd())
				.colr_nm(productResultDto.getColr_nm())
				.size_cd(productResultDto.getSize_cd())
				.norm_rtal_prce(productResultDto.getNorm_rtal_prce())
				.made_yymm(productResultDto.getMade_yymm())
				.orig_nat_cd(productResultDto.getOrig_nat_cd())
				.orig_nat_nm(productResultDto.getOrig_nat_nm())
				.disp_ord(productResultDto.getDisp_ord())
				.build();
				
	}
}

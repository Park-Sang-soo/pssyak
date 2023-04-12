package com.blackyak.b2c.product.mapper.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
	
	private String comp_cd;
	private String ref_comp_cd;
	private String goods_gb;
	private String brnd_cd;
	private String prod_cd;
	private String prod_nm;
	private String prod_div;
	private String prod_div_nm;
	private String good_kind_cd;
	private String good_kind_nm;
	private String plan_year;
	private String plan_year_nm;
	private String sesn_cd;
	private String sesn_nm;
	private String sex_div;
	private String sex_div_nm;
	private String prod_line_cd;
	private String prod_line_nm;
	private String colr_cd;
	private String colr_nm;
	private String size_cd;
	private int norm_rtal_prce;
	private String made_yymm;
	private String orig_nat_cd;
	private String orig_nat_nm;
	private int disp_ord; 
}

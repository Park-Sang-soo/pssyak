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
	
	public String comp_cd;
	public String ref_comp_cd;
	public String goods_gb;
	public String brnd_cd;
	public String prod_cd;
	public String prod_nm;
	public String prod_div;
	public String prod_div_nm;
	public String good_kind_cd;
	public String good_kind_nm;
	public String plan_year;
	public String plan_year_nm;
	public String sesn_cd;
	public String sesn_nm;
	public String sex_div;
	public String sex_div_nm;
	public String prod_line_cd;
	public String prod_line_nm;
	public String colr_cd;
	public String colr_nm;
	public String size_cd;
	public int norm_rtal_prce;
	public String made_yymm;
	public String orig_nat_cd;
	public String orig_nat_nm;
	public int disp_ord; 
}

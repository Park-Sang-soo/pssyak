package com.blackyak.b2c.product.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

public class ProductVo {	
			
	@Getter
	@Setter
	@Builder
    @NoArgsConstructor
    @AllArgsConstructor
	public static class Request {
		private String compCd;
		private String prodCd;
		private String colrCd;
		private String sizeCd;
		
	}
	
	@Getter
	@Setter
	@Builder
    @NoArgsConstructor
    @AllArgsConstructor
	public static class Response {
		@JsonProperty(value="compCd")
		private String comp_cd;

		@JsonProperty(value="refCompCd")
		private String ref_comp_cd;

		@JsonProperty(value="goodsGb")
		private String goods_gb;

		@JsonProperty(value="brndCd")
		private String brnd_cd;

		@JsonProperty(value="prodCd")
		private String prod_cd;

		@JsonProperty(value="prodNm")
		private String prod_nm;

		@JsonProperty(value="prodDiv")
		private String prod_div;

		@JsonProperty(value="prodDivNm")
		private String prod_div_nm;
		
		@JsonProperty(value="goodKindCd")
		private String good_kind_cd;

		@JsonProperty(value="goodKindNm")
		private String good_kind_nm;

		@JsonProperty(value="planYear")
		private String plan_year;

		@JsonProperty(value="planYearNm")
		private String plan_year_nm;

		@JsonProperty(value="sesnCd")
		private String sesn_cd;

		@JsonProperty(value="sesnNm")
		private String sesn_nm;

		@JsonProperty(value="sexDiv")
		private String sex_div;

		@JsonProperty(value="sexDivNm")
		private String sex_div_nm;

		@JsonProperty(value="prodLineCd")
		private String prod_line_cd;

		@JsonProperty(value="prodLineNm")
		private String prod_line_nm;

		@JsonProperty(value="colrCd")
		private String colr_cd;

		@JsonProperty(value="colrNm")
		private String colr_nm;

		@JsonProperty(value="sizeCd")
		private String size_cd;

		@JsonProperty(value="normRtalPrce")
		private int norm_rtal_prce;

		@JsonProperty(value="madeYymm")
		private String made_yymm;

		@JsonProperty(value="origNatCd")
		private String orig_nat_cd;

		@JsonProperty(value="origNatNm")
		private String orig_nat_nm;

		@JsonProperty(value="dispOrd")
		private int disp_ord; 
	}

	public static Request Request;

}

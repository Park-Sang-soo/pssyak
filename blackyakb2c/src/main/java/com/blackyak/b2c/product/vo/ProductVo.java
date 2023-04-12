package com.blackyak.b2c.product.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
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
		
		@ApiModelProperty(value = "회사코드")
		private String compCd;		
		
		@ApiModelProperty(value = "제품코드")
		private String prodCd;		
		
		@ApiModelProperty(value = "칼라코드")
		private String colrCd;
		
		@ApiModelProperty(value = "사이즈코드")
		private String sizeCd;
		
	}
	
	@Getter
	@Setter
	@Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Schema(description = "상품상세정보 응답")
	public static class Response {
				
		@JsonProperty(value="compCd")
		@Schema(description = "회사코드", example = "003", required = true)
		private String comp_cd;

		@JsonProperty(value="refCompCd")
		@Schema(description = "회사코드2", example = "003", required = true)
		private String ref_comp_cd;

		@JsonProperty(value="goodsGb")
		@Schema(description = "제상품구분", example = "G", required = true)
		private String goods_gb;

		@JsonProperty(value="brndCd")
		@Schema(description = "브랜드코드", example = "BY", required = true)
		private String brnd_cd;

		@JsonProperty(value="prodCd")
		@Schema(description = "제품코드", example = "ABYSHX3915", required = true)
		private String prod_cd;

		@JsonProperty(value="prodNm")
		@Schema(description = "제품명", example = "343 아크 GTX", required = true)
		private String prod_nm;

		@JsonProperty(value="prodDiv")
		@Schema(description = "제품구분", example = "A", required = true)
		private String prod_div;

		@JsonProperty(value="prodDivNm")
		@Schema(description = "제품구분명", example = "신발", required = true)
		private String prod_div_nm;
		
		@JsonProperty(value="goodKindCd")
		@Schema(description = "품종코드", example = "SH", required = true)
		private String good_kind_cd;

		@JsonProperty(value="goodKindNm")
		@Schema(description = "품종명", example = "신발", required = true)
		private String good_kind_nm;

		@JsonProperty(value="planYear")
		@Schema(description = "기획년도", example = "S", required = true)
		private String plan_year;

		@JsonProperty(value="planYearNm")
		@Schema(description = "기획년도명", example = "2023", required = true)
		private String plan_year_nm;

		@JsonProperty(value="sesnCd")
		@Schema(description = "시즌코드", example = "X", required = true)
		private String sesn_cd;

		@JsonProperty(value="sesnNm")
		@Schema(description = "시즌명", example = "비시즌", required = true)
		private String sesn_nm;

		@JsonProperty(value="sexDiv")
		@Schema(description = "성별구분", example = "U", required = true)
		private String sex_div;

		@JsonProperty(value="sexDivNm")
		@Schema(description = "성별", example = "공용", required = true)
		private String sex_div_nm;

		@JsonProperty(value="prodLineCd")
		@Schema(description = "제품라인", example = "3", required = true)
		private String prod_line_cd;

		@JsonProperty(value="prodLineNm")
		@Schema(description = "제품라인명", example = "ACTIVE TRAIL(신발)", required = true)
		private String prod_line_nm;

		@JsonProperty(value="colrCd")
		@Schema(description = "칼라코드", example = "BE", required = true)
		private String colr_cd;

		@JsonProperty(value="colrNm")
		@Schema(description = "칼라명", example = "BEIGE", required = true)
		private String colr_nm;

		@JsonProperty(value="sizeCd")
		@Schema(description = "사이즈코드", example = "235", required = true)
		private String size_cd;

		@JsonProperty(value="normRtalPrce")
		@Schema(description = "정상소매가", example = "259000", required = true)
		private int norm_rtal_prce;

		@JsonProperty(value="madeYymm")
		@Schema(description = "제조년월", example = "202303", required = true)
		private String made_yymm;

		@JsonProperty(value="origNatCd")
		@Schema(description = "원산지코드", example = "KR", required = true)
		private String orig_nat_cd;

		@JsonProperty(value="origNatNm")
		@Schema(description = "원산지명", example = "국내", required = true)
		private String orig_nat_nm;

		@JsonProperty(value="dispOrd")
		@Schema(description = "표시순서", example = "0", required = true)
		private int disp_ord; 
	}

	//public static Request Request;

}

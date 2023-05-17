package com.blackyak.b2c.api.product.vo;

import java.util.Date;

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
		private String companyCode;		
		
		@ApiModelProperty(value = "제품코드", hidden = true)
		private String productCode;		
		
		@ApiModelProperty(value = "칼라코드")
		private String colorCode;
		
		@ApiModelProperty(value = "사이즈코드")
		private String sizeCode;
		
	}
	
	@Getter
	@Setter
	@Builder
    @NoArgsConstructor
    @AllArgsConstructor
	public static class Response {
				
		@JsonProperty(value="compCd")
		@Schema(description = "회사코드", example = "003", required = true)
		private String companyCode;

		@JsonProperty(value="refCompCd")
		@Schema(description = "회사코드2", example = "003", required = true)
		private String refCompanyCode;

		@JsonProperty(value="goodsGb")
		@Schema(description = "제상품구분", example = "G", required = true)
		private String goodsGubun;

		@JsonProperty(value="brndCd")
		@Schema(description = "브랜드코드", example = "BY", required = true)
		private String brandCode;

		@JsonProperty(value="prodCd")
		@Schema(description = "제품코드", example = "ABYSHX3915", required = true)
		private String productCode;

		@JsonProperty(value="prodNm")
		@Schema(description = "제품명", example = "343 아크 GTX", required = true)
		private String productName;

		@JsonProperty(value="prodDiv")
		@Schema(description = "제품구분", example = "A", required = true)
		private String productDivision;

		@JsonProperty(value="prodDivNm")
		@Schema(description = "제품구분명", example = "신발", required = true)
		private String productDivisionName;
		
		@JsonProperty(value="goodKindCd")
		@Schema(description = "품종코드", example = "SH", required = true)
		private String goodKindCode;

		@JsonProperty(value="goodKindNm")
		@Schema(description = "품종명", example = "신발", required = true)
		private String goodKindName;

		@JsonProperty(value="planYear")
		@Schema(description = "기획년도", example = "S", required = true)
		private String planYear;

		@JsonProperty(value="planYearNm")
		@Schema(description = "기획년도명", example = "2023", required = true)
		private String planYearName;

		@JsonProperty(value="sesnCd")
		@Schema(description = "시즌코드", example = "X", required = true)
		private String seasonCode;

		@JsonProperty(value="sesnNm")
		@Schema(description = "시즌명", example = "비시즌", required = true)
		private String seasonName;

		@JsonProperty(value="sexDiv")
		@Schema(description = "성별구분", example = "U", required = true)
		private String sexDivision;

		@JsonProperty(value="sexDivNm")
		@Schema(description = "성별", example = "공용", required = true)
		private String sexDivisionName;

		@JsonProperty(value="prodLineCd")
		@Schema(description = "제품라인", example = "3", required = true)
		private String productLineCode;

		@JsonProperty(value="prodLineNm")
		@Schema(description = "제품라인명", example = "ACTIVE TRAIL(신발)", required = true)
		private String productLineName;

		@JsonProperty(value="colrCd")
		@Schema(description = "칼라코드", example = "BE", required = true)
		private String colorCode;

		@JsonProperty(value="colrNm")
		@Schema(description = "칼라명", example = "BEIGE", required = true)
		private String colorName;

		@JsonProperty(value="sizeCd")
		@Schema(description = "사이즈코드", example = "235", required = true)
		private String sizeCode;

		@JsonProperty(value="normRtalPrce")
		@Schema(description = "정상소매가", example = "259000", required = true)
		private int normalRetailPrice;

		@JsonProperty(value="madeYymm")
		@Schema(description = "제조년월", example = "202303", required = true)
		private String madeYymm;

		@JsonProperty(value="origNatCd")
		@Schema(description = "원산지코드", example = "KR", required = true)
		private String originNativeCode;

		@JsonProperty(value="origNatNm")
		@Schema(description = "원산지명", example = "국내", required = true)
		private String originNativeName;

		@JsonProperty(value="dispOrd")
		@Schema(description = "표시순서", example = "0", required = true)
		private int displayOrder; 
		
		@JsonProperty(value="prodKeyword")
		@Schema(description = "상품키워드", example = "자켓,고어택스,바람막이", required = true)
		private String productKeyword; 
		
		@JsonProperty(value="keywordUpdtDt")
		@Schema(description = "키워드 업데이트 일자", example = "20230501", required = true)
		private Date keywordUpdateDate; 
	}

}

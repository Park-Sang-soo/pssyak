package com.blackyak.b2c.common.db.dto;

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
	
	private String compCd;
	private String refCompCd;
	private String goodsGb;
	private String brndCd;
	private String prodCd;
	private String prodNm;
	private String prodDiv;
	private String prodDivNm;
	private String goodKindCd;
	private String goodKindNm;
	private String planYear;
	private String planYearNm;
	private String sesnCd;
	private String sesnNm;
	private String sexDiv;
	private String sexDivNm;
	private String prodLineCd;
	private String prodLineNm;
	private String colrCd;
	private String colrNm;
	private String sizeCd;
	private int normRtalPrce;
	private String madeYymm;
	private String origNatCd;
	private String origNatNm;
	private int dispOrd; 
}

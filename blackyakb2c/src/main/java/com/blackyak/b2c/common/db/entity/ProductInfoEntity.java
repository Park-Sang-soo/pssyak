package com.blackyak.b2c.common.db.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "V_MALL_PROD_ALL_INFO")
public class ProductInfoEntity {	

	@Id
	@Column(name = "v_comp_cd", nullable = false)
	private String companyCode;
	
	@Column(name = "v_ref_comp_cd", nullable = false)
	private String refCompanyCode;
	
	@Column(name = "v_goods_gb", length=1, columnDefinition="CHAR", nullable = false)
	private String goodsGubun;
	
	@Column(name = "v_brnd_cd", nullable = false)
	private String brandCode;
	
	@Column(name = "v_prod_cd", nullable = false)
	private String productCode;
	
	@Column(name = "v_prod_nm", nullable = false)
	private String productName;
	
	@Column(name = "v_prod_div", nullable = false)
	private String productDivision;
	
	@Column(name = "v_prod_div_nm", nullable = false)
	private String productDivisionName;
	
	@Column(name = "v_goodKindCd", nullable = false)
	private String goodKindCode;
	
	@Column(name = "v_goodKindNm", nullable = false)
	private String goodKindName;
	
	@Column(name = "v_planYear", nullable = false)
	private String planYear;
	
	@Column(name = "v_planYearNm", nullable = false)
	private String planYearName;
	
	@Column(name = "v_sesnCd", nullable = false)
	private String seasonCode;
	
	@Column(name = "v_sesnNm", nullable = false)
	private String seasonName;
	
	@Column(name = "v_sexDiv", nullable = false)
	private String sexDivision;
	
	@Column(name = "v_sexDivNm", nullable = false)
	private String sexDivisionName;
	
	@Column(name = "v_prodLineCd", nullable = false)
	private String productLineCode;
	
	@Column(name = "v_prodLineNm", nullable = false)
	private String productLineName;
	
	@Column(name = "v_colrCd", nullable = false)
	private String colorCode;
	
	@Column(name = "v_colrNm", nullable = false)
	private String colorName;
	
	@Column(name = "v_sizeCd", nullable = false)
	private String sizeCode;
	
	@Column(name = "v_normRtalPrce", nullable = false)
	private int normalRetailPrice;
	
	@Column(name = "v_madeYymm", nullable = false)
	private String madeYymm;
	
	@Column(name = "v_origNatCd", nullable = false)
	private String originNativeCode;
	
	@Column(name = "v_origNatNm", nullable = false)
	private String originNativeName;
	
	@Column(name = "v_dispOrd", nullable = false)
	private int displayOrder;
	
	@Column(name = "v_prod_keyword", nullable = false)
	private String productKeyword;
	
	@Column(name = "v_keyword_updt_dt", nullable = false)
	private Date keywordUpdateDate;
	
}

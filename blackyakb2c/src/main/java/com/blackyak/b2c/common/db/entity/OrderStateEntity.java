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


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "INF_TSC_ORD_STAT_TMP")
public class OrderStateEntity {	

	@Id
	@Column(name = "eaii_numb", nullable = false)
	private String eaiiNumber;
	
	@Column(name = "eaii_type", nullable = false)
	private String eaiiType;
	
	@Column(name = "eaii_ysno", nullable = false)
	private String eaiiYesNo;
	
	@Column(name = "eaic_date", nullable = false)
	private Date eaicDate;
	
	@Column(name = "eais_date", nullable = false)
	private Date eaisDate;
	
	@Column(name = "comp_cd", nullable = false)
	private String companyCode;
	
	@Column(name = "co_ord_no", nullable = false)
	private String coOrderNo;
	
	@Column(name = "co_seq", nullable = false)
	private String coSequence;
	
	@Column(name = "tran_stat", nullable = false)
	private String transmissionState;
	
	@Column(name = "can_yn", nullable = false)
	private String cancelYn;
	
	@Column(name = "err_nm", nullable = false)
	private String errorName;
}

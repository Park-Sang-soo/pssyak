package com.blackyak.b2c.api.order.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

public class OrderStateVo {	
		
	@Getter
	@Setter
	@Builder
    @NoArgsConstructor
    @AllArgsConstructor
	public static class Request {
		
		@ApiModelProperty(value = "주문번호", hidden = true)
		private String coOrderNo;		
		
		@ApiModelProperty(value = "주문순번")
		private String coSequence;		
		
	}
	
	@Getter
	@Setter
	@Builder
    @NoArgsConstructor
    @AllArgsConstructor
	public static class Response {		
		
		@JsonProperty(value="eaiiNumb")
		@Schema(description = "일련번호", example = "10000020065491", required = true)
		private String eaiiNumber;
		
		@JsonProperty(value="eaiiType")
		@Schema(description = "DML구분", example = "I", required = true)
		private String eaiiType;
		
		@JsonProperty(value="eaiiYsno")
		@Schema(description = "EAI전송구분", example = "Y", required = true)
		private String eaiiYesNo;
		
		@JsonProperty(value="eaicDate")
		@Schema(description = "생성일자", example = "2022/07/25 오전 4:36:37", required = true)
		private Date eaicDate;
		
		@JsonProperty(value="eaisDate")
		@Schema(description = "전송일자", example = "2022/07/26 오전 10:08:51", required = true)
		private Date eaisDate;
		
		@JsonProperty(value="compCd")
		@Schema(description = "회사코드", example = "003", required = true)
		private String companyCode;
		
		@JsonProperty(value="coOrdNo")
		@Schema(description = "주문번호", example = "20230430-03806-B2C", required = true)
		private String coOrderNo;
		
		@JsonProperty(value="coSeq")
		@Schema(description = "주문순번", example = "1", required = true)
		private String coSequence;
		
		@JsonProperty(value="tranStat")
		@Schema(description = "상태값", example = "N01", required = true)
		private String transmissionState;
		
		@JsonProperty(value="canYn")
		@Schema(description = "상태", example = "Y", required = true)
		private String cancelYn;
		
		@JsonProperty(value="errNm")
		@Schema(description = "에러명", example = "오류", required = true)
		private String errorName;
				
	}
}

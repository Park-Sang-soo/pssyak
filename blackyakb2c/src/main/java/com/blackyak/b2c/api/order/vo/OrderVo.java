package com.blackyak.b2c.api.order.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

public class OrderVo {	
			
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
		@Schema(description = "일련번호", example = "10000019757660", required = true)
		private String eaiiNumber;

		@JsonProperty(value="eaiiYsno")
		@Schema(description = "EAI전송구분", example = "Y", required = true)
		private String eaiiYsno;

	}

}

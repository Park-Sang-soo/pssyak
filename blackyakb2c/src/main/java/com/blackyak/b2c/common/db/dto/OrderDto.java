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
public class OrderDto {
	
	private String eaiiNumb;
	private String eaiiYsno;
	private String coOrdNo;
	private String coSeq;
}

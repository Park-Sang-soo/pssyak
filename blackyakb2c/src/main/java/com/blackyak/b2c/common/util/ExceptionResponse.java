package com.blackyak.b2c.common.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class ExceptionResponse {
	
	private String exceptionCode;
    private String exceptionMessage;

}

package com.blackyak.b2c.common.util;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class ExceptionResponse {
	
	private String exceptionCode;
    private String exceptionMessage;
    private List<String> bindMessage; 

}

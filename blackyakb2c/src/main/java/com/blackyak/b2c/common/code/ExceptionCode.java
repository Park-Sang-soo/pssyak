package com.blackyak.b2c.common.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ExceptionCode {
		
	INVALID_REQUEST_PARAMETER("YAK_API_001", "요청 파라미터가 유효하지 않습니다."),	
	METHOD_NOT_ALLOWED("YAK_API_002", "지원하지 않는 HTTP 메소드입니다."),
	NULL_ARGUMENT_PARAMETER("YAK_API_003", "NULL값은 유효하지 않습니다."),
	ILLEGAL_ARGUMENT_PARAMETER("YAK_API_004", "잘못된 인자가 전달되었습니다."),
	ENTITY_NOT_FOUND("YAK_API_005", "[Hibernate]요청된 엔티티를 데이터베이스에서 찾을 수 없습니다.");	
			
	private final String exceptionCode;
    private final String exceptionMessage;      
	
}

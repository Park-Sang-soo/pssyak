package com.blackyak.b2c.api.member;

import javax.persistence.EntityNotFoundException;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("/members")
@Tag(name = "Member", description = "고객 API 정보를 제공하는 Controller 테스트")
public class MemberController {
			
	@Tag(name = "Member")
	@Operation(summary = "고객데이터 조회", description = "고객데이터를 조회하는 API")
	@GetMapping("/member")
	public void testEntityNotFoundException() {
	    
	    throw new EntityNotFoundException();
	}	
	
}

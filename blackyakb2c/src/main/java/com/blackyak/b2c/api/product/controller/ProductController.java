package com.blackyak.b2c.api.product.controller;

import java.time.LocalDateTime;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blackyak.b2c.api.product.service.ProductService;
import com.blackyak.b2c.api.product.vo.ProductVo;
import com.blackyak.b2c.api.product.vo.ProductVo.RequestTest.RequestTestBuilder;
import com.blackyak.b2c.common.util.JsonUtil;
import com.fasterxml.jackson.core.JsonProcessingException;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("/products")
@Tag(name = "Product", description = "상품 API 정보를 제공하는 Controller")
public class ProductController {
		
	private final ProductService productService; 
	
	@Tag(name = "Product")
	@Operation(summary = "제품상세정보조회", description = "제품코드를 받아 제품상세정보를 조회하는 API")
	@GetMapping("/product/{productCode}")
	public ProductVo.Response getProduct(@Parameter(description = "제품코드") 
										 @PathVariable("productCode") 
										 @Size(min= 10) 
										 String productCode, 
										 @Valid ProductVo.Request request){	
							
		request.setProductCode(productCode);		
		ProductVo.Response response = productService.selectProductInfo(request);
				
		return response;
	}		
	
	@Tag(name = "Product")
	@Operation(summary = "상품데이터 생성", description = "상품데이터의 생성을 요청하는 API")
	@PostMapping("/product")
	public String postProduct(@Valid @RequestBody ProductVo.RequestTest requestTest) throws JsonProcessingException{	
				
		String result = JsonUtil.JavaToJson(requestTest);
		
		return result;
	}	
	
	@Tag(name = "Product")
	@Operation(summary = "상품데이터 수정", description = "상품데이터의 수정을 요청하는 API")
	@PutMapping("/product/{productNumber}")
	public String putProduct(@Parameter(description = "상품번호")  
	 						 @PathVariable("productNumber") int productNumber) throws JsonProcessingException{	
		
		LocalDateTime now = LocalDateTime.now();
		
		RequestTestBuilder resultBuilder = ProductVo.RequestTest.builder().deleteGubun("N")
																		.productName("Jacket")
																		.productPrice(10000)
																		.salePrice(5000)
																		.saleStartDate(now)
																		.saleEndDate(now);
		
		String result = JsonUtil.JavaToJson(resultBuilder.build());
		
		return result;
	}	
	
	@Tag(name = "Product")
	@Operation(summary = "상품데이터 삭제", description = "상품데이터의 삭제를 요청하는 API")
	@DeleteMapping("/product/{productNumber}")
	public void deleteProduct(@Parameter(description = "상품번호") 
	 							@PathVariable("productNumber") int productNumber){	
		
		System.out.println("성공"); 
		
	}	
	
}

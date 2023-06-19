package com.blackyak.b2c.api.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blackyak.b2c.api.product.service.ProductService;
import com.blackyak.b2c.api.product.vo.ProductVo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
@Tag(name = "Product", description = "상품 API 정보를 제공하는 Controller")
public class ProductController {
		
	private final ProductService productService;
	
	@Tag(name = "Product")
	@Operation(summary = "제품상세정보조회", description = "제품코드를 받아 제품상세정보를 조회하는 API")
	@GetMapping("/product/{productCode}")
	public ProductVo.Response getProduct(@Parameter(description = "제품코드") 
										 @PathVariable("productCode") String productCode, 
										 ProductVo.Request request){	
							
		request.setProductCode(productCode);		
		ProductVo.Response response = productService.selectProductInfo(request);
				
		return response;		
	}	
}

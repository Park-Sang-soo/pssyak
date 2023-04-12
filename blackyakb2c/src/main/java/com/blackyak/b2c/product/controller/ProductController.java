package com.blackyak.b2c.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blackyak.b2c.product.service.ProductService;
import com.blackyak.b2c.product.vo.ProductVo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController // 해당 클래스를 컨트롤러로 동작하게 한다. 
@RequestMapping("/products")
@Tag(name = "Product", description = "상품 API 정보를 제공하는 Controller")
public class ProductController {
		
	ProductService productService;
	
	/*
	@GetMapping("/product")
	public List<ProductVo> productList(String prod_cd) throws Exception {		
		
		List<ProductVo> productList = productService.selectProductList(prod_cd);
		
		return productList;
	}
	*/			
	
	@Tag(name = "Product")
	@Operation(summary = "제품상세정보조회", description = "제품코드를 받아 제품상세정보를 조회하는 API")
	@ApiResponses({
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "401", description = "BAD REQUEST"),
        @ApiResponse(responseCode = "403", description = "FORBIDDEN"),
        @ApiResponse(responseCode = "404", description = "NOT FOUND"),
        @ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR")
        
	})	
	@GetMapping("/product/{prodCd}") //@Parameter(description = "제품코드", required = true) 
	public ProductVo.Response getProduct(@Parameter(description = "제품코드") @PathVariable("prodCd") String prodCd, ProductVo.Request request){		
					
		request.setProdCd(prodCd);
		ProductVo.Response response = ProductService.selectProductInfo(request);
				
		return response;		
	}
	
	
}

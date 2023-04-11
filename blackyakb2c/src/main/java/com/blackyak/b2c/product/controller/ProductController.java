package com.blackyak.b2c.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blackyak.b2c.product.service.ProductService;
import com.blackyak.b2c.product.vo.ProductVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "product", description = "상품 API 정보를 제공하는 Controller")
@RestController // 해당 클래스를 컨트롤러로 동작하게 한다. 
@RequestMapping("/products")
public class ProductController {
		
	ProductService productService;
	
	/*
	@GetMapping("/product")
	public List<ProductVo> productList(String prod_cd) throws Exception {		
		
		List<ProductVo> productList = productService.selectProductList(prod_cd);
		
		return productList;
	}
	*/	
	
	@ApiOperation(value = "제품상세정보조회", notes = "제품상세정보를 조회합니다.")
	@GetMapping("/product/{prodCd}")
	public ProductVo.Response getProduct(@PathVariable("prodCd") String prodCd, ProductVo.Request request){
	//public ProductVo.Response getProduct(ProductVo.Request request){
					
		request.setProdCd(prodCd);
		ProductVo.Response response = ProductService.selectProductInfo(request);
				
		return response;		
	}
	
	
}

package com.blackyak.b2c.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blackyak.b2c.service.ProductService;
import com.blackyak.b2c.vo.ProductVo;

//import com.blackyak.b2c.vo.ProductJsonVo;

@RestController // 해당 클래스를 컨트롤러로 동작하게 한다. 
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/product")
	public List<ProductVo> productList(String prod_cd) throws Exception {		
		
		List<ProductVo> productList = productService.selectProductList(prod_cd);
		
		return productList;
	}
	
	
	@GetMapping("/product-info")
	public ProductVo productInfo( 
			@RequestParam(value="prod_cd", required=false, defaultValue="") String prod_cd,
			@RequestParam(value="colr_cd", required=false, defaultValue="") String colr_cd,
			@RequestParam(value="size_cd", required=false, defaultValue="") String size_cd,
			Model model) throws Exception {		
		
		model.addAttribute("prod_cd", prod_cd);
		model.addAttribute("colr_cd", colr_cd);
		model.addAttribute("size_cd", size_cd);
		
		ProductVo productInfo = productService.selectProductInfo(model);
				
		return productInfo;
	
	}
}

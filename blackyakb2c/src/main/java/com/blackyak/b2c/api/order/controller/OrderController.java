package com.blackyak.b2c.api.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blackyak.b2c.api.order.service.OrderService;
import com.blackyak.b2c.api.order.vo.OrderVo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/orders")
@Tag(name = "Order", description = "주문 API 정보를 제공하는 Controller")
public class OrderController {
		
	OrderService orderService;			
	
	@Tag(name = "Order")
	@Operation(summary = "주문 중복체크", description = "주문번호를 받아 주문을 중복체크하는 API")
	@GetMapping("/order/{coOrderNo}")
	public OrderVo.Response getProduct(@Parameter(description = "주문번호") 
										 @PathVariable("coOrderNo") String coOrderNo, 
										 OrderVo.Request request){		
					
		request.setCoOrderNo(coOrderNo);
		OrderVo.Response response = OrderService.selectOrderCheck(request);
				
		return response;		
	}
	
	
}

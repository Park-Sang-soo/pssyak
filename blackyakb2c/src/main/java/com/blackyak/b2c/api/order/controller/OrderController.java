package com.blackyak.b2c.api.order.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blackyak.b2c.api.order.service.OrderService;
import com.blackyak.b2c.api.order.vo.OrderStateVo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
@Tag(name = "Order", description = "JPA로 주문상태 API 정보를 제공하는 Controller")
public class OrderController {
		
	private final OrderService orderService;		
	
	@Tag(name = "Order")
	@Operation(summary = "주문상태체크", description = "주문번호를 받아 주문상태값을 체크하는 API")
	@GetMapping("/orderstate/{coOrderNo}")
	public List<OrderStateVo.Response> getOrderState(@Parameter(description = "주문번호") 
												     @PathVariable("coOrderNo") String coOrderNo, 
												     OrderStateVo.Request request){	
		
		List<OrderStateVo.Response> Response = orderService.findOrderState(request);
					
		return Response;
	}	
}

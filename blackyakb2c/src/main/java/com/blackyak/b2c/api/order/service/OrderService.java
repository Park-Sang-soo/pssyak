package com.blackyak.b2c.api.order.service;

import org.springframework.stereotype.Service;

import com.blackyak.b2c.common.db.mapper.OrderMapper;
import com.blackyak.b2c.common.db.dto.OrderDto;
import com.blackyak.b2c.api.order.vo.OrderVo;

/**
 * 주문번호 중복체킄 위한 로직
 * 
 * @param coOrderNo 주문번호
 * @param coSequence 주문순번
 * 
 * @return 일련번호, 전송정보
 *
 */
@Service
public class OrderService {	
	
	private static OrderMapper orderMapper;

    public OrderService(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }
	
	public static OrderVo.Response selectOrderCheck(OrderVo.Request request) {
		
		OrderDto orderConditionDto = OrderDto.builder()
				.coOrdNo(request.getCoOrderNo())
				.coSeq(request.getCoSequence())
				.build();
		
		OrderDto productResultDto = orderMapper.selectOrderCheck(orderConditionDto);
		
		return OrderVo.Response.builder()
				.eaiiNumber(productResultDto.getEaiiNumb())				
				.eaiiYsno(productResultDto.getEaiiYsno())
				.build();
	}
}

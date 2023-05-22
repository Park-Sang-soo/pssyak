package com.blackyak.b2c.api.order.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blackyak.b2c.common.db.entity.OrderStateEntity;
import com.blackyak.b2c.common.db.repository.OrderStateRepository;

import lombok.RequiredArgsConstructor;

import com.blackyak.b2c.api.order.mapper.OrderStateMapper;
import com.blackyak.b2c.api.order.vo.OrderStateVo;

/**
 * 주문 상태(findOrderState)
 * 
 * @param coOrderNo 주문번호
 * @param coSequence 주문순번
 * 
 * @return 주문상태 리스트
 *
 */

@RequiredArgsConstructor
@Service
public class OrderService {	
		
	private final OrderStateRepository orderStateRepository;
	
	private final OrderStateMapper orderStateMapper;
	
	public List<OrderStateVo.Response> findOrderState(OrderStateVo.Request request) {
		
		List<OrderStateEntity> orderStateList = orderStateRepository.findByCoOrderNoAndCoSequence(request.getCoOrderNo(), request.getCoSequence());		
		
		List<OrderStateVo.Response> response = orderStateMapper.toOrderStateVoResponse(orderStateList);
		
		return response;		
    }
	
}

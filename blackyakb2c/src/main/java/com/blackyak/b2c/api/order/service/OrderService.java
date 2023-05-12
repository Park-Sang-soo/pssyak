package com.blackyak.b2c.api.order.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.blackyak.b2c.common.db.entity.OrderStateEntity;
import com.blackyak.b2c.common.db.repository.OrderStateRepository;

import lombok.RequiredArgsConstructor;

import com.blackyak.b2c.api.order.vo.OrderStateVo;

@RequiredArgsConstructor
@Service
public class OrderService {	
		
	private final OrderStateRepository orderStateRepository;
	
	public List<OrderStateVo.Response> findOrderState(OrderStateVo.Request request) {
		
		List<OrderStateEntity> orderStateList = orderStateRepository.findByCoOrderNoAndCoSequence(request.getCoOrderNo(), request.getCoSequence());		
		
		List<OrderStateVo.Response> responseList = orderStateList.stream()
											        .map(OrderStateEntity -> {
											            OrderStateVo.Response response = new OrderStateVo.Response();
											            response.setEaiiNumber(OrderStateEntity.getEaiiNumber());
											            response.setEaiiType(OrderStateEntity.getEaiiType());
											            response.setEaiiYesNo(OrderStateEntity.getEaiiYesNo());
											            response.setEaicDate(OrderStateEntity.getEaicDate());
											            response.setEaisDate(OrderStateEntity.getEaisDate());
											            response.setCompanyCode(OrderStateEntity.getCompanyCode());
											            response.setCoOrderNo(OrderStateEntity.getCoOrderNo());
											            response.setCoSequence(OrderStateEntity.getCoSequence());
											            response.setTransmissionState(OrderStateEntity.getTransmissionState());
											            response.setCancelYn(OrderStateEntity.getCancelYn());
											            response.setErrorName(OrderStateEntity.getErrorName());
											            return response;
											        })
											        .collect(Collectors.toList());
		return responseList;
    }
	
}

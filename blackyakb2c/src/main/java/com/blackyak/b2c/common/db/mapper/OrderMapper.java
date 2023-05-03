package com.blackyak.b2c.common.db.mapper;

import com.blackyak.b2c.common.db.dto.OrderDto;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {	
	
	OrderDto selectOrderCheck(OrderDto orderDto);
}

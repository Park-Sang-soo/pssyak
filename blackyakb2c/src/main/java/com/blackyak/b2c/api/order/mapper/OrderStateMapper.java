package com.blackyak.b2c.api.order.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.blackyak.b2c.api.order.vo.OrderStateVo;
import com.blackyak.b2c.common.db.entity.OrderStateEntity;


@Mapper(componentModel = "spring")
public interface OrderStateMapper { 	
	
	// Entity 에서 Vo로 매핑
	List<OrderStateVo.Response> toOrderStateVoResponse(List<OrderStateEntity> orderStateEntity);
	
	// Vo 에서 Entity로 매핑
	List<OrderStateEntity> toOrderStateEntity(List<OrderStateVo.Response> orderStateVo);
	
}

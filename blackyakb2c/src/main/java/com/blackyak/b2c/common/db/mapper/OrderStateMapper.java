package com.blackyak.b2c.common.db.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.blackyak.b2c.api.order.vo.OrderStateVo;
import com.blackyak.b2c.common.db.entity.OrderStateEntity;


@Mapper(componentModel = "spring")
public interface OrderStateMapper { 	
	
	/* TODO : Entity 에서 Vo로 매핑*/
	List<OrderStateVo.Response> ToVo(List<OrderStateEntity> orderStateEntity);
	
	/* TODO : Vo 에서 Entity로 매핑*/
	List<OrderStateEntity> VoToEntity(List<OrderStateVo.Response> orderStateVo);
	
}

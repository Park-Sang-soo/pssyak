package com.blackyak.b2c.common.db.repository;

import com.blackyak.b2c.common.db.entity.OrderStateEntity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderStateRepository extends JpaRepository<OrderStateEntity, String> {
	
	List<OrderStateEntity> findByCoOrderNoAndCoSequence(String coOrderNo, String coSequence);
		
	//long totalCount(String coOrderNo, String coSequence);
	
}

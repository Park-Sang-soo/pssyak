package com.blackyak.b2c.common.db.repository;

import com.blackyak.b2c.common.db.entity.ProductInfoEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInfoRepository extends JpaRepository<ProductInfoEntity, String> {
		
	ProductInfoEntity findByCompanyCodeAndProductCodeAndColorCodeAndSizeCode(String compayCode, String productCode, String colorCode, String sizeCode);
			
}


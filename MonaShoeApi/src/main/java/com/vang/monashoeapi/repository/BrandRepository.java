package com.vang.monashoeapi.repository;

import com.vang.monashoeapi.entities.Brands;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BrandRepository extends JpaRepository<Brands, Integer> {
    
}

package com.example.nagoyameshi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nagoyameshi.entity.Shop;
public interface ShopRepository extends JpaRepository<Shop, Integer> {

}

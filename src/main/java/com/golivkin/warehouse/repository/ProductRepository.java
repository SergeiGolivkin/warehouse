package com.golivkin.warehouse.repository;

import com.golivkin.warehouse.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}

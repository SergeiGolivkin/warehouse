package com.golivkin.warehouse.service;


import com.golivkin.warehouse.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<Product> findAll();

    Product findById(Long id);

    void deleteById(Long id);

    void save(Product product);
}

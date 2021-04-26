package com.golivkin.warehouse.service.impl;

import com.golivkin.warehouse.model.Product;
import com.golivkin.warehouse.repository.ProductRepository;
import com.golivkin.warehouse.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    public final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {

        Product product = null;
        Optional<Product> optional = productRepository.findById(id);
        if (optional.isPresent()){
            product = optional.get();
        }
        return product;
    }

    @Override
    public void deleteById(Long id) {

        productRepository.deleteById(id);
    }

    @Override
    public void save(Product product) {

        productRepository.save(product);
    }

}

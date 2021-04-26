package com.golivkin.warehouse.controller;


import com.golivkin.warehouse.model.Product;
import com.golivkin.warehouse.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> showAllProducts(){

        return productService.findAll();
    }

    @GetMapping("/products/{id}")
    public Product  getProduct(@PathVariable Long id){
        return productService.findById(id);
    }

    @PostMapping("/products")
    public Product addNewProduct(@RequestBody Product product){
        productService.save(product);
        return product;
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product){
        productService.save(product);
        return product;
    }

    @DeleteMapping("/products/{id}")
    public void deleteProductById(@PathVariable Long id){

        productService.deleteById(id);
    }
}

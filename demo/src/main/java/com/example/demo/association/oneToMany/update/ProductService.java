package com.example.demo.association.oneToMany.update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void updateProduct() {
        Product product = new Product();
        product.setProductId(1000);
        product.setProductName("Refrigerator");
        productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}

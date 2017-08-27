package com.example.demo.association.manyToOne.unidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired private ProductRepository productRepository;
    public void createProduct() {
        Product product = new Product();
        product.setProductId(100);
        product.setProductName("TV");
        Supplier supplier = new Supplier();
        supplier.setSupplierId(1000);
        product.setSupplier(supplier);
        productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}

package com.example.demo.association.oneToMany.update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional
public class SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;

    @Autowired
    private ProductRepository productRepository;

    public void createSupplier(){
        Supplier supplier = new Supplier();
        supplier.setSupplierId(100);
        Product product = new Product();
        product.setProductId(1000);
        product.setProductName("TV");
        productRepository.save(product);
        supplier.setProducts(Arrays.asList(product));
        supplierRepository.save(supplier);
    }

    public List<Supplier> getAllSuppliers() {
        return supplierRepository.getSuppliersByFetch();
    }

    public void deleteSupplier() {
        supplierRepository.deleteAll();
    }
}

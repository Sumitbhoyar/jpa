package com.example.demo.association.manyToOne.bidirectional;

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

    public void createSupplier(){
        Supplier supplier = new Supplier();
        supplier.setSupplierId(100);
        Product product = new Product();
        product.setProductId(1000);
        product.setProductName("TV");
        product.setSupplier(supplier);
        supplier.setProducts(Arrays.asList(product));
        supplierRepository.save(supplier);
    }

    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }
}

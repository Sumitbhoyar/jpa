package com.example.demo.association.oneToMany.unidirectional;

import javax.persistence.*;
import java.util.List;

@Entity
public class Supplier {
    @Id
    private Integer supplierId;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="supplier_id")
    private List<Product> products;

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId=" + supplierId +
                '}';
    }
}

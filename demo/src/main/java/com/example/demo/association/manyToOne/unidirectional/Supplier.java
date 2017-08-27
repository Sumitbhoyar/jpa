package com.example.demo.association.manyToOne.unidirectional;

import javax.persistence.*;
import java.util.List;

@Entity
public class Supplier {
    @Id
    private Integer supplierId;

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId=" + supplierId +
                '}';
    }
}

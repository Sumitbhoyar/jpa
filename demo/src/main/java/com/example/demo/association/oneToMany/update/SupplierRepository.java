package com.example.demo.association.oneToMany.update;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
    @Query("select supplier from Supplier supplier left join fetch supplier.products")
    List<Supplier> getSuppliersByFetch();
}

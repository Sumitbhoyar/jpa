package com.example.demo.association.manyToOne.bidirectional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);

		SupplierService supplierService = applicationContext.getBean(SupplierService.class);

		supplierService.createSupplier();
		List<Supplier> allSuppliers = supplierService.getAllSuppliers();
		System.out.println(allSuppliers);
		System.out.println(allSuppliers.get(0).getProducts());

	}

}

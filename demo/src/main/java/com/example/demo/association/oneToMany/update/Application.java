package com.example.demo.association.oneToMany.update;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);

		SupplierService supplierService = applicationContext.getBean(SupplierService.class);
		ProductService productService = applicationContext.getBean(ProductService.class);
		supplierService.createSupplier();
		System.out.println(productService.getAllProducts());
//		supplierService.deleteSupplier();
		productService.updateProduct();
		System.out.println(productService.getAllProducts());
	}
}

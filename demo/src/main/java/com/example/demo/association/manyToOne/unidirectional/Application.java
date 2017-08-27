package com.example.demo.association.manyToOne.unidirectional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);

		ProductService productService = applicationContext.getBean(ProductService.class);

		productService.createProduct();
		List<Product> products = productService.getAllProducts();
		System.out.println(products);
		System.out.println(products.get(0).getSupplier());

	}
}

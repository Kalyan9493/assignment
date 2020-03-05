package com.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.service.ProductService;

@RestController
public class ProductController{

	@Autowired
	ProductService productService;
	Product product;
	
	@PostMapping("/addproduct")
	public void saveProducts(@RequestBody Product product) {

		productService.saveProduct(product);
	}
	@GetMapping("/getproduct/{id}")
	public Optional<Product> getProduct(@PathVariable("id") Long pid) {
		return productService.getProduct(pid);
	}
	@GetMapping("/listproduct")
	public List<Product> productlist() {

		List<Product> products = productService.listOfProducts();
		return products;
	}

}

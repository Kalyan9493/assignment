package com.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.product.entity.Product;

@Service
public interface ProductService {

	public void saveProduct(Product product);

	public Optional<Product> getProduct(Long pid);

	public List<Product> listOfProducts();

}

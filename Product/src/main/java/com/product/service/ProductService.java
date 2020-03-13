package com.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.product.entity.Product;

@Service
public interface ProductService {

	public Product saveProduct(Product product);

	public Product getProduct(Long pid);

	public void deleteProduct(Long pid);

	List<Product> listOfProducts(String os,String catagory);

}

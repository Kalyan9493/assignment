package com.product.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repository.ProductRepository;
import com.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);

	}

	@Override
	public Product getProduct(Long pid) {
		return productRepository.findById(pid).orElse(new Product());
	}

	public List<Product> listOfProducts(String os, String catagory) {
		if (os != "" && catagory != "") {
			return productRepository.findByCatagoryAndOs(os, catagory);
		} else if (os != "" || catagory != "") {
			return productRepository.findByCatagoryOrOs(os, catagory);
		} else {
			return productRepository.findAll();
		}
	}

	@Override
	public void deleteProduct(Long pid) {

		productRepository.deleteById(pid);
	}
}
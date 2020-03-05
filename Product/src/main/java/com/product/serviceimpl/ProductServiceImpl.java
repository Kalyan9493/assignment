package com.product.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repository.ProductRepository;
import com.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

	@Override
	public void saveProduct(Product product) {
		productRepository.save(product);
		
	}

	@Override
	public Optional<Product> getProduct(Long pid) {
		
		return productRepository.findById(pid);
	}

	@Override
	public List<Product> listOfProducts() {
		
		return productRepository.findAll();
	}
}

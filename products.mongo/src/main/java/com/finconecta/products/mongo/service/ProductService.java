package com.finconecta.products.mongo.service;

import java.util.List;

import com.finconecta.products.mongo.model.Product;

public interface ProductService {

	Product createProduct(Product product);

	Product updateProduct(Product product);

	List<Product> getAllProduct();

	Product getProductById(long productId);

	void deleteProduct(long id);
}

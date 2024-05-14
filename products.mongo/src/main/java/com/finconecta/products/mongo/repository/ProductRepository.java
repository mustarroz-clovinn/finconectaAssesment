package com.finconecta.products.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.finconecta.products.mongo.model.Product;

public interface ProductRepository extends MongoRepository<Product, Long> {

}

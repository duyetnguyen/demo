package com.finalproject.demo.models;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, String> {
}

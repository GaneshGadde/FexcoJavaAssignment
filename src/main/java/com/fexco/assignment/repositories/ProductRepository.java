package com.fexco.assignment.repositories;

import org.springframework.data.repository.CrudRepository;

import com.fexco.assignment.domain.Product;


public interface ProductRepository extends CrudRepository<Product, Long> {
}

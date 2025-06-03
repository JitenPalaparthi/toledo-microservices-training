package com.spanlet.cruddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spanlet.cruddemo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
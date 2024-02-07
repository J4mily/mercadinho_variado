package com.devfree.mercadinho.repositories;

import com.devfree.mercadinho.entities.Product;
import com.devfree.mercadinho.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAll();
}
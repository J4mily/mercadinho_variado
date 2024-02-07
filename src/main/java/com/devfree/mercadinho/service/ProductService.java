package com.devfree.mercadinho.service;

import com.devfree.mercadinho.entities.Product;
import com.devfree.mercadinho.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    public ProductRepository productRepository;
//    public Product buscar(Integer id){
//        Optional<Product> obj = productRepository.findById();
//        return obj.orElse(null);
//    }

    public ArrayList<Product> buscarTodos(){
        ArrayList<Product> produtos = (ArrayList<Product>) productRepository.findAll();;
        return produtos;
    }


}

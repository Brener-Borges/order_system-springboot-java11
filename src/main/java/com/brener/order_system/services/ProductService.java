package com.brener.order_system.services;

import com.brener.order_system.entities.Product;
import com.brener.order_system.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findBy(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}

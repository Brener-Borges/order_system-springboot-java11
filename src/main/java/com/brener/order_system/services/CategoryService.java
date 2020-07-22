package com.brener.order_system.services;

import com.brener.order_system.entities.Category;
import com.brener.order_system.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findBy(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}

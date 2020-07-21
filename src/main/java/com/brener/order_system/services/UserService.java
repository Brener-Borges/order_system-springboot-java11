package com.brener.order_system.services;

import com.brener.order_system.entities.User;
import com.brener.order_system.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findBy(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

}

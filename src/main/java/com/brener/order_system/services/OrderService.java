package com.brener.order_system.services;

import com.brener.order_system.entity.Order;
import com.brener.order_system.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findBy(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}

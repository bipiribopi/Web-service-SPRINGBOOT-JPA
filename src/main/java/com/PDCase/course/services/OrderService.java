package com.PDCase.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PDCase.course.entities.Order;
import com.PDCase.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	public List<Order> findAll(){	
		return orderRepository.findAll();
	}
	
	public Order findById(Long id){
		Optional<Order> obj = orderRepository.findById(id);
		return obj.get();
	}
}

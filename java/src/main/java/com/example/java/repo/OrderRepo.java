package com.example.java.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.java.entity.Order;
import com.example.java.entity.User;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {
	
	public List<Order> findByUser(User user);

}
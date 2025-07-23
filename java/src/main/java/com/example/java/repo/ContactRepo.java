package com.example.java.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.java.entity.Message;

public interface ContactRepo extends JpaRepository<Message, Long> {

}
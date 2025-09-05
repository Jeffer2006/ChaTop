package com.example.rentals_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rentals_backend.entity.MessageEntity;

public interface MessageRepository extends JpaRepository<MessageEntity, Long> {

}

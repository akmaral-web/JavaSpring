package com.example.webapplication.repository;

import com.example.webapplication.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Integer> {

}

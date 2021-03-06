package com.codingdojo.beltreview.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.beltreview.models.Message;

@Repository
public interface MessageRepo extends CrudRepository <Message, Long>{

}
package com.codingdojo.beltreview.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.beltreview.models.Event;


@Repository
public interface EventRepo extends CrudRepository <Event, Long> {

}
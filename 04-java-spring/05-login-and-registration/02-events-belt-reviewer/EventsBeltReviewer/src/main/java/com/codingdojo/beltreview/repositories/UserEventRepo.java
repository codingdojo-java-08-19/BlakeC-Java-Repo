package com.codingdojo.beltreview.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.beltreview.models.UserEvent;

@Repository
public interface UserEventRepo extends CrudRepository<UserEvent, Long> {

}
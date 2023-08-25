package com.ep.mongobaseproject.repository;

import com.ep.mongobaseproject.model.Base;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseRepository extends MongoRepository<Base, String> {}

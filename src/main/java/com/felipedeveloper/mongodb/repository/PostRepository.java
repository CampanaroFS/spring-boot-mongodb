package com.felipedeveloper.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.felipedeveloper.mongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
	

}
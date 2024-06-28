package com.braiansilva.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.braiansilva.workshopmongo.dto.CommentDTO;

@Repository
public interface CommentRepository extends MongoRepository<CommentDTO, String>{

}

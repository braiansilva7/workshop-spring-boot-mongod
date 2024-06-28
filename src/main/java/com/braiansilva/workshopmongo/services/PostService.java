package com.braiansilva.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.braiansilva.workshopmongo.domain.Post;
import com.braiansilva.workshopmongo.domain.User;
import com.braiansilva.workshopmongo.dto.UserDTO;
import com.braiansilva.workshopmongo.repositories.PostRepository;
import com.braiansilva.workshopmongo.repositories.UserRepository;
import com.braiansilva.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	

}

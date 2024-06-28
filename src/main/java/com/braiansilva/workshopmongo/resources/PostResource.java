package com.braiansilva.workshopmongo.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.braiansilva.workshopmongo.domain.Post;
import com.braiansilva.workshopmongo.domain.User;
import com.braiansilva.workshopmongo.dto.UserDTO;
import com.braiansilva.workshopmongo.services.PostService;
import com.braiansilva.workshopmongo.services.UserService;

@RestController
@RequestMapping(value="/posts")
public class PostResource {
	
	@Autowired
	private PostService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<Post> findById(@PathVariable String id){
		Post obj = service.findById(id);	
				
		return ResponseEntity.ok().body(obj);
	}

	
}

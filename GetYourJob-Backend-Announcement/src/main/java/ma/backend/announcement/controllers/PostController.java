package ma.backend.announcement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.backend.announcement.entities.Post;
import ma.backend.announcement.repositories.PostRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/post")
public class PostController {
	@Autowired
	PostRepository postRepo;
	
	@PostMapping("/save")
	public Post save(@RequestBody Post post) {
		System.out.println("namePos:"+post.getNamePost());
		return postRepo.save(post);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		System.out.println("id to delete:"+id);
		postRepo.deleteById(id);	
	}
	
	@GetMapping("/allPosts")
	public List<Post> getAllPosts(){
		return postRepo.findAll();
	}
}

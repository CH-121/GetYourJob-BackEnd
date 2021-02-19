package ma.backend.announcement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.backend.announcement.entities.AppUser;
import ma.backend.announcement.repositories.AppUserRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class AppUserController {
	@Autowired
	AppUserRepository userRepo;
	
	@GetMapping("/getUser/{id}")
	public AppUser getUser(@PathVariable String id){
		return userRepo.findById(id).get();
	}
	
	@GetMapping("/allUsers")
	public List<AppUser> getAllUser(){
		return userRepo.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		System.out.println("id to delete:"+id);
		userRepo.deleteById(id);	
	}
}

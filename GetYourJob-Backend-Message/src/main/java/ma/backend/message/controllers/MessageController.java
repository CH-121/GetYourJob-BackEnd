package ma.backend.message.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.backend.message.entities.AppUser;
import ma.backend.message.entities.Message;
import ma.backend.message.repositories.AppUserRepository;
import ma.backend.message.repositories.MessageRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/message")
public class MessageController {
	@Autowired
	MessageRepository msgRepo;
	@Autowired
	AppUserRepository userRepo;
	
	@GetMapping("/findAllByIdUser/{id}")
	public List<Message> getByIdUser(@PathVariable String id){
		AppUser user = userRepo.findById(id).get();
		List<Message> msgs = msgRepo.findAllByFrom(user);
		for(Message msg : msgRepo.findAllByTo(user)) {
			msgs.add(msg);
		}
		return msgs;
	}
	
	
}

package ma.backend.announcement.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.backend.announcement.entities.Announcement;
import ma.backend.announcement.entities.AppUser;
import ma.backend.announcement.entities.Post;
import ma.backend.announcement.repositories.AnnouncementRepository;
import ma.backend.announcement.repositories.AppUserRepository;
import ma.backend.announcement.repositories.PostRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/announcement")
public class AnnouncementController {
	@Autowired
	AnnouncementRepository annRepo;
	@Autowired
	PostRepository postRepo;
	@Autowired
	AppUserRepository userRepo;
	
	@PostMapping("/save")
	public Announcement save(@RequestBody Announcement ann) {
		System.out.println("announcement:"+ann.getDesc());
		Post post = postRepo.findById(ann.getPost().getId()).get();
		AppUser enterprise = userRepo.findById(ann.getEnterprise().getId()).get();
		Date date = new Date();
		ann.setPost(post);
		ann.setEnterprise(enterprise);
		ann.setDate(date.toLocaleString());
		return annRepo.save(ann);
	}
	
	@GetMapping("/allAnnouncements")
	public List<Announcement> getAllAnnouncements() {
		return annRepo.findAll();
	}
}

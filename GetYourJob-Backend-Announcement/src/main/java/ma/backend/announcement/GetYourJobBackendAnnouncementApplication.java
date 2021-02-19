package ma.backend.announcement;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.backend.announcement.entities.Announcement;
import ma.backend.announcement.entities.AppRole;
import ma.backend.announcement.entities.AppUser;
import ma.backend.announcement.entities.Post;
import ma.backend.announcement.repositories.AnnouncementRepository;
import ma.backend.announcement.repositories.AppUserRepository;
import ma.backend.announcement.repositories.PostRepository;

@SpringBootApplication
public class GetYourJobBackendAnnouncementApplication implements CommandLineRunner {
	@Autowired
	PostRepository postRepo;
	@Autowired
	AnnouncementRepository annRepo;
	@Autowired
	AppUserRepository userRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(GetYourJobBackendAnnouncementApplication.class, args);	
	}
	
	
	@Override
	public void run(String... args) throws Exception {
//		Set<AppRole> roles = null;
//		roles.add(new AppRole("Admin"));
//		AppUser user = new AppUser("Balkees", "balkees@gmail.com", "Ahlan", "123", true, roles);
//		userRepo.save(user);
//		
//		Post post = new Post("Ingineer");
//		postRepo.save(post);
//		postRepo.deleteById("602ea39d278e071709279204");
		
//		Announcement ann = new Announcement("Have a job", "Need an Ingineer", "12-10-2021", user, post);
//		annRepo.save(ann);
	}

}

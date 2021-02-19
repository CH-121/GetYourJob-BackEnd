package ma.backend.message;

import java.util.Date;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.backend.message.entities.AppRole;
import ma.backend.message.entities.AppUser;
import ma.backend.message.entities.Message;
import ma.backend.message.repositories.AppUserRepository;
import ma.backend.message.repositories.MessageRepository;

@SpringBootApplication
public class GetYourJobBackendMessageApplication implements CommandLineRunner{
	@Autowired
	MessageRepository msgRepo;
	@Autowired
	AppUserRepository userRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(GetYourJobBackendMessageApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Set<AppRole> roles = null;
//		AppUser user = new AppUser("Derar", "derar@gmail.com", "Ahlan", "123", true, roles);
//		userRepo.save(user);
//		AppUser ent1 = new AppUser("Salman", "salman@gmail.com", "Ahlan", "123", true, roles);
//		userRepo.save(ent1);
//		AppUser ent2 = new AppUser("Sami", "sami@gmail.com", "Ahlan", "123", true, roles);
//		userRepo.save(ent2);
//		
//		Date date = new Date();
//		Message msg1 = new Message("Hello from user to ent 1!", date.toLocaleString(), user, ent1);
//		msgRepo.save(msg1);
//		Message msg2 = new Message("Hello from ent 1 to user!", date.toLocaleString(), ent1, user);
//		msgRepo.save(msg2);
//		Message msg3 = new Message("Hello from user to ent 2!", date.toLocaleString(), user, ent2);
//		msgRepo.save(msg3);
//		Message msg4 = new Message("Hello from ent 2 to user!", date.toLocaleString(), ent1, user);
//		msgRepo.save(msg4);
	}

}

package ma.fstt.lsi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import ma.fstt.lsi.services.AccountService;

@SpringBootApplication()
public class GetYourJobGestionUsersApplication implements CommandLineRunner {
	
	@Autowired AccountService accountService;
//	@Autowired CustomUserDetailsService customUserDetailsService;

	public static void main(String[] args) {
		SpringApplication.run(GetYourJobGestionUsersApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
//		
//		accountService.save(new AppRole("USER"));
//		accountService.save(new AppRole("ADMIN"));
//		accountService.save(new AppRole("TEST"));
////		
		accountService.saveUser("user1", "user1@email", "Tanger", "123", "123");
		
//		accountService.saveUser("admin", "admin@email.com", "Tanger", "123", "123");
	}
	
	@Bean
	BCryptPasswordEncoder getBCPE() {
		return new BCryptPasswordEncoder();
	}

}

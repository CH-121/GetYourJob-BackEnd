package ma.fstt.lsi.services;

import org.springframework.stereotype.Service;

import ma.fstt.lsi.entities.AppRole;
import ma.fstt.lsi.entities.AppUser;


public interface AccountService{
	
	
	public AppUser saveUser(String username, String email, String adress, String password, String confirmedPassword);
	
	public AppRole save(AppRole role);
	
	public AppUser loadUserByUsername(String username);
	
	public void addRoleToUser(String username, String roleName);

}

package ma.backend.announcement.entities;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "users")
public class AppUser {

	@Id
	private String id;

	private String username;
	private String email;
	private String adress;
	
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String password;
	private Boolean actived;

	@DBRef
	private Set<AppRole> roles;

	public AppUser(String username, String email, String adress, String password, Boolean actived, Set<AppRole> roles) {
		super();
		this.username = username;
		this.email = email;
		this.adress = adress;
		this.password = password;
		this.actived = actived;
		this.roles = roles;
	}

	public Boolean getActived() {
		return actived;
	}

	public void setActived(Boolean actived) {
		this.actived = actived;
	}

	public Set<AppRole> getRoles() {
		return roles;
	}

	public void setRoles(Set<AppRole> roles) {
		this.roles = roles;
	}

	public AppUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", adress=" + adress + ", password="
				+ password + "]";
	}

}

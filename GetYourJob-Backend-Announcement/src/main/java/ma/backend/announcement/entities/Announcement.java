package ma.backend.announcement.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Announcement {
	@Id
	private String id;

	private String title;
	private String desc;
	private String date;

	@DBRef
	private AppUser enterprise;

	@DBRef
	private Post post;

	public Announcement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Announcement(String title, String desc, String date, AppUser enterprise, Post post) {
		super();
		this.title = title;
		this.desc = desc;
		this.date = date;
		this.enterprise = enterprise;
		this.post = post;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public AppUser getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(AppUser enterprise) {
		this.enterprise = enterprise;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "Announcement [id=" + id + ", title=" + title + ", desc=" + desc + ", date=" + date
				+ ", enterprise=" + enterprise + ", post=" + post + "]";
	}

}

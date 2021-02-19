package ma.backend.announcement.entities;

import org.springframework.data.annotation.Id;

public class Post {
	@Id
	private String id;

	private String namePost;

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Post(String namePost) {
		super();
		this.namePost = namePost;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNamePost() {
		return namePost;
	}

	public void setNamePost(String namePost) {
		this.namePost = namePost;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", namePost=" + namePost + "]";
	}

}

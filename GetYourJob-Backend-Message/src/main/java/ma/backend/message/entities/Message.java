package ma.backend.message.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Message {
	@Id
	private String id;

	private String content;
	private String dateMsg;

	@DBRef
	private AppUser from;
	@DBRef
	private AppUser to;

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Message(String content, String dateMsg, AppUser from, AppUser to) {
		super();
		this.content = content;
		this.dateMsg = dateMsg;
		this.from = from;
		this.to = to;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDateMsg() {
		return dateMsg;
	}

	public void setDateMsg(String dateMsg) {
		this.dateMsg = dateMsg;
	}

	public AppUser getFrom() {
		return from;
	}

	public void setFrom(AppUser from) {
		this.from = from;
	}

	public AppUser getTo() {
		return to;
	}

	public void setTo(AppUser to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", content=" + content + ", dateMsg=" + dateMsg + ", from=" + from + ", to=" + to
				+ "]";
	}

}

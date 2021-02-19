package ma.fstt.lsi.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Enterprise extends AppUser  {
	private int score;
	private String function;

	public Enterprise() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Enterprise(int score, String function) {
		super();
		this.score = score;
		this.function = function;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	@Override
	public String toString() {
		return "Enterprise [score=" + score + ", function=" + function + "]";
	}

}

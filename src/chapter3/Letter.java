package chapter3;

public class Letter {
	
	private String from;
	private String to;
	private String body;
	
	public Letter(String from, String to) {
		this.from = from;
		this.to = to;
		this.body = "";
	}
	
	public void addLine(String line) {
		body = body.concat(line).concat("\n");
	}

	public String getText() {
		
		String letter = "Dear " + to + ":\n";
		letter = letter.concat("\n");
		letter = letter.concat(body).concat("\n");
		letter = letter.concat("Sincerely,").concat("\n");
		letter = letter.concat("\n");
		letter = letter.concat(from);
		
		return letter;
	}
}

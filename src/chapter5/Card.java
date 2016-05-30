package chapter5;

import java.util.Scanner;



public class Card {

	private String notation;
	
	public Card() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the card notation: ");
		this.notation = input.nextLine();
	}
	
	public String getDescription() {
		String description = "";
		
		int separateAt = 1;
		if(this.notation.length() == 3)
		{
			separateAt = 2;		
		}
		
		String value = this.notation.substring(0,separateAt);
		char type = this.notation.charAt(separateAt);
		
		switch(value) {
		case "A": 
			description = "Ace";
			break;
		case "1": 
			description = "One";
			break;
		case "2": 
			description = "Two";
			break;
		case "3": 
			description = "Three";
			break;
		case "4": 
			description = "Four";
			break;
		case "5": 
			description = "Five";
			break;
		case "6": 
			description = "Six";
			break;
		case "7": 
			description = "Seven";
			break;
		case "8": 
			description = "Eight";
			break;
		case "9": 
			description = "Nine";
			break;
		case "10": 
			description = "Ten";
			break;
		case "J": 
			description = "Jack";
			break;
		case "Q": 
			description = "Queen";
			break;
		case "K": 
			description = "King";
			break;
		default: 
			description = "Unknown";
		}
		
		description = description + " of ";
		
		
		switch(type) {
		case 'D':
			description = description + "diamonds";
			break;
		case 'H':
			description = description + "hearts";
			break;
		case 'S':
			description = description + "spades";
			break;
		case 'C':
			description = description + "clubs";
			break;
		default:
			description = "Unknown";
		}
		
		if (description.contains("Unknown")) {
			description = "Unknown";
		}
		return description;
	}
	
	
}

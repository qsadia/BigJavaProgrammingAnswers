package chapter1;

public class TicTacToeBoardPrinter{
	public static void main(String[] args){
		int numRows = 10;
		int row = 0;
		int column = 0;

		while (row < numRows){
			while (column < numRows){
				System.out.print("+---");
				column++;
			}
			System.out.println("+");
			column = 0;

			while (column < numRows){
				System.out.print("|   ");
				column++;
			}
			System.out.println("|");
			column = 0;

			row++;
		}

		while (column < numRows){
			System.out.print("+---");
			column++;
		}
		System.out.println("+");

	}
}
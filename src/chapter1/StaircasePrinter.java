package chapter1;

public class StaircasePrinter{
	
	public static void main(String[] args){
		int numStairs = 10;
		String base = "|   ";
		String empty = "    ";

		int row = 0;
		int column = 0;

		while(row < numStairs){
			while (column < numStairs){
				if(column >= (numStairs - row - 1) ){
					System.out.print("+---");
				}
				else{
					System.out.print(empty);
				}
				column++;
			}
			System.out.println("+");
			column = 0;

			while (column < numStairs){
				if(column >= (numStairs - row - 1) ){
					System.out.print(base);
				}
				else{
					System.out.print(empty);
				}
				column++;
			}
			System.out.println("|");

			column = 0;
			row++;
		}
		column = 0;
		while (column < numStairs){
			System.out.print("+---");
			column++;
		}
		System.out.println("+");

	}
}
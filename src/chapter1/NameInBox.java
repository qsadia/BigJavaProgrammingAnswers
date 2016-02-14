package chapter1;

public class NameInBox{

	public static void main(String[] args){
		String name = "Sadia";
		int length = name.length();

		printEdge(length);
		System.out.println("|" + name + "|");
		printEdge(length);

	}

	public static void printEdge(int length){

		System.out.print("+");
		for(int i = 0; i < length; i++){
			System.out.print("-");
		}
		System.out.println("+");
	}

}
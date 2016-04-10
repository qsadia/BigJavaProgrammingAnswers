package chapter3;

public class Tester {

	public static void main(String[] args) {
		
		Employee graduate = new Employee("Oliver", 68000);
		graduate.raiseSalary(0.03);
		double salary = graduate.getSalary();
		
		System.out.println("Expected salary: " + 70040.0);
		System.out.println("Actual salary: " + salary);
		
		Car myCar = new Car(20);
		myCar.addGas(10);
		myCar.drive(50);
		double gasLeft = myCar.getGasInTank();
		
		Student s = new Student("Syeda Sadia");
		System.out.println(s.getName());
		s.addQuiz(40);
		s.addQuiz(50);
		s.addQuiz(30);
		System.out.println("Expected total score: " + 120.0);
		System.out.println("Actual total score: " + s.getTotalScore());
		System.out.println("Expected average score: " + 40.0);
		System.out.println("Actual average score: " + s.getAverageScore());
		
		System.out.println("Expected fuel: " + 7.5);
		System.out.println("Actual fuel: " + gasLeft);
			
		Letter l = new Letter("Jos", "Sadia");
		l.addLine("I hope you are well.");
		l.addLine("I am glad you enjoyed the match!");
		
		System.out.println(l.getText());
		
		Bug b = new Bug(10);
		b.move();
		b.move();
		b.move();
		b.turn();
		b.move();
		System.out.println("Expected Position: " + 12);
		System.out.println("Actual Position: " + b.getPosition());
	
		Moth m = new Moth(10);
		m.moveToLight(20);
		m.moveToLight(35);
		System.out.println("Expected Position: " + 25.0);
		System.out.println("Actual Position: " + m.getPosition());
	
		RoachPopulation r = new RoachPopulation(10);
		for(int i = 0; i < 4; i++) {
			r.breed();
			r.spray();
			System.out.println("Roach Population: " + r.getRoaches());
		}
		
		VotingMachine v = new VotingMachine();
		for (int i = 0; i < 80; i++) {
			v.voteGreen();
			v.voteLabour();
			v.voteLabour();
			v.voteGreen();
			v.voteLabour();
			v.voteTory();
			v.voteTory();
			v.voteTory();
			v.voteTory();
		}
		v.voteGreen();
		v.printTally();
		v.clear();
		v.printTally();
	}
	
	

}

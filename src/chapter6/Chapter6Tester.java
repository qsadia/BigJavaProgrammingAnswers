package chapter6;

public class Chapter6Tester {

	public static void main(String[] args) {
		/*CreditCardValidation c = new CreditCardValidation(43529791);
		c.isValid();

		PowerGenerator gen = new PowerGenerator(10);
		for(int i = 0; i < 12; i++) {
			System.out.println(gen.nextPower());
		}

		Scanner in = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = in.nextInt();
		FibonacciGenerator fg = new FibonacciGenerator();
		for (int i = 1; i <= n; i++) {
			System.out.print(fg.nextNumber() + " ");
		}

		ProjectileFlightSimulation p = new ProjectileFlightSimulation();
		p.runSimulation();*/

		/*FactorGenerator facGen = new FactorGenerator(1001);
		boolean hasMore = true;
		while (hasMore) {
			System.out.println(facGen.nextFactor());
			hasMore = facGen.hasMoreFactors();

		}

		PrimeGenerator pg = new PrimeGenerator();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter how many numbers to search for prime numbers:");
		int num = in.nextInt();
		in.close();

		int prime = pg.nextPrime();
		while (prime < num) {
			System.out.println(prime);
			prime = pg.nextPrime();
		}*/

		DartSimulation ds = new DartSimulation();
		ds.runSimulation(10000);
		System.out.println(ds.getPiApprox());

	}

}

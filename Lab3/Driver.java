import java.util.Random;

public class Driver {
	public static void main(String[] args) {
		
		// the amount of numbers that will be in the array
		final int VALUES = 10;

		Stats stats = new Stats(VALUES);

		Random random = new Random();

		for (int i = 0; i < VALUES; i++) {
			
			// adds a random value between 0 and 100 to the array
			stats.addValue(random.nextInt(100));
		}

		System.out.println("Numbers stored : ");
		System.out.println(stats);

		System.out.println("Average = " + stats.getAverage());
		System.out.println("Count = " + stats.getCount());
		System.out.println("Total = " + stats.getTotal());
		System.out.println("Minimum value = " + stats.getMin());
		System.out.println("Maximum value = " + stats.getMax());
	}
}

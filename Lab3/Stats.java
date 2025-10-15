import java.util.Arrays;

/**
 * Stores a list of values that produces statistics from those
 */
public class Stats {

	/**
	 * Stores the list of values
	 */
	int[] numbers;

	/**
	 * Number of elements added to values
	 */
	int count;

	
	public void addValue(int value) {
		numbers[count] = value;
		count++;
	}

	/**
	 * 
	 * @return the count of the number of added values
	 */
	public int getCount() {
		return count;
	}

	/**
	 * Calculates the maximum value from the list of numbers
	 * 
	 * @return maximum value from list
	 */
	public int getMax() {

		int max = numbers[0];

		// goes through every number in array and checks if the current number is bigger
		// than the current biggest
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max)
				max = numbers[i];
		}

		return max;
	}

	/**
	 * Calculates the minimum value from the list of numbers
	 * 
	 * @return minimum value from list
	 */
	public int getMin() {
		int min = numbers[0];

		// goes through every number in array and checks if current number is smaller
		// than the current smallest
		for (int i = 1; i < count; i++) {
			if (numbers[i] < min)
				min = numbers[i];
		}

		return min;
	}

	public int getTotal() {

		int total = 0;

		// total all values within the array
		for (int i = 0; i < count; i++) {
			total += numbers[i];
		}
		return total;
	}

	public double getAverage() {

		int total = 0;

		// total all values within the array
		for (int i = 0; i < count; i++) {
			total += numbers[i];
		}

		// divide the average by the amount of numbers in the array
		double average = total / (double) numbers.length;

		return average;
	}

	@Override
	public String toString() {
		return Arrays.toString(numbers);
	}

	/**
	 * Constructor
	 * 
	 * @param maximum number of values that can be stored
	 */
	public Stats(int capacity) {
		numbers = new int[capacity];
	}

}

import java.util.Scanner;

public class Driver {
	public static final void main(String[] args) {
		String sentence;
		int words, letters, length;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		sentence = input.nextLine();
		
		WordProcessor wp = new WordProcessor();
		
		words = wp.countWords(sentence);
		letters = wp.countLetters(sentence);
		length = wp.getLength(sentence);
		
		System.out.print(words);
		System.out.print("\n");
		
		System.out.print(letters);
		System.out.print("\n");

		System.out.print(length);
		System.out.print("\n");

	}
}

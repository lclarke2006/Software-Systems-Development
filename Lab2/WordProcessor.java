public class WordProcessor implements Counter {

	@Override
	public int countWords(String sentence) {
		String[] words = sentence.split(" ");
		
		return words.length;
	}


	@Override
	public int countLetters(String sentence) {
		String[] letters = sentence.split("");
		
		int num = 0;
		
		for (int i = 0; i < letters.length; i++) {
			if (Character.isLetter(sentence.charAt(i)))
				num += 1;
		}
		
		return num;
	}

	
	@Override
	public int getLength(String sentence) {
		return sentence.length();
	}

}

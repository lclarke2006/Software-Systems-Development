public interface Counter {

	/**
	 * 
	 * @param sentence
	 * @return how many words in sentence
	 */
	int countWords(String sentence);
	
	/**
	 * 
	 * @param sentence
	 * @return how many letters in sentence
	 */
	int countLetters(String sentence);
	
	/**
	 * 
	 * @param sentence
	 * @return length of sentence
	 */
	int getLength(String sentence);
	
}

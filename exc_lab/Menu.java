/**
 * A class to provide menu functionality
 */

public class Menu {
	/**
	 * "throws" is used so that "throw" can be
	 * 
	 * @param opt
	 * @throws InvalidOptionException
	 */
	void displayMenuOption(int opt) throws InvalidOptionException {
		/**
		 * Checks to see if the option is between 0 and 4 (not inclusive)
		 */
			if (0 < opt && opt < 4) {
				System.out.print("Menu option " + opt + " selected");
				System.out.print("\n");
			}
			else {
				throw new InvalidOptionException("Invalid option selected: " + opt);
			}
	}
}

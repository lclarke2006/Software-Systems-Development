public class ArrayDriver{
	public static void main(String[] args) throws InvalidOptionException {
		
		ArrayProcessor ap = new ArrayProcessor();
		int len = ap.getArrayLength(new String[] {"one", "two", "three"});
		System.out.println("Array length is " +len);
		
		
		Menu m = new Menu();
		
		try {
			m.displayMenuOption(1);
			m.displayMenuOption(3);
			m.displayMenuOption(5);
		}
		catch (InvalidOptionException e){
			System.out.print(e.mg);
		}
	}
}

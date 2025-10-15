public class Driver {
	public static final void main(String[] args) {
		
		Rectangle s1 = new Rectangle(10, 20);
				
		System.out.print(s1.getArea());
		
		System.out.print("\n");
		
		s1.setWidth(20);
		s1.setHeight(30);

		System.out.print(s1.getArea());
		
		System.out.print("\n");

	}
}

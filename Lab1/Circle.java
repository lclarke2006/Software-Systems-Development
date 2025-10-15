public class Circle extends Shape {

	private int radius;
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius (int radius) {
		this.radius = radius;
	}
	
	
	@Override
	public int getArea() {
		int area = (int) (Math.PI * radius * radius);
		return area;
	}
	
	
	Circle() {
		super(0);
	}

}

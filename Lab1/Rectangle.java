public class Rectangle extends Shape {

	private int width;
	private int height;
	
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	@Override
	public int getArea() {
		return width * height;
	}
	
	Rectangle(int width, int height) {
		super(0);
		this.width = width;
		this.height = height;
	}

}

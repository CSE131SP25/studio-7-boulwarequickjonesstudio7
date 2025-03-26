package studio7;

public class Rectangle {
	//private variables
	private	int length;
	private	int width;
	
	//if you make a static method it means it belongs to the overall class, not the individual object
	public Rectangle(int l, int w) {
		//if parameter was length we could use this.length to refer to the length that belongs to the object
		length = l;
		width = w;
	}
	
	public int getArea() {
		return length * width;
	}
	
	public int getPerimeter() {
		return 2 * length + 2 * width;
	}
	
	public boolean isSquare() {
		return length == width;
	}
	
	public String toString() {
		String rectangle = "";
		for (int x = 0; x < length; x++) {
			for (int y = 0; y < width; y++) {
				rectangle += "X";
			}
			rectangle += "\n";
		}
		return rectangle;
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(4, 3);
		System.out.print(r);

	}

}

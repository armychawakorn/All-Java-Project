package oop3;

public class Main {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10, 20, "Red");
		System.out.println(
			String.format(
				"Width: %d, Height: %d, Area: %s, Color: %s", 
				rectangle.getWidth(), rectangle.getHeight(), 
				rectangle.calculateArea(), 
				rectangle.getColor()
			)
		);
	}

}

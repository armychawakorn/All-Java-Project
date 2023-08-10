package oop3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter width: ");
		int width = scn.nextInt();
		System.out.print("Enter height: ");
		int height = scn.nextInt();
		System.out.print("Enter color: ");
		String color = scn.next();
		scn.close();
		Rectangle rectangle = new Rectangle(width, height, color);
		System.out.println(
			String.format(
				"Width: %d, Height: %d, Area: %s, Color: %s", 
				rectangle.getWidth(), 
				rectangle.getHeight(), 
				rectangle.calculateArea(), 
				rectangle.getColor()
			)
		);
	}

}

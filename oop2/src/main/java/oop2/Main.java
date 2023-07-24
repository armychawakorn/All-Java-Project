package oop2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Triangle t = new Triangle();
		System.out.print("Enter base: ");
		t.setBase(scn.nextDouble());
		System.out.print("Enter height: ");
		t.setHeight(scn.nextDouble());
		System.out.println("Area: " + t.getArea());
	}

}

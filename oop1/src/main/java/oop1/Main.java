package oop1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee();
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter ID: ");
		employee.setID(scn.nextLine());
		System.out.print("Enter Full Name: ");
		employee.setFullName(scn.nextLine());
		System.out.print("Enter Salary: ");
		employee.setSalary(scn.nextFloat());
		System.out.println("ID: " + employee.getID());
		System.out.println("Full Name: " + employee.getFullName());
		System.out.println("Salary: " + employee.getSalary());
		System.out.println("Salary Per Year: " + employee.CalculateSalaryPerYear());
		System.out.println("Salary Bonus: " + employee.CalculateSalaryBonus());
	}
}

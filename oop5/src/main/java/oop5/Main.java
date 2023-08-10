package oop5;

public class Main {

	public static void main(String[] args) {
		SmartPhone smp = new SmartPhone("I-Mobile", 48900, "AMD Ryzen 9 5900X");
		smp.print();
		System.out.println(String.format("Pay per 12 month: %2.1f", smp.paymentPerMonth(12)));
	}

}

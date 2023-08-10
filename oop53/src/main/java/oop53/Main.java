package oop53;

public class Main {

	public static void main(String[] args) {
		Invoice invoice = new Invoice("GGEZ0001", new Customer("ชวกวย เนืองภา", "วัยรุ่นเทสดี"), 9000);
		invoice.printInvoice();
	}

}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		print("กรุณากรอกตัวเลขแรก: "); double input1 = scn.nextDouble();
		print("กรอกเครื่องหมาย: "); String operation = scn.next(); 
		print("กรุณากรอกตัวเลขสอง: "); double input2 = scn.nextDouble(); 
		double result = 0;
		if(operation.equals("+")) {
			result = input1 + input2;
		}else if(operation.equals("-")) {
			result = input1 - input2;
		}else if(operation.equals("*")) {
			result = input1 * input2;
		}else if(operation.equals("/")) {
			result = input1 / input2;
		}else {
			result = input1 % input2;
		}
		print(String.format("คำตอบคือ: %s", String.valueOf(result)));
	}
	static void print(String text) {
		System.out.print(text);
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Double x = 0.00;
		try {
			PUT("กรอกตัวเลข: ");
			x = scn.nextDouble();
		}catch (Exception e){
			PUT("กรุณากรอกตัวเลขให้ถูกต้อง");
			return;
		}
		if(x > 0) {
			PUT("Positive Number");
		}else if (x < 0) {
			PUT("Nagative Number");
		}else {
			PUT("Zero");
		}
	}
	static void PUT(String text) {
		System.out.print(text);
	}

}

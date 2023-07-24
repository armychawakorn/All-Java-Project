import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = 0;
        int maxTry = 5;
        boolean isCorrect = false;
        while (!isCorrect) {
            count++;
            System.out.print("กรุณากรอกตัวเลขสุ่ม: ");
            int youTry = scn.nextInt();
            System.out.println(String.format("ครั้งที่ %s คุณทาย %s\n", count, youTry));
            if (youTry == (int) ((Math.random() * (10 - 1)) + 1)) {
                isCorrect = true;
                System.out.println(String.format("คุณทายถูกต้อง %s ครั้ง, คำตอบคือ %s\n", count, youTry));
            } else if (count >= maxTry) {
                System.out.println("เกมจบแล้ว! คุณกรอกเกินจำนวนครั้งที่กำหนด");
                break;
            }
        }
    }
}
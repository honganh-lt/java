import java.util.Scanner;

public class Lab01_08 {
    public static void main(String[] args) {
        //Khai bao bien
        int num1, num2, num3, max, min;
        Scanner input = new Scanner(System.in);
        System.out.print("\n Nhập số num1: ");
        num1 = input.nextInt();
        System.out.print("\n Nhập số num2: ");
        num2 = input.nextInt();
        System.out.print("\n Nhập số num3: ");
        num3 = input.nextInt();

        //Tìm max,min
        max = Math.max(num1, Math.max(num2, num3));
        int min1 = (num1 > num2) ? num2 : num1;
        min = (min1 > num3) ? num3 : min1;

        System.out.printf(" Num1:%d, num2:%d, num3:%d, Max:%d, Min:%d", num1, num2, num3, max, min);
    }
}

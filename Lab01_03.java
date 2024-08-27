import java.util.Scanner;

public class Lab01_03 {
    public static void main(String[] args) {
        //Khai bao bien
        int n;
        float m;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số nguyên n:");
        n = input.nextInt();
        System.out.print("Nhập số thực m:");
        m = input.nextFloat();

        //Hiện thị
        System.out.printf("Số nguyên là:%d", n);
        System.out.printf("\nSo thực: %.1f", m);
    }
}

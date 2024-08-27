import java.util.Scanner;

public class Lab01_05 {
    public static void main(String[] args) {
        //Khai bao bien
        int n, m;
        //Nhập giá trị từ bàn phím
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số nguyên n= ");
        n = input.nextInt();
        System.out.print("Nhập số nguyên m= ");
        m = input.nextInt();

        //Tính
        int tongNM = n + m;

        //Hiện thị
        System.out.printf("Tổng hai số nguyên là: %d + %d = %d", n, m, tongNM);
    }
}

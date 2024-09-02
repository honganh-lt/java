import java.util.Scanner;

public class Lab03_04 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao n la:");
        n = input.nextInt();
/*
        if (n < 2) {
            System.out.printf("%d khong phai la so nguyen to", n);
            return;
        }
        int count = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) ;
            count++;
        }

 */
        if (soNT(n)) {
            System.out.printf("%d la so nguyen to.", n);
        } else {
            System.out.printf("%d la không so nguyen to.", n);
        }
    }


    public static boolean soNT(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

import java.util.Scanner;

public class Lab03_05 {
    public static void main(String[] args) {

        int n = 8, q = 0;
        /*
        for (int i = 1; i <= n; ++i, q = 0) {
            for (int j = 1; j <= n - i; ++j) {
                System.out.print(" ");
            }
            while (q != 2 * i - 1) {
                System.out.print("*");
                ++q;
            }
            System.out.println();
        }*/
        //i=height j=space
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j == n - i + 1 || j == n + i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        /*
        Scanner input = new Scanner(System.in);
        int hight, k = 0;
        System.out.printf("\n\nNhập vào chiều cao của kim tự tháp: ");
        hight = input.nextInt();
        for (int i = 1; i <= hight; ++i, k = 0) {
            for (int space = 1; space <= hight - i; ++space) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }*/
    }
}

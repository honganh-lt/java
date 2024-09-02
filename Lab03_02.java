import java.util.Scanner;

public class Lab03_02 {
    public static void main(String[] args) {
        //Khai bao bien
        int n, S = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao n:");
        n = input.nextInt();
        System.out.printf("Số nguyên là:%d", n);
        for (int i = 0; i <= n; i++) {
            S += i;
        }
        System.out.printf("\n%d", S);
    }
}

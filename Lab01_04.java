import java.util.Scanner;

public class Lab01_04 {
    public static void main(String[] args) {
        //Khai bao bien
        int n;
        float m;
        String c;
        //String s = new String("Hello");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số nguyên n:");
        n = input.nextInt();
        System.out.print("Nhập số thực m:");
        m = input.nextFloat();
        System.out.println("Nhập xâu kí tự:");
        c = input.nextLine();


        //Hiện thị
        System.out.printf("Số nguyên là:%d", n);
        System.out.printf("\nSo thực: %.1f", m);
        System.out.println(c);
    }
}

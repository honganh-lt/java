import java.util.Scanner;

public class Lab03_03_03 {
    //Tìm UCLN
    /*
    public static int UCLN(int a, int b) {
        if (b == 0) return a;
        return UCLN(b, a % b);
    }
    */
    public static int UCLN(int a, int b) {
        int tg;
        while (b != 0) {
            tg = a % b;
            a = b;
            b = tg;
        }
        return a;
    }

    //Tìm BCNN
    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }

    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao a:");
        a = input.nextInt();
        System.out.println("Nhap vao b:");
        b = input.nextInt();

        //Dua ra UCLN
        System.out.printf("UCLN la: %d", UCLN(a, b));
        System.out.printf("\nBCNN la: %d", BCNN(a, b));

    }
}

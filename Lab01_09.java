import java.util.Scanner;

public class Lab01_09 {
    public static void main(String[] args) {
        //Khai bao bien
        float a, b;
        //float x;
        Scanner pt = new Scanner(System.in);
        System.out.print("Nhập vào a: ");
        a = pt.nextFloat();
        System.out.print("Nhập vào b: ");
        b = pt.nextFloat();

        if (a == 0) {
            if (b == 0) {
                System.out.print("Phuong trinh vo so nghiem.");
            } else {
                System.out.print("Phương trinh vo nghiem");
            }
        } else {
            // x = (int) -b / a;
            System.out.print("Phuong trinh co nghiem: " + -b / a);
        }
    }
}

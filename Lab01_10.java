import java.util.Scanner;

public class Lab01_10 {
    public static void main(String[] args) {
        //Khai bao bien
        float a, b, c;
        //float x;
        Scanner pt = new Scanner(System.in);
        System.out.print("Nhập vào a: ");
        a = pt.nextFloat();
        System.out.print("Nhập vào b: ");
        b = pt.nextFloat();
        System.out.print("Nhập vào c: ");
        c = pt.nextFloat();

        if (a == 0) {
            if (b == 0) {
                System.out.print("Phương trình vô nghiệm");
            } else {
                System.out.print("Phương trình có một nghiem" + "x= " + (-c / b));
            }
        }

        //tính Delta
        float delta = b * b - 4 * a * c;
        float x1, x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phương trình có 2 nghiệm là:  " + "x1=" + x1 + "\tx2=" + x2);
        } else if (delta == 0) {
            x1 = (-b / 2 * a);
            System.out.println("Phương trình có nghiệm kép là " + "x1=x2=" + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}

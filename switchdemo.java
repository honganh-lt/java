import java.util.Scanner;

public class switchdemo {
    public static void main(String[] args) {
        //Khai bao bien
        int thang, nam, soNgay;
        //Nhaapj
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tháng:");
        thang = input.nextInt();
        System.out.print("Nhập năm:");
        nam = input.nextInt();
        //Tính So ngay
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                soNgay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                soNgay = 30;
                break;
            case 2:
                if ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) {
                    soNgay = 29;
                } else {
                    soNgay = 28;
                }
                break;
            default:
                System.out.println("Nhập sai du liệu tháng năm");
        }
        // if(soNgay>0)
        // System.out.printf("\n Thang %d, nam %d co %d ngay",thang,nam,soNgay);
    }
}

/*
Bai tap:
1.Đọc một số có 1 chữ số thành lời Việt.
2.Đọc một số có 2 chữ số thành lời Việt.
    10->mười;
    11-> mười một
    15-> muoi lam.
3.Đọc một số có 3 chũ số thành lời Việt.
 */
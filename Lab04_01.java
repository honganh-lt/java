import java.util.Scanner;

public class Lab04_01 {
    int date, soLuong;
    String maHoaDon, tenKhachHang, address;
    float tongTienHang = 0, tienKM, tongTienTT = 0, giaBan;


    public void inputInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n Nhập vao mã hóa đơn:");
        maHoaDon = input.nextLine();
        input.nextLine();
        System.out.print("\nNhap vao ngay:");
        date = input.nextInt();
        input.nextLine();
        System.out.println("\n Nhập vao tên khách hang:");
        tenKhachHang = input.nextLine();
        System.out.println("\n Nhập vao địa chỉ:");
        address = input.nextLine();
        System.out.print("\n Nhập vao số lượng bánh ần giao:");
        soLuong = input.nextInt();
        System.out.print("\n Nhập vao giá 1 chiếc bánh:");
        giaBan = input.nextFloat();
        System.out.print("\n Tieenf khuyến mãi:");
        tienKM = input.nextFloat();
    }

    public void outputInfo() {
        System.out.println("\n Mã hóa đơn:" + maHoaDon);
        System.out.println("\n Ngày: " + date);
        System.out.println("\n Tên khách hàng:" + tenKhachHang);
        System.out.println("\n Địa chỉ:" + address);
        System.out.println("\n Sô lượng bánh:" + soLuong);
        System.out.println("\n Giá bán:" + giaBan);
        System.out.println("\n Tiền khuyến mai:" + tienKM);

    }


    public static void main(String[] args) {
        //Kởi tạo đối tượng từ lớp
        Lab04_01 obj = new Lab04_01();
        //Truy cập đến phương thức của đối tượng
        obj.inputInfo();

        obj.outputInfo();

        obj.tongTienHang = obj.soLuong * obj.giaBan;
        System.out.printf("\n Tổng tiền hang: %.1f", obj.tongTienHang);

        obj.tongTienTT = obj.tongTienHang - obj.tienKM;
        System.out.printf("\n Tổng tền thanh toán: %.1f", obj.tongTienTT);


    }
}

import java.util.Scanner;

public class Student {
    int rollNumber;
    String name;
    int yearOfBirth;

    //2. method / behavior
    //Cóntructor
    public Student() {
    } //Vết câu lệnh na mới use được  Student obj = new Student();

    public Student(int rollNumber, String name, int yearOfBirth) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    // inputInfo - nhập thông tin
    public void inputInfo() {
        Scanner input = new Scanner(System.in);
        System.out.print("\n Nhập rollNumber = ");
        rollNumber = input.nextInt();
        input.nextLine();
        System.out.print("\n Nhâp name=");
        name = input.nextLine();
        System.out.print("\n Nhập Year of Bỉrth=");
        yearOfBirth = input.nextInt();
    }

    //output
    public void outputInfo() {
        System.out.println("\n Nhập thông tin sinh vien:");
        System.out.println("\n rollNumber: " + rollNumber);
        System.out.println("\n Name: " + name);
        System.out.println("\n Year of Birth: " + yearOfBirth);
    }

    //method: main test
    public static void main(String[] args) {
        //Kởi tạo đối tượng từ lớp
        Student obj = new Student();
        //Truy cập đến phương thức của đối tượng
        obj.inputInfo();
        obj.outputInfo();

        //Truy cập đến biến
        obj.name = "Hong anh";
        obj.outputInfo();

        //
        //public Student(int rollNumber, String name, int yearOfBirth)
        obj = new Student(111, "Devmasster", 2004);
        obj.outputInfo();
    }
}

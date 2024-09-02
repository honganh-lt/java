public class whileDemo {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 5) {
            System.out.printf("\n %d + 10 = %d", num, num + 10);//in
            num++; //Tăng bến điề kiện lăp
        }

        //in ra các số nguyên từ 1 đến 10
        num = 1;
        while (num <= 10) {
            // System.out.println(num++);
            System.out.println("\n" + num);
            num++;
        }

        //Test
        boolean flag = false;//
        while (flag = !flag) { //(!flag -> false);
            System.out.println(flag);
        }
        //output:n true
    }
}

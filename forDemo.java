public class forDemo {
    public static void main(String[] args) {
        //For đầy đủ
        //in ra cac so nguyen tu 1-10
        for (int i = 0; i <= 10; i++) {
            //System.out.println(i);
            System.out.printf("%3d", i);
        }
/*
        //For Khuyết
        System.out.println("\nFor Khuyết init: ");
        int i = 1;
        for (; i <= 10; i++) {
            //System.out.println(i);
            System.out.printf("%3d", i);
        }

        System.out.println("\nFor Khuyết codition: ");
        for (; ; i++) {
            //System.out.println(i);
            System.out.printf("%3d", i);
            if (i == 10) break;
        }

        System.out.println("\nFor Khuyết codition: ");
        for (; i <= 10; ) {
            System.out.printf("%3d", i);
            i++;
            //if(i==10) break;
        }
*/
        //Dạng 3: For khuyết toàn bộ
        System.out.println("\n For khuyết toàn bộ");
        int i = 1;
        for (; ; ) {
            System.out.printf("%3d", i);
            i++;
            if (i > 10) break;
        }

        //Dạng 4: for không thân
        for (i = 1; i <= 10; System.out.printf("%3d", i), i++) ;


        //Lệnh nhảy: break, continue, return, exit;
        //Continue
        //in ra các số nguyên từ 1-10 không in sô 5
        System.out.println("\n Không in số 5:");
        for (i = 1; i <= 10; i++) {
            if (i == 5) continue;
            System.out.printf("\n%3d", i);
        }
    }
}

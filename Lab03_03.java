public class Lab03_03 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("=============================");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("=============================");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("=============================");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (i == 0 || j == 0 || i == n || i - 1 == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("=============================");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}

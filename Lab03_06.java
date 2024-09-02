public class Lab03_06 {
    public static void main(String[] args) {
        int i, j, n = 10;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) // i=n;j=n

                if (i == 1 || j == 1 || i == n || j == n)

                    System.out.print("  *  ");
                else System.out.print("     ");
            System.out.println();
        }
    }
}

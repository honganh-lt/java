public class Lab03_5 {
    public void docSo(double soThapPhan) {
        if (soThapPhan < 20) {
            phatAmSo((int) soThapPhan);

        } else if (soThapPhan >= 20 && soThapPhan < 100) {
            phatAmSo((int) soThapPhan / 10);
            System.out.print("muoi");
        }
    }

    public void number4Text(double number) {
        double phanDu = number;
        do {
            phanDu = number % 10;
            double thapPhan = number = phanDu;
            System.out.println("phan du:" + phanDu);
            System.out.println("thap phan:" + thapPhan);
            docSo(thapPhan);
        } while (phanDu > 10);
        if (phanDu > 0) {
            System.out.print(" ");
            phatAmSo((int) phanDu);
            System.out.print("\n");
        }
    }

    public void phatAmSo(int so) {
        switch (so) {
            case 0:
                System.out.print("khong");
                break;
            case 1:
                System.out.print("khong");
                break;
            case 2:
                System.out.print("khong");
                break;
            case 3:
                System.out.print("khong");
                break;
            case 4:
                System.out.print("khong");
                break;
            case 5:
                System.out.print("khong");
                break;
            case 6:
                System.out.print("khong");
                break;
            case 7:
                System.out.print("khong");
                break;
            case 8:
                System.out.print("khong");
                break;
            case 9:
                System.out.print("khong");
                break;
        }
    }

    public static void main(String[] args) {

    }
}

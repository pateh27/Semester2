package week5.BruteForceDivideConquer;
import java.util.Scanner;;
public class MainSum19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Perusahaan: ");
        int n = sc.nextInt();

        Sum19[] Sum19 = new Sum19[n];

        for (int i = 0; i < n; i++) {
            System.out.println("**Data Perusahaan " + (i + 1) + "**");
            sc.nextLine();
            System.out.print("Masukkan nama Perusahaan: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan jumlah bulan: ");
            int elemen = sc.nextInt();

            Sum19[i] = new Sum19(nama, elemen);

            // Input keuntungan per bulan
            for (int j = 0; j < elemen; j++) {
                System.out.print("Masukkan keuntungan bulan ke-" + (j + 1) + ": ");
                Sum19[i].getKeuntungan()[j] = sc.nextDouble();
            }
        }

        System.out.println("**Total Keuntungan dengan Brute Force**");
        for (Sum19 p : Sum19) {
            System.out.println("Perusahaan " + p.getNama() + ": " + p.totalBF());
        }

        System.out.println("**Total Keuntungan dengan Divide and Conquer**");
        for (Sum19 p : Sum19) {
            System.out.println("Perusahaan " + p.getNama() + ": " + p.totalDC(0, p.getElemen() - 1));
        }

        sc.close();
    }
}


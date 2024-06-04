package week12.Tugas1;
import java.util.Scanner;
public class DLLMain19 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DLL19 pasien = new DLL19();

        int menu;
        do {
            System.out.println("=================================");
            System.out.println("        DAFTAR ANTRI VAKSIN      ");
            System.out.println("=================================");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Penerima Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("=================================");
            System.out.print("Pilih Menu :");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Nomor antrian : ");
                    int Nomor = sc.nextInt();
                    pasien.addLast(Nomor, nama);
                    break;
                case 2:
                    pasien.remove();
                    break;
                case 3:
                    pasien.print();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("input yang dimasukkan salah");
                    break;
            }
        }while (menu != 4);
    }
}

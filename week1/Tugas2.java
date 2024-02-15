package week1;
import java.util.Scanner;
public class Tugas2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program untuk menghitung kecepatan, jarak, atau waktu:");
        System.out.println("Pilihan:");
        System.out.println("1. Kecepatan");
        System.out.println("2. Jarak");
        System.out.println("3. Waktu");
        System.out.print("Masukkan pilihan Anda (1/2/3): ");
        int pilihan = scanner.nextInt();

        if (pilihan < 1 || pilihan > 3) {
            System.out.println("Pilihan tidak valid.");
            System.exit(0);
        }

        switch (pilihan) {
            case 1:
                hitungKecepatan();
                break;
            case 2:
                hitungJarak();
                break;
            case 3:
                hitungWaktu();
                break;
        }

        scanner.close();
    }

    public static void hitungKecepatan() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jarak (dalam kilometer): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan waktu (dalam jam): ");
        double waktu = scanner.nextDouble();

        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan adalah: " + kecepatan + " km/jam");

        scanner.close();
    }

    public static void hitungJarak() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (dalam km/jam): ");
        double kecepatan = scanner.nextDouble();
        System.out.print("Masukkan waktu (dalam jam): ");
        double waktu = scanner.nextDouble();

        double jarak = kecepatan * waktu;
        System.out.println("Jarak adalah: " + jarak + " kilometer");

        scanner.close();
    }

    public static void hitungWaktu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jarak (dalam kilometer): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan kecepatan (dalam km/jam): ");
        double kecepatan = scanner.nextDouble();

        double waktu = jarak / kecepatan;
        System.out.println("Waktu adalah: " + waktu + " jam");

        scanner.close();
    }
}


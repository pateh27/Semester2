package week1;
import java.util.Scanner;
public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Program Menghitung Nilai Akhir ");
        System.out.println("=========================");
        
        System.out.print("Masukkan nilai tugas (0-100) : ");
        int nilaiTugas = sc.nextInt();
        if (nilaiTugas < 0 || nilaiTugas > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }
        System.out.print("Masukkan nilai kuis (0-100) : ");
        int nilaiKuis = sc.nextInt();
        if (nilaiKuis < 0 || nilaiKuis > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }
        System.out.print("Masukkan nilai UTS (0-100) : ");
        int nilaiUTS = sc.nextInt();
        if (nilaiUTS < 0 || nilaiUTS > 100 ) {
            System.out.println("Nilai tidak valid");
            return;
        }
        System.out.print("Masukkan nilai UAS (0-100) : ");
        int nilaiUas = sc.nextInt();
        if (nilaiUas < 0 || nilaiUas >100) {
            System.out.println("Nilai tidak valid");
            return;
        }

        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 *nilaiKuis) + (0.3 *nilaiUTS) + (0.4 * nilaiUas);
        System.out.println("Nilai akhir mahasiswa: " + nilaiAkhir);

        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            System.out.println("Nilai huruf     : A");
            System.out.println("Nilai setara    : 4");
            System.out.println("Kategori nilai  : Sangat Baik");
        }
        else if (nilaiAkhir >= 73 && nilaiAkhir <= 80) {
            System.out.println("Nilai huruf     : B+");
            System.out.println("Nilai setara    : 3.5");
            System.out.println("Kategori nilai  : Lebih dari Baik");
        }
        else if (nilaiAkhir >= 65 && nilaiAkhir <= 73) {
            System.out.println("Nilai huruf     : B");
            System.out.println("Nilai setara    : 3");
            System.out.println("Kategori nilai  : Baik");
        }
        else if (nilaiAkhir >= 60 && nilaiAkhir <= 65) {
            System.out.println("Nilai huruf     : C+");
            System.out.println("Nilai setara    : 2,5");
            System.out.println("Kategori nilai  : Lebih dari Cukup");
        }
        else if (nilaiAkhir >= 50 && nilaiAkhir <= 60) {
            System.out.println("Nilai huruf     : C");
            System.out.println("Nilai setara    : 2");
            System.out.println("Kategori nilai  : Cukup");
        }
        else if (nilaiAkhir >= 39 && nilaiAkhir <= 50) {
            System.out.println("Nilai huruf     : D");
            System.out.println("Nilai setara    : 1");
            System.out.println("Kategori nilai  : Tidak lulus");
        }
        else {
            System.out.println("Nilai huruf     : E");
            System.out.println("Nilai setara    : 0");
            System.out.println("Kategori nilai  : Tidak Lulus");
        } 
    }
}

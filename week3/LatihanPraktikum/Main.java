package week3.LatihanPraktikum;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LimasSegiEmpat[] lmsArray = new LimasSegiEmpat[3];
        Kerucut[] krcArray = new Kerucut[3];
        Bola[] blaArray = new Bola[3];

        //Proses membuat array baru dari objek-objek 
        for (int i = 0; i < 1; i++) {
            lmsArray[i] = new LimasSegiEmpat(i, i);
            krcArray[i] = new Kerucut(i, i);
            blaArray[i] = new Bola(i);
        }

        for (int i = 0; i < 1; i++) {
            System.out.println("Bangun limas segi empat ke- " + i);
            System.out.print("Masukkan Sisi Alas: ");
            lmsArray[i].panjangSisiAlas = sc.nextInt();
            System.out.print("Masukkan Tinggi Limas: ");
            lmsArray[i].tinggiLimas = sc.nextInt();
            lmsArray[i].getLuasPermukaanLimas();
            lmsArray[i].getVolumeLimas();
            System.out.println();

            System.out.println("Bangun Kerucut ke- " + i);
            System.out.print("Masukkan Jari-Jari : ");
            krcArray[i].jariJari = sc.nextInt();
            System.out.print("Masukkan Sisi Miring : ");
            krcArray[i].sisiMiring = sc.nextInt();
            krcArray[i].getLuasPermukaan();
            krcArray[i].getVolumeKerucut();
            System.out.println();

            System.out.println("Bangun Bola ke- " + i);
            System.out.print("Masukkan Jari-Jari : ");
            blaArray[i].jariJari = sc.nextInt();
            blaArray[i].getLuasPermukaanBola();
            blaArray[i].getVolumeBola();
            System.out.println();
        }

        for (int i = 0; i < 1; i++) {
            System.out.println("Bangun limas segi empat ke- " + i);
            System.out.println("Memiliki Luas Permukaan " + lmsArray[i].getLuasPermukaanLimas());
            System.out.println("Memiliki Volume " + lmsArray[i].getVolumeLimas());
            System.out.println();

            System.out.println("Bangun Kerucut ke- " + i);
            System.out.println("Memiliki Luas Permukaan " + krcArray[i].getLuasPermukaan());
            System.out.println("Memiliki Volume " + krcArray[i].getVolumeKerucut());
            System.out.println();

            System.out.println("Bangun Bola ke- " + i);
            System.out.println("Memiliki Luas Permukaan " + blaArray[i].getLuasPermukaanBola());
            System.out.println("Memiliki Volume " + blaArray[i].getVolumeBola());

        }
        sc.close();
    }
}
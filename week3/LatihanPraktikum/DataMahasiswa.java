package week3.LatihanPraktikum;

import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Mahasiswa[] mhs = new Mahasiswa[3];

        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            String jenisKelamin = sc.nextLine().toUpperCase();
            while (!jenisKelamin.equals("L") && !jenisKelamin.equals("P")) {
                System.out.print("Jenis Kelamin tidak valid! Masukkan L/P: ");
                jenisKelamin = sc.nextLine().toUpperCase();
            }
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            
            mhs[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }

        System.out.println("\n**Informasi Mahasiswa**");
        for (Mahasiswa mahasiswa : mhs) {
            System.out.println(mahasiswa);
        }
        sc.close();
    }
}

class Mahasiswa {
    private String nama;
    private String nim;
    private String jenisKelamin;
    private double ipk;

    public Mahasiswa(String nama, String nim, String jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + "\n"
                + "NIM: " + nim + "\n"
                + "Jenis Kelamin: " + jenisKelamin + "\n"
                + "IPK: " + ipk;
    }
}
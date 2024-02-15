package week1;

import java.util.Scanner;

public class Fungsi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi array untuk menyimpan nama toko, stok bunga, dan harga bunga
        String[] namaToko = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        int[][] stokBunga = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};
        int[] hargaBunga = {75000, 50000, 60000, 10000};

        // Pengurangan stok di RoyalGarden 4
        stokBunga[3][0] -= 1; // Aglonema
        stokBunga[3][1] -= 2; // Keladi
        stokBunga[3][3] -= 5; // Mawar

        // Panggil fungsi untuk menghitung pendapatan setiap cabang
        int[] pendapatanSetiapCabang = hitungPendapatanSetiapCabang(stokBunga, hargaBunga);

        // Panggil fungsi untuk mengetahui jumlah stok setiap jenis bunga di cabang RoyalGarden 4
        int[] stokBungaCabang4 = hitungStokSetiapJenisBunga(stokBunga[3]);

        // Tampilkan pendapatan setiap cabang
        System.out.println("Pendapatan setiap cabang:");
        for (int i = 0; i < namaToko.length; i++) {
            System.out.println(namaToko[i] + ": " + pendapatanSetiapCabang[i]);
        }

        // Tampilkan stok setiap jenis bunga di cabang RoyalGarden 4
        System.out.println("\nStok setiap jenis bunga di RoyalGarden 4:");
        System.out.println("Aglonema: " + stokBungaCabang4[0]);
        System.out.println("Keladi: " + stokBungaCabang4[1]);
        System.out.println("Alocasia: " + stokBungaCabang4[2]);
        System.out.println("Mawar: " + stokBungaCabang4[3]);
    }

    public static int[] hitungPendapatanSetiapCabang(int[][] stokBunga, int[] hargaBunga) {
        int[] pendapatanSetiapCabang = new int[stokBunga.length];
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatanCabang = 0;
            for (int j = 0; j < stokBunga[i].length; j++) {
                pendapatanCabang += stokBunga[i][j] * hargaBunga[j];
            }
            pendapatanSetiapCabang[i] = pendapatanCabang;
        }
        return pendapatanSetiapCabang;
    }

    public static int[] hitungStokSetiapJenisBunga(int[] stokBunga) {
        int[] stokSetiapJenisBunga = new int[stokBunga.length];
        for (int i = 0; i < stokBunga.length; i++) {
            stokSetiapJenisBunga[i] = stokBunga[i];
        }
        return stokSetiapJenisBunga;
    }
}

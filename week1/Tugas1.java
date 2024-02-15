package week1;

import java.util.Scanner;


public class Tugas1 {
    static String[] Kode = {
        "A", "B", "D", "E", "F", "G", "H", "L", "N", "T"
    };    

    static String[][] Kota = {
        { "B", "A", "N", "T", "E", "N" },
        { "D", "K", "I", " ", "J", "A", "K", "A", "R", "T", "A" },
        { "B", "A", "N", "D", "U", "N", "G" },
        { "C", "I", "R", "E", "B", "O", "N" },
        { "B", "O", "G", "O", "R" },
        { "P", "E", "K", "A", "L", "O", "N", "G", "A", "N" },
        { "S", "E", "M", "A", "R", "A", "N", "G" },
        { "S", "U", "R", "A", "B", "A", "Y", "A" },
        {  "M", "A", "L", "A", "N", "G" },
        { "T", "E", "G", "A", "L" }
    };
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kode plat mobil: ");
        String kodePlat = scanner.nextLine();

        int index = -1;
        for (int i = 0; i < Kode.length; i++) {
            if (Kode[i].equals(kodePlat)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Kode plat mobil tidak ditemukan!");
        } else {
            System.out.println("Kota: " + Kota[index][1]);
        }
    }
}
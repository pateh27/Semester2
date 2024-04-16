package week6;

public class Hotel {
    String nama, kota;
    int harga;
    byte bintang;

    Hotel (String n, String k, int h, byte b){
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }
    void tampil(){
        System.out.println("Nama Hotel = " +nama);
        System.out.println("Kota Hotel = "+kota);
        System.out.println("Pricelise Hotel ="+harga);
        System.out.println("Bintang = "+bintang);
    }
}

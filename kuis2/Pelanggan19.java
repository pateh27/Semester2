package kuis2 ;

public class Pelanggan19 {
    String namaPelanggan, noHp;
    Pelanggan19 next, prev;
   

    Pelanggan19(Pelanggan19 prev, String namaPelanggan, String noHP, Pelanggan19 next){
        this.prev = prev;
        this.namaPelanggan = namaPelanggan;
        this.noHp = noHP;
        this.next = next;
    }
}

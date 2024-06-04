package week12.Tugas1;

public class Vaksin19 {
    String nama;
    int Nomor;
    Vaksin19 next, prev;

    public Vaksin19(Vaksin19 prev, String nama, int Nomor, Vaksin19 next){
        this.nama = nama;
        this.Nomor = Nomor;
        this.next = next;
        this.prev = prev;
    }
}

package week12.Tugas2;

public class Film19 {
    int id;
    double rating;
    String judul;
    Film19 prev, next;

    Film19(Film19 prev, int id, String judul, double rating, Film19 next){
        this.prev = prev;
        this.id =id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
    }
}

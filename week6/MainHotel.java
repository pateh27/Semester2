package week6;
import java.util.Scanner;
public class MainHotel {
    public static void main(String[] args) {
        HotelService list = new HotelService();
        Hotel h1 = new Hotel("Surya", "Malang", 1500000, (byte)5);
        Hotel h2 =  new Hotel("Bubuk aja", "Bali", 200000, (byte)2);
        Hotel h3 =  new Hotel("Pulau Kapuk", "Lombok", 500000, (byte)3);
        Hotel h4 =  new Hotel("Enak Tidur", "Jakarta", 750000, (byte)4);
        Hotel h5 = new Hotel("Nyaman Bobo", "Yogyakarta", 300000, (byte)3);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("Data Hotel sebelum di sorting = ");
        list.tampil();

        System.out.println("Data Hotel setelah sorting asc berdasarkan Bintang");
        list.selectionSortHtl();
        list.tampil();

        System.out.println("Data Hotel setelah sorting asc berdasarkan Harga");
        list.selectionSortHtlHarga();
        list.tampil();

        System.out.println("Data Hotel setelah sorting desc berdasarkan bintang");
        list.bubbleSortHtl();
        list.tampil();

        System.out.println("Data Hotel setelah sorting desc berdasarkan harga");
        list.bubbleSortHtlHarga();
        list.tampil();
    }
}

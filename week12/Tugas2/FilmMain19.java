package week12.Tugas2;
import java.util.Scanner;
public class FilmMain19 {
   public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    DLL19 film = new DLL19();

    int menu;
    do {
        System.out.println("===============================");
        System.out.println("     DATA FILM LAYAR LEBAR");
        System.out.println("===============================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Terakhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating FILM-DESC");
        System.out.println("10. Keluar");
        System.out.println("===============================");
        System.out.print("PILIH MENU :");
        menu = sc.nextInt();
        sc.nextLine();
        switch (menu) {
            case 1:
                System.out.print("Id Film         : ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Judul Film      : ");
                String judul = sc.nextLine();
                System.out.print("Rating Film    : ");
                float rat = sc.nextFloat();
                film.addFirst(id, judul, rat);
                break;
            case 2:
                System.out.print("Id Film         : ");
                int id1 = sc.nextInt();
                sc.nextLine();
                System.out.print("Judul Film      : ");
                String judul1 = sc.nextLine();
                System.out.print("Rating Fillm    : ");
                float rat1 = sc.nextFloat();
                film.addLast(id1, judul1, rat1);
                break;
            case 3:
                System.out.print("Masukkan Data Film \nUrutan ke - ");
                int index = sc.nextInt();
                System.out.print("Id Film         : ");
                int id2 = sc.nextInt();
                sc.nextLine();
                System.out.print("Judul Film      : ");
                String judul2 = sc.nextLine();
                System.out.print("Rating Fillm    : ");
                float rat2 = sc.nextFloat();
                int urut = index - 1;
                film.addAtIndex(id2, judul2, rat2, urut);
                break;
            case 4:
                film.removeFirst();
                break;
            case 5:
                film.removeLast();
                break;
            case 6:
                System.out.print("Hapus Data Film \nUrutan ke - ");
                int index1 = sc.nextInt();
                int urut1 = index1 - 1;
                film.removeAt(urut1);
                break;
            case 7:
                film.print();
                break;
            case 8:
                System.out.println("Film yang ingin dicari Bedasarkan ID");
                System.out.print("ID Film : ");
                int ID = sc.nextInt();
                film.search(ID);
                film.printSearch(ID);
                break;
            case 9:
                film.sort();
                break;
            case 10:
                System.exit(0);
                break;
            default:
            System.out.println("Input yang dimasukkan salah");
                break;
        }
    } while (menu != 10);
}
}
package Week2;

public class BukuMain19 {
    public static void main(String[] args) {
        Buku19 bk1 = new Buku19(null, null, 0, 0, 0);
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.hitungHargaTotal(bk1.terjual(5));
        bk1.hitungDiskon(bk1.total);
        bk1.hitungHargaBayar(bk1.Diskon,bk1.total);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku19 bk2 = new Buku19("Self Reward", "Maheera Ayesha", 160, 29,59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku19 bukuFatih = new Buku19("Dalail al-Khairat", "Syekh Muhammad Bin Sulaiman Al-Jazuli", 184, 10, 80000);
        bukuFatih.tampilInformasi();
        bukuFatih.gantiHarga(70000);
        bukuFatih.tampilInformasi();
        bukuFatih.hitungHargaTotal(bukuFatih.terjual(4));
        bukuFatih.hitungDiskon(bukuFatih.total);
        bukuFatih.hitungHargaBayar(bukuFatih.Diskon, bukuFatih.total);
        bukuFatih.tampilInformasi();
    }
}

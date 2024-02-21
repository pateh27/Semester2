package Week2;

public class Buku19 {
    String judul, pengarang;
    int halaman, stok, harga, total, Diskon;


    void tampilInformasi(){
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    int terjual(int jml) {
        if (stok > 0) {
            stok -= jml;   
        }
        return jml;
    }
    void restock(int jml){
        stok += jml;
    }
    void gantiHarga(int hrg){
        harga = hrg;
    }
    int hitungHargaTotal(int jml){
        for (int i = 0; i <= 20; i++) {
            System.out.print("=");
        }
        System.out.println();
        total = harga * jml;
        System.out.println("Total Harga : "+total);
        return total;
    }
    
    int hitungDiskon(int hrgTotal){
        for (int i = 0; i <= 20; i++) {
            System.out.print("=");
        }
        System.out.println();
        if (hrgTotal > 150000) {
            Diskon = hrgTotal*12/100;
            System.out.println("Potongan Harga 12% atau sebesar "+Diskon);
        }else if (hrgTotal >= 75000 && hrgTotal <= 150000) {
            Diskon = hrgTotal*(5/100);
            System.out.println("Potongan Harga 5% atau sebesar "+Diskon);
        }else{
            System.out.println("Potongan Harga 0% atau sebesar 0");
        }
        return Diskon;
    }
    
    int hitungHargaBayar(int hrgDiskon, int hrgTotal){
        for (int i = 0; i <= 20; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.printf("Harga Bayar = Rp. %d - Rp. %d",hrgTotal,hrgDiskon);
        System.out.println();
        int hrgBayar = hrgTotal - hrgDiskon;
        System.out.printf("Harga Bayar = Rp. "+hrgBayar );
        System.out.println();
        total = 0;
        Diskon = 0;
        return hrgBayar;
    }

    public Buku19(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}

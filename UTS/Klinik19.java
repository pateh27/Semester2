package UTS;

public class Klinik19 {
    Pasien19[] daftarpasien;
    int jumlahPasien, kapasitas;
    
    public Klinik19(int size){
        this.daftarpasien = new Pasien19[kapasitas];
        this.jumlahPasien = -1;
        this.kapasitas = size;
    }

    public boolean cekPasien(){
        if (jumlahPasien == -1) {
          return true;  
        }else {
            return false;
        }
    }

    public boolean cekPenuh(){
        if (jumlahPasien ==  kapasitas -1) {
            return true;
        }else {
            return false;
        }
    }
    public void tambahPasien(Pasien19 psn){
        if (!cekPenuh()) {
            jumlahPasien ++;
            daftarpasien[jumlahPasien] = psn;
            System.out.println("Pasien" + psn.nama + "berhasil dijadwalkan");
        }else{
            System.out.println("Jadwal sudah penuh!!!");
        }
    }
    public  Pasien19 panggilPasien(){
        if (!cekPasien()) {
            Pasien19 delete = daftarpasien[kapasitas];
            jumlahPasien --;
            System.out.println("Pasien" + delete.nama + "silahkan keruangan dokter");
            return delete;
        }else{
            System.out.println("Tidak ada jadwal dengan pasien");
           return null; 
        }
    }

    public Pasien19 lihatPasien(){
        if (!cekPasien()) {
            Pasien19 PasienPertama = daftarpasien[jumlahPasien];
            System.out.println("Pasien pertama" + PasienPertama.nama);
            return PasienPertama;
        }else{
            System.out.println("Tidak ada pasien hari ini");
            return null;
        }
    }

    public Pasien19 lihatPasienAkhir(){
        if (!cekPasien()) {
            Pasien19 pasienTerakhir = daftarpasien[jumlahPasien];
            System.out.println("Pasien terakhir hari ini" + pasienTerakhir);
            return pasienTerakhir;
        }else{
            System.out.println("Tidak ada pasien hari ini");
            return null;
        }
    }

     public Pasien19 cariPasien(String search) {
        if (!cekPasien()) {
            for (int i = jumlahPasien; i >= 0 ; i--) {
                String kode = String.valueOf(daftarpasien[i].kodePasien);
                if (daftarpasien[i].nama.equalsIgnoreCase(search) || kode.equals(search)) {
                    System.out.println("Pasien ditemukan: ");
                    System.out.println("Kode:\t"+ daftarpasien[i].kodePasien);
                    System.out.println("Nama:\t"+ daftarpasien[i].nama);
                    return daftarpasien[i];
                }
            }
            System.out.println("Barang tidak ditemukan.");
        } else {
            System.out.println("daftarpasien barang kosong.");
        }
        return null;
    }
    public void tampilkanPasien() {
        if (!cekPasien()) { 
            System.out.println("Rincian tumpukan barang di Gudang: ");
            for (int i = jumlahPasien; i >= 0 ; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", daftarpasien[i].kodePasien, daftarpasien[i].nama, daftarpasien[i].riwayatPenyakit);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }
    
}

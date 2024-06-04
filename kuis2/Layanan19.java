package kuis2;

public class Layanan19 {
    int kodeLayanan, harga;
    String namaLayanan;
    
    Layanan19(int kodeLayanan, int harga, String namaLayanan){
        this.kodeLayanan = kodeLayanan;
        this.harga = harga;
        this.namaLayanan = namaLayanan;
    }

    public int getKodeLayanan() {
        return kodeLayanan;
    }

    public void setKodeLayanan(int kodeLayanan) {
        this.kodeLayanan = kodeLayanan;
    }

    public String getNamaLayanan() {
        return namaLayanan;
    }

    public void setNamaLayanan(String namaLayanan) {
        this.namaLayanan = namaLayanan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String toString() {
        return "Layanan{" +
                "kodeLayanan=" + kodeLayanan +
                ", namaLayanan='" + namaLayanan + '\'' +
                ", harga=" + harga +
                '}';
    }
}

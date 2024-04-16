package week3.LatihanPraktikum;

public class Mahasiswa {
   
    public String nama;
    public String nim;
    public String jenisKelamin;
    public double ipk;
    
    public Mahasiswa(String nama, String nim, String jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }
    public String toString() {
        return "Nama: " + nama + "\n"
                + "NIM: " + nim + "\n"
                + "Jenis Kelamin: " + jenisKelamin + "\n"
                + "IPK: " + ipk;
        
    }
    public double rataIpk() {
        return ipk;
    }
}

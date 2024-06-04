    package UTS;
    import java.util.Scanner;
    public class main19 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Jumlah Pasien hari ini: ");
            int kapasitas = sc.nextInt();
            Klinik19 klinik =  new Klinik19(kapasitas);

            while (true) {
                System.out.println("=================================");
                System.out.println("\t\t\t Menu \t\t\t");
                System.out.println("=================================");
                System.out.println("1. Tambah Pasien");
                System.out.println("2. Tampilakan Daftar Pasien");
                System.out.println("3. Tampilkan Daftar Pasien Pertama");
                System.out.println("4. Tampilkan Daftar Pasien Terakhir");
                System.out.println("5. Cari Pasien");
                System.out.println("6. Keluar");
                System.out.println("Pilih Menu: ");
                int choose = sc.nextInt();
            
            
            switch (choose) {
                case 1:
                    System.out.print("Masukkan Kode pasien:");
                    int kodePasien = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan Nama pasien: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan alamat pasien: ");
                    String alamat = sc.nextLine();                
                    Pasien19 tambahPasien = new Pasien19(nama, alamat, kodePasien, alamat);
                    klinik.tambahPasien(tambahPasien);
                    break;
                case 2: 
                    klinik.panggilPasien();
                    break;
                case 3:
                    klinik.tampilkanPasien();
                    break;
                case 4:
                    klinik.lihatPasien();
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("Masukkan nama / kode pasien: ");
                    String search = sc.nextLine();
                    klinik.cariPasien(search);
                    break;
                case 6:
                    System.exit(1);
                    break;
                default:
                    break;
            }
        }
    }
}
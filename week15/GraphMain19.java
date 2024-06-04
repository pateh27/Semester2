package week15;
import java.util.Scanner;
public class GraphMain19 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Graph19 gedung = new Graph19(6);
        GraphMatriks19 gdg = new GraphMatriks19(4);
        
        while (true) {
            System.out.println("=======================================");
            System.out.println("\tPILIH MENU\t");
            System.out.println("=======================================");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Egde");
            System.out.println("=======================================");
            int pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Tambahkan Maksimal 6 Vertex");
                    System.out.print("Masukkan Asal\t: ");
                    int ab = sc.nextInt();
                    System.out.println("Masukkan Tujuan\t: ");
                    int aj = sc.nextInt();
                    System.out.println("Masukkan Jarak\t: ");
                    int ak = sc.nextInt();
                    gedung.addEdge(ab, aj, ak);
                    break;
                case 2:
                    System.out.println("Masukkan Asal dan Tujuan yang ingin anda hapus");
                    System.out.println("Masukkan asal\t: ");
                    int abAS = sc.nextInt();
                    System.out.println("Masukkan Tujuan\t: ");
                    int ajAC = sc.nextInt();
                    gedung.removeEdge(abAS, ajAC);
                    break;
                case 3:
                System.out.println("Masukkan Gedung: \t Jika A =0");
                int gd = sc.nextInt();
                System.out.println("Silahkan Memilih Jenis Degree");
                System.out.println("1. InDegree");
                System.out.println("2. OutDegree");
                System.out.println("3. Total Degree");
                System.out.println("===================================");
                int mil = sc.nextInt();
    
                if (mil == 1) {
                    gdg.InDegree(gd);
                } else if (mil == 2) {
                    gdg.OutDegree(gd);
                } else if (mil == 3) {
                    gdg.degree(gd);
                }else
                System.out.println("Pilihan Tidak Sesuai");
                System.exit(0);
                    break;
                case 4:
                gedung.printGraph();
                case 5:
                System.out.print("Masukkan gedung asal : ");
                int abLs = sc.nextInt();
                System.out.print("Masukkan gedung tujuan : ");
                int ajEX = sc.nextInt();
                gedung.cekStatus(abLs, ajEX);
                    break;
    
                default:
                System.out.println("Pilihan Tidak Sesuai!!!");
                System.exit(0);
                    break;
            }
        }
    }
}

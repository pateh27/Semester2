public class RentalMX {
    public static void main(String[] args) {
        MX mx1 = new MX("6811720119", "KLX", 200000, "B 2315 RP",15);

        System.out.println("Data Sewa: ");
        mx1.tampilInformasi();
        mx1.disewa(5);
        mx1.hitungTotalHari(5);
        mx1.gantiPrice(180000);
        mx1.tampilInformasi();
    }
}

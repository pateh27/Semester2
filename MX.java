

public class MX {
    public String noKTP;
    public String merkSepeda;
    public int rentalPrice;
    public String noPolisi;
    public int total, stok;

    

    public MX(String NK, String mS, int rp,String nopol, int stok){
        this.noKTP = NK;    
        this.merkSepeda = mS;
        this.rentalPrice = rp;
        this.noPolisi = nopol;
        this.stok = stok;
     
    }

    public int disewa(int jml){
        if (stok > 0) {
            stok -= jml;
        }
        return stok;
    }
    public String KTP() {
        return noKTP;
    }
    public String getMerk() {
        return merkSepeda;
    }
    public int price() {
        return rentalPrice;
    }
    public String getNopol() {
        return noPolisi;
    }
    void gantiPrice (int hrg) {
        rentalPrice = hrg;
    }
    int hitungTotalHari(int jml){
       
        System.out.println();
        total = rentalPrice * jml;
        System.out.println("Harga total :Rp " + total);
        return total;
    }
   
    void tampilInformasi(){
        System.out.println("No KTP penyewa : " + noKTP);
        System.out.println("Merk sepeda yang disewa : " + merkSepeda);
        System.out.println("Harga rental per unit:  Rp" + rentalPrice);
        System.out.println("Nomor Polisi sepeda yang disewa : "+ noPolisi);
    }
}

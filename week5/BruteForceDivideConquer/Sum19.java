package week5.BruteForceDivideConquer;

public class Sum19 {
    int elemen;
    String nama;
    double keuntungan[], total;

    Sum19(String nama, int elemen){
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
        this.nama = nama;
        }
        public String getNama() {
            return nama;
        }
    
        public void setNama(String nama) {
            this.nama = nama;
        }
    
        public int getElemen() {
            return elemen;
        }
    
        public void setElemen(int elemen) {
            this.elemen = elemen;
        }
    
        public double[] getKeuntungan() {
            return keuntungan;
        }
    
        public void setKeuntungan(double keuntungan[]) {
            this.keuntungan = keuntungan;
        }
    
        public double getTotal() {
            return total;
        }
    
        public void setTotal(double total) {
            this.total = total;
        }
    
        public double totalBF() {
            for (int i = 0; i < elemen; i++) {
                total += keuntungan[i];
            }
            return total;
        }
    
        public double totalDC(int l, int r) {
            if (l == r) {
                return keuntungan[l];
            } else if (l < r) {
                int mid = (l + r) / 2;
                double lsum = totalDC(l, mid);
                double rsum = totalDC(mid + 1, r);
                return Math.round((lsum + rsum) * 100.0) / 100.0;
            }
            return 0;
    }
}
    
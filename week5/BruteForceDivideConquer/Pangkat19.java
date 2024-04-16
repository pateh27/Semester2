package week5.BruteForceDivideConquer;

public class Pangkat19 {
    
    public int nilai,pangkat;
    
    Pangkat19(int nilai, int pangkat){
        this.nilai = nilai;
        this.pangkat= pangkat;
    }
    int pangkatBF(int n, int a){
        int hasil = 1;
        for (int i = 0; i < a; i++) {
            hasil *= n;
        }
        return hasil;
    }
    int pangkatDC(int n, int a){
        if (a == 0) {
            return 1;
        } else {
            if (a%2==1) {
                return(pangkatDC(n, a/2) * pangkatDC(n, a/2) * n);
            } else{
                return (pangkatDC(n, a/2) * pangkatDC(n,a/2));
            }
        }

    }

}

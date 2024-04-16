package week5.BruteForceDivideConquer;

public class Faktorial {
    public int nilai;

    int faktorialBF(int n){
        int fakto = 1;
        int fakto2= 1;
        int nilai = n;
        do {
            fakto = fakto * fakto2;
            fakto2++;
        } while (fakto2 <= nilai);
        return fakto;
     }
    int faktorialDC(int n){
        if (n==1) {
            return 1;
        }
        else{
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}

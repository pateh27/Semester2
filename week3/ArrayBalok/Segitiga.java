package week3.ArrayBalok;

public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t){
        alas =a;
        tinggi = t;
    }
public float hitungLuas(){
    return (1/2) * alas * tinggi;
    }
public double hitungKeliling(){
    double miring = Math.sqrt(Math.pow(alas, 2)+ Math.pow(tinggi, 2));
    return miring + alas + tinggi;   
    }

}

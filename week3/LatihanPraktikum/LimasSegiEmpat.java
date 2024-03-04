package week3.LatihanPraktikum;

public class LimasSegiEmpat extends Main {

    public double panjangSisiAlas;
    public double tinggiLimas;
    public double luasAlas;

    public LimasSegiEmpat(double panjangSisiAlas, double tinggiLimas) {
        this.panjangSisiAlas = panjangSisiAlas;
        this.tinggiLimas = tinggiLimas;
    }
    
    public double getLuasPermukaanLimas() {
        double luasAlas = panjangSisiAlas * panjangSisiAlas;
        double luasSisiSelimut = 4 * (1.0 / 2) * panjangSisiAlas * tinggiLimas;
        return luasAlas + luasSisiSelimut;
    }
    
    public double getVolumeLimas() {
        return (1.0 / 3.0) * luasAlas * tinggiLimas;
    }
    
}

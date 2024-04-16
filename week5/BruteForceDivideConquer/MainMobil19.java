package week5.BruteForceDivideConquer;

public class MainMobil19 {
    public static void main(String[] args) {
    
        Mobil19[] dataMobil19 = {
                new Mobil19("BMW", "M2 Coupe", 2016, 6816, 728),
                new Mobil19("Ford", "Fiesta ST", 2014, 3921, 575),
                new Mobil19("Nissan", "370Z", 2009, 4360, 657),
                new Mobil19("Subaru", "BRZ", 2014, 4058, 609),
                new Mobil19("Subaru", "Impreza WRX STI", 2013, 6255, 703),
                new Mobil19("Toyota", "AE86 Trueno", 1986, 3700, 553),
                new Mobil19("Toyota", "86/GT86", 2014, 4180, 609),
                new Mobil19("Volkswagen", "Golf GTI", 2014, 4108, 631)
        };
        double akselerasiMax = Mobil19.cariAkselerasiMax(dataMobil19, 0, dataMobil19.length - 1);
        System.out.println("a) Top Acceleration Tertinggi menggunakan Divide and Conquer: " + akselerasiMax);

        double akselerasimin = Mobil19.cariAkselerasiMin(dataMobil19, 0, dataMobil19.length - 1);
        System.out.println("b) Top Acceleration Terendah menggunakan Divide and Conquer: " + akselerasimin);

        double rataRataPower = Mobil19.hitungRataRataTopPower(dataMobil19);
        System.out.println("c) Rata-rata Top Power dari seluruh mobil menggunakan Brute Force: " + rataRataPower);
    }
}
package week5.BruteForceDivideConquer;

public class Mobil19 {
    String merk, tipe;
    int tahun;
    double topAcceleration, topPower;

    public Mobil19(String merk, String tipe, int tahun, double topAcceleration, double topPower) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAcceleration = topAcceleration;
        this.topPower = topPower;
    }

    public static double cariAkselerasiMax(Mobil19[] data, int low, int high) {
        if (low == high) {
            return data[low].topAcceleration;
        } else {
            int mid = (low + high) / 2;
            double leftMax = cariAkselerasiMax(data, low, mid);
            double rightMax = cariAkselerasiMax(data, mid + 1, high);
            return Math.max(leftMax, rightMax);
        }
    }

    public static double cariAkselerasiMin(Mobil19[] data, int low, int high) {
        if (low == high) {
            return data[low].topAcceleration;
        } else {
            int mid = (low + high) / 2;
            double leftMin = cariAkselerasiMin(data, low, mid);
            double rightMin = cariAkselerasiMin(data, mid + 1, high);
            return Math.min(leftMin, rightMin);
        }
    }

    public static double hitungRataRataTopPower(Mobil19[] data) {
        double totalPower = 0;
        for (Mobil19 Mobil19 : data) {
            totalPower += Mobil19.topPower;
        }
        return totalPower / data.length;
    }
}



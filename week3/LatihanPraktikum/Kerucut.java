package week3.LatihanPraktikum;

public class Kerucut extends Main {

    public double jariJari;
    public double sisiMiring;

    public Kerucut(double jariJari, double sisiMiring) {
        this.jariJari = jariJari;
        this.sisiMiring = sisiMiring;
    }

    public double getLuasPermukaan() {
        return Math.PI * jariJari * (jariJari + sisiMiring);
    }

    public double getVolumeKerucut() {
        return (1.0 / 3.0) * Math.PI * jariJari * jariJari * sisiMiring;
    }

}

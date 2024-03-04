package week3.LatihanPraktikum;

public class Bola {
    public double jariJari;
    
    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }
    
    public double getLuasPermukaanBola() {            
        return 4 * Math.PI * jariJari * jariJari;
    }
    
    public double getVolumeBola() {
            return (4.0 / 3.0) * Math.PI * jariJari * jariJari * jariJari;
    }
    
}


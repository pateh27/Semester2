package kuis2;

public class NodeAntrian {
    Pelanggan19 pelanggan;
    Layanan19 layanan;
    NodeAntrian prev;
    NodeAntrian next;

    public NodeAntrian(Pelanggan19 pelanggan, Layanan19 layanan){
        this.pelanggan = pelanggan;
        this.layanan = layanan;
        this.prev = null;
        this.next = null;
    }
}

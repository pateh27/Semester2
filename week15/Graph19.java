package week15;

public class Graph19 {
    int vertex;
    DoubleLinkedList19 list19[];
    
    public Graph19(int v){
        vertex = v;
        list19 = new DoubleLinkedList19[v];
        for (int i = 0; i < v; i++) {
            list19[i] = new DoubleLinkedList19();
        }
    }

    public boolean isUndirected() throws Exception{
        for(int i = 0; i< vertex; i++){
            for (int j = 0; j < list19[i].size(); j++) {
                int destination = list19[i].get(j);
                if (!ListConstainEdge(list19[destination], i)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean ListConstainEdge(DoubleLinkedList19 list19, int tujuan) throws Exception{
        for (int i = 0; i < list19.size(); i++) {
            if (list19.get(i) == tujuan) {
                return true;
            }
        }
        return false;
    }

    public void addEdge(int asal, int tujuan, int jarak) throws Exception{
        list19[asal].addFirst(tujuan, jarak);
        
        if (isUndirected()) {
            list19[tujuan].addFirst(asal, jarak);
        }
    }

    public void degree(int asal) throws Exception{
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list19[i].size; j++) {
                if (list19[i].get(j) == asal) {
                    ++totalIn;
                }
            }
            for (k = 0; k < list19[asal].size; k++) {
                list19[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
        if (isUndirected()) {
            System.out.println("Degree dari Gedung " + (char) (('A') + asal) + ": " + list19[asal].size);
        }
    }

    public void removeEdge(int asal, int tujuan) throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list19[asal].remove(tujuan);
            }
        }
    }

    public void removAllEdges() throws Exception{
        for (int i = 0; i < vertex; i++) {
            list19[i].remove(i);
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (list19[i].size > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan " );
                for (int j = 0; j < list19[i].size(); j++) {
                    System.out.print((char) ('A' + list19[i].get(j)) + " (" + list19[i].getjarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
    
    public void cekStatus(int asal, int tujuan) throws Exception{
        boolean tetangga = false;

        for (int i = 0; i < list19[asal].size(); i++) {
            if (list19[asal].get(i) == tujuan) {
                tetangga = true;
                break;
            }
        }
        if (!tetangga && isUndirected()) {
            for (int i = 0; i < list19[tujuan].size(); i++) {
                if (list19[tujuan].get(i) == asal) {
                    tetangga = true;
                    break;
                }
            }
        }

        if (tetangga) {
            System.out.println("Gedung " + (char) ('A' + asal) + " dan gedung " + (char) ('A' + tujuan) + " tetangga");
        }else{
            System.out.println("Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " bukan tetangga");
        }
    }

    
}

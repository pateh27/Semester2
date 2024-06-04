package week15;

public class GraphMatriks19 {
    int vertex;
    int [][] matriks;

    public GraphMatriks19(int v){
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak){
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan){
        matriks[asal][tujuan] = -1;
    }

    public void printGraph(){
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }
    public int InDegree(int node){
        int InDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][node] != -1) {
                InDegree++;
            }
        }
        return InDegree;
    }

    public int OutDegree(int node){
        int OutDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[node][i] != -1) {
                OutDegree++;
            }
        }
        return OutDegree;
    }

    public int degree(int node){
        int InDegree = InDegree(node);
        int OutDegree = OutDegree(node);
        int degree = OutDegree + InDegree;
        return degree;
    }

    public int hitungEdge() {
        int jumlahEdge = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    jumlahEdge++;
                }
            }
        }
        return jumlahEdge;
    }

}

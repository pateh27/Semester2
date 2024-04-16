package week6;

public class HotelService {
    Hotel listHtl[] = new Hotel[5];
    int idx;
    void tambah(Hotel h){
        if (idx < listHtl.length) {
            listHtl[idx] = h;
            idx++;
        }else{
            System.out.println("FULL BOOKED");
        }
    }
    void bubbleSortHtlHarga(){
        for (int i = 0; i < listHtl.length; i++) {
            for (int j = 1; j < listHtl.length-i; j++) {
                if (listHtl[j].harga < listHtl[j-1].harga) {
                    Hotel tmp = listHtl[j];
                    listHtl[j] = listHtl [j-1];
                    listHtl[j-1] = tmp;
                }
            }
        }
    }
    void bubbleSortHtl(){
        for (int i = 0; i < listHtl.length; i++) {
            for (int j = 1; j < listHtl.length-i; j++) {
                if (listHtl[j].bintang > listHtl[j-1].bintang) {
                    Hotel tmp = listHtl[j];
                    listHtl[j] = listHtl [j-1];
                    listHtl[j-1] = tmp;
                }
            }
        }
    }
    void selectionSortHtlHarga(){
        for (int i = 0; i < listHtl.length-1; i++) {
            int idxMax = i;
            for (int j = i+1; j < listHtl.length; j++) {
                if (listHtl[j].harga < listHtl[idxMax].harga) {
                    idxMax = j;
                }
            }
            Hotel tmp = listHtl[idxMax];
            listHtl[idxMax] = listHtl[i];
            listHtl[i]= tmp;
        }
    }
    void selectionSortHtl(){
        for (int i = 0; i < listHtl.length-1; i++) {
            int idxMax = i;
            for (int j = i+1; j < listHtl.length; j++) {
                if (listHtl[j].bintang > listHtl[idxMax].bintang) {
                    idxMax = j;
                }
            }
            Hotel tmp = listHtl[idxMax];
            listHtl[idxMax] = listHtl[i];
            listHtl[i]= tmp;
        }
    }
    void tampil(){
        for(Hotel h : listHtl){
            h.tampil();
            System.out.println("-------------------------");
        }
    }
}

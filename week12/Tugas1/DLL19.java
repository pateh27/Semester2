package week12.Tugas1;

public class DLL19 {
    Vaksin19 head;
    int size;

    public DLL19(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int Nomor, String nama){
        if (isEmpty()) {
            head = new Vaksin19(null, nama, Nomor, null);
        }else {
            Vaksin19 node =  new Vaksin19(null, nama, Nomor, head);
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void addLast(int Nomor, String nama){
        if (isEmpty()) {
            addFirst(Nomor, nama);
        }else {
            Vaksin19 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Vaksin19 node = new Vaksin19(current, nama, Nomor, null);
            current.next = node;
            size++;
        }
    }

    public void remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Tidak ada antrian");
        }else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            Vaksin19 pasien = head.prev;
            System.out.println(pasien.nama + "Telah divaksisnasi");
            head.prev = null;
            size--;
        }
    }

    public void removeLast()throws Exception{
        if (isEmpty()) {
            throw new Exception("Tidak ada antrian");
        }else if (head.next == null) {
            Vaksin19 pasien = head;
            System.out.println(pasien.nama + "telah divaksinasi");
            head = null;
            size--;
            return;
        }
    }
    public void print(){
        if (!isEmpty()) {
            Vaksin19 tmp = head;
            System.out.println("|No.\t|nama\t|");
            while (tmp != null) {
                System.out.println("| "+ tmp.Nomor + "\t| " + tmp.nama + "\t|");
                tmp = tmp.next;
            }
            System.out.println("Sisa antrian : "+ size);
        }else {
            System.out.println("Tidak ada antrian");
        }
    }
}

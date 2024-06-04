package week11.Tugas;

public class QueueLinkedList {
    Node head, tail;

    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Isi Antrian: ");
            int i = 1;
            while (tmp != null) {
                System.out.println("Mahasiswa ke- "+ i);
                System.out.println(tmp.nama);
                System.out.println(tmp.nim);
                tmp = tmp.next;
                i++;
            }
        }else {
            System.out.println("Antrian kosong");
        }
    }

    void add(String n, int input){
        Node ndInput = new Node(n, input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void remove(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong, tidak dapat dihapus");
        }else if (head == tail) {
            head = tail = null;
        }else{
            head = head.next;
        }
    }
}

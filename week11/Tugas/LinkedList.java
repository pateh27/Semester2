package week11.Tugas;

public class LinkedList {
    Node head, tail;

    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("isi linked List");
            System.out.println();
            int i = 1;
            while (tmp != null) {
                System.out.println("Mahasiswa ke- " + i);
                System.out.println(tmp.nama);
                System.out.println(tmp.nim);
                tmp = tmp.next;
                i++;
            }
            System.out.println("");
        }else{
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(String n, int input){
        Node ndInput = new Node(n, input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(String n, int input){
        Node ndInput = new Node(n, input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input, String n){
        Node ndInput = new Node(n, input, null);
        Node temp = head;
        do {
            ndInput.next = temp.next;
            temp.next = ndInput;
            if (ndInput.next == null) {
                tail = ndInput;
                break;
            }
            temp = temp.next;
        } while (temp == null);
    }

    void insertAt(int index, int input, String n) {
        Node ndInput = new Node(n, input, null);
        if (index > 0) {
            Node temp = head;
            for (int i = 0; i < index -1; i++) {
                temp = temp.next;
            }
            ndInput.next = temp.next;
            temp.next = ndInput;
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }else if(index == 0){
            addFirst(n, input);
        }else if (index == -1) {
            System.out.println("Linked List Kosong");
        }
    }

    
}

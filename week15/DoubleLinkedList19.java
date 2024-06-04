package week15;

public class DoubleLinkedList19 {
    
    Node19 head = null;
    int size = 0;
    
    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int item, int jarak){
        if (isEmpty()) {
            head = new Node19(null, item, jarak, head);
        }else{
            Node19 newNode = new Node19(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast (int item, int jarak){
        if (isEmpty()) {
            addFirst(item, jarak);
        }else{
            Node19 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node19 newNode19 = new Node19(current, item, jarak, null);
            current.next = newNode19;
            size++;
        }
    }

    public void add(int item,int index, int jarak) throws Exception{
        if (index < 0 || index > size) {
            throw new Exception("Nilai indeks diluar batas");
        }
        if (index == 0) {
            addFirst (item, jarak);
        }else if (index == size) {
            addLast(item, jarak);
        }else{
            Node19 current = head;
            for(int i = 0; i< index -1; i++){
                current = current.next;
            }
            Node19 newNode19 = new Node19(current, index, jarak, current.next);
            current.next.prev = newNode19;
            current.next = newNode19;
            size++;
        }
    }

    public int getjarak(int index) throws Exception{
        if (index < 0 || index >= size) {
            throw new Exception("Nilai indeks diluar batas");
        }
        Node19 tmp = head;
        for (int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node19 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int getFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("LinkedList masih kosong");
        }
        Node19 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void remove(int data) throws Exception{
        Node19 current = head;
        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                }else{
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                size--;
                return;
            }
            current = current.next;
        }
        throw new Exception("Node dengan data " + data + "tidak ditemukan");
    }

    public void removeLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih Kosong!");
        }
        if (head.next == null) {
            head = null;
        }else{
            Node19 current = head;
            while (current.next.next != null) {
                current = current.next;
            }
        }
        size--;
    }

    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list Kosong!");
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        size--;
    }

    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public void updateJarak(int index, int newJarak) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Nilai indeks diluar batas");
        }
        Node19 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.jarak = newJarak;
    }

}

package kuis2;

public class antrianBengkel {
    Pelanggan19 head, tail;
    int size;

    public antrianBengkel(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(Pelanggan19 pelanggan, Layanan19 layanan){
        NodeAntrian newNode = new NodeAntrian(pelanggan, layanan);
        if (head == null) {
            head = tail = newNode;
        }
    }
    // public void addFirst(String nama, String nomor){
    //     if (isEmpty()) {
    //         head =  new Pelanggan19(null, nama, nomor, null);
    //     }else{
    //         Pelanggan19 newPelanggan19 = new Pelanggan19(null, nama, nomor, head);
    //         head.prev = newPelanggan19;
    //         head = newPelanggan19;
    //     }
    //     size++;
    // }

    // public void addLast(String nama, String noHP){
    //     if (isEmpty()) {
    //         addFirst(nama, noHP);
    //     }else{
    //         Pelanggan19 current = head;
    //         while (current.next != null) {
    //             current = current.next;
    //         }
    //         Pelanggan19 node = new Pelanggan19(current, nama, noHP, null);
    //         current.next = node;
    //         size++;
    //     }
    // }

    // public void remove() throws Exception{
    //     if (isEmpty()) {
    //         throw new Exception("Tidak ada antrian");
    //     }else if (size==1) {
    //         removeLast();
    //     }else {
    //         head = head.next;
    //         Pelanggan19 pelanggan = head.prev;
    //         System.out.println(pelanggan.namaPelanggan + "Telah Selesai di servis");
    //         head.prev = null;
    //         size--;
    //     }
    // }

    // public void removeLast()throws Exception{
    //     if (isEmpty()) {
    //         throw new Exception("Tidak ada antrian");
    //     }else if (head.next == null) {
    //         Pelanggan19 pelanggan = head;
    //         System.out.println(pelanggan.namaPelanggan + "Telah selesai di servis");
    //         head = null;
    //         size--;
    //         return;
    //     }
    // }

   public void print(){
    Pelanggan19 temp = head;
    while (temp != null) {
        System.out.println(temp.namaPelanggan + " -> " + temp.layanan);
    }
   }
}
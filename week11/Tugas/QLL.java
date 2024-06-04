package week11.Tugas;

public class QLL {
    public static void main(String[] args) {
        QueueLinkedList ql = new QueueLinkedList();

        ql.add("Anton", 111);
        ql.add("Prita", 112);
        ql.add("Yusuf", 113);
        ql.add("Doni", 114);
        ql.add("Sari", 115);

        System.out.println("Isi awal antrian ");
        ql.print();

        ql.remove();

        System.out.println();
        System.out.println("Isi antrian setelah remove: ");
        ql.print();
    }
}

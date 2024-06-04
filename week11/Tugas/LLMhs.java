package week11.Tugas;

public class LLMhs {
    public static void main(String[] args) {
        LinkedList LLMhs = new LinkedList();

        LLMhs.print();
        LLMhs.addFirst("Anton", 111);
        LLMhs.print();
        LLMhs.addLast("Sari", 115);
        LLMhs.print();
        LLMhs.insertAfter(111, 123, "Prita");
        LLMhs.print();
        LLMhs.insertAfter(112, 113, "Yusuf");
        LLMhs.print();
        LLMhs.insertAt(3, 114, "Doni");
        LLMhs.print();
    }
}

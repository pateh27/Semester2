package week14;

public class BinaryTreeArrayMain19 {
    public static void main(String[] args) {
        BinaryTreeArray19 bta = new BinaryTreeArray19();
        int [] data = {60,40,80,30,50,70,90};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.println("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\nPostOrder Traversal : ");
        bta.traversePostOrder(0);
        System.out.println("\nPreorder Traversal : ");
        bta.traversePreOrder(0);
        System.out.println("\n");
    }
}

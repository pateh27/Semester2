package week14;

public class BinaryTreeMain19 {
    public static void main(String[] args) {
        BinaryTree19 bt = new BinaryTree19();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        System.out.print("Preorder Transversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("Inorder Transversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("Postorder Transversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");

        System.out.println("Find Node: " + bt.find(5));
        System.out.println("Delete Node 8");
        bt.delete(8);
        System.out.println("");
        System.out.print("Preorder Transversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        System.out.println("Max Value");
        bt.findMax();
        System.out.println("");
        System.out.println("Min Value");
        bt.findMin();
        System.out.print("Leaves : ");
        bt.printLeaves(bt.root);
        System.out.println("");
        System.out.println("Number Of Leaves:  " + bt.countLeaves(bt.root));
         
    }

}

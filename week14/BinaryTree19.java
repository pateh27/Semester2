package week14;

public class BinaryTree19 {
    Node19 root;

    public BinaryTree19(){
        root = null;
    }
    boolean isEmpty(){
        return root == null;
    }

   
    void add(int data) {
        if (isEmpty()) {
            root = new Node19(data);
        } else {
            Node19 current = root;
            while (true) {
                if (data > current.data) {
                    if (current.right == null) {
                        current.right = new Node19(data);
                        break;
                    } else {
                        current = current.right;
                    }
                } else if (data < current.data) {
                    if (current.left == null) {
                        current.left = new Node19(data);
                        break;
                    } else {
                        current = current.left;
                    }
                } else {
                    break;  
                }
            }
        }
    }



    boolean find(int data) {
        Node19 current = root;
        while (current != null) {
            if (current.data == data) {
                return true;
            } else if (data > current.data) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return false;
    }


    void traversePreOrder(Node19 node){
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.rigth);
        }
    }

    void traversePostOrder(Node19 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }


   
    void traverseInOrder(Node19 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }


    Node19 getSuccessor(Node19 del) {
        Node19 successor = del.right;
        Node19 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        Node19 parent = null;
        Node19 current = root;
        boolean isLeftChild = false;
        while (current != null && current.data != data) {
            parent = current;
            if (data < current.data) {
                current = current.left;
                isLeftChild = true;
            } else {
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        }
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else {
            Node19 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
    }

    Node19 addRekursif(Node19 current, int data){
        if (current == null) {
            return new Node19(data);
        }

        if (data < current.data) {
            current.left = addRekursif(current.left, data);
        }else if (data > current.data) {
            current.right = addRekursif(current.right, data);
        }
        return current;
    }

    void findMin(){
        if (isEmpty()) {
            System.out.println("Tree is empty");
        }
        Node19 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println(current.data);
    }

    void findMax(){
        if (isEmpty()) {
            System.out.println("Tree is empty");
        }
        Node19 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println(current.data);
    }

    void printLeaves(Node19 node){
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(" " + node.data);
            }
            printLeaves(node.left);
            printLeaves(node.right);
        }
    }

    int countLeaves(Node19 node){
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        
        return countLeaves(node.left) + countLeaves(node.right);
        
    }
    
}


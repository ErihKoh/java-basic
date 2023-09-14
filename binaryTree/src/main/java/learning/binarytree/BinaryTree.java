package learning.binarytree;


public class BinaryTree {

    public static void main(String[] args) {
       Tree tree = new Tree();
       tree.insertNode(6);
       tree.insertNode(8);
       tree.insertNode(5);
       tree.insertNode(8);
       tree.insertNode(2);
       tree.insertNode(9);
       tree.insertNode(7);
       tree.insertNode(4);
       tree.insertNode(10);
       tree.insertNode(3);
       tree.insertNode(1);
       
       
      
       // отображение дерева:
       tree.printTree();
       
    }
}
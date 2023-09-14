package learning.binarytree;

import java.util.Stack;

public class Tree {
    
    private class Node {
        private int value; // key of node
        private Node leftNode; // left child
        private Node rightNode; // right child
    
        public void printNode() { // output value
            System.out.println("Current node have value: " + value);
        }
    
    // getter and setter
    
        public int getValue() {
            return this.value;
        }
    
        public void setValue(final int value) {
            this.value = value;
        }   
    
        public Node getLeftNode() {
            return this.leftNode;
        }
    
        public void setLeftNode(final Node leftNode) {
            this.leftNode = leftNode;
        }
    
        public Node getRightNode() {
            return this.rightNode;
        }
    
        public void setRightNode(final Node rightNode){
            this.rightNode = rightNode;
        }
    
        @Override
        public String toString() {
            return "Node{" +
               "value=" + value +
               ", leftChild=" + leftNode +
               ", rightChild=" + rightNode +
               '}';
        }
    }
    private Node rootNode;
    
    public Tree() {
       rootNode = null;
    }
    
    public Node searchNodeByValue(int value) {
        Node currentNode = rootNode;
        while (currentNode.getValue() != value){
            if (value < currentNode.getValue()) {
                currentNode = currentNode.getLeftNode();
            }
            else {
                currentNode = currentNode.getRightNode();
            }
            if (currentNode == null) {
                return null;
            }
        }
        return currentNode;
    }
    
    public void insertNode(int value) {
        Node newNode = new Node();
        newNode.setValue(value);
        
        
        if (rootNode == null) {
            rootNode = newNode;
        }
        else {
            Node currentNode = rootNode;
            Node parentNode;
            
            while (true) {
                
                parentNode = currentNode;
                
                if (value == currentNode.getValue()) {
                    System.out.println("Node already exist");
                    return;
                }
                
                if (value < currentNode.getValue()) {
                    currentNode = currentNode.getLeftNode();
                    if (currentNode == null) {
                        parentNode.setLeftNode(newNode);
                        return;
                    }
                }
                
                if (value > currentNode.getValue()) {
                    currentNode = currentNode.getRightNode();
                    if (currentNode == null) {
                        parentNode.setRightNode(newNode);
                        return;
                    
                }
                
                
                }
            }
        }
        
    }
    
    public void printTree() { // метод для вывода дерева в консоль
       Stack globalStack = new Stack(); // общий стек для значений дерева
       globalStack.push(rootNode);
       int gaps = 32; // начальное значение расстояния между элементами
       boolean isRowEmpty = false;
       String separator = "-----------------------------------------------------------------";
       System.out.println(separator);// черта для указания начала нового дерева
       while (isRowEmpty == false) {
           Stack localStack = new Stack(); // локальный стек для задания потомков элемента
           isRowEmpty = true;

           for (int j = 0; j < gaps; j++)
               System.out.print(' ');
           while (globalStack.isEmpty() == false) { // покуда в общем стеке есть элементы
               Node temp = (Node) globalStack.pop(); // берем следующий, при этом удаляя его из стека
               if (temp != null) {
                   System.out.print(temp.getValue()); // выводим его значение в консоли
                   localStack.push(temp.getLeftNode()); // соохраняем в локальный стек, наследники текущего элемента
                   localStack.push(temp.getRightNode());
                   if (temp.getLeftNode() != null ||
                           temp.getRightNode() != null)
                       isRowEmpty = false;
               }
               else {
                   System.out.print("__");// - если элемент пустой
                   localStack.push(null);
                   localStack.push(null);
               }
               for (int j = 0; j < gaps * 2 - 2; j++)
                   System.out.print(' ');
           }
           System.out.println();
           gaps /= 2;// при переходе на следующий уровень расстояние между элементами каждый раз уменьшается
           while (localStack.isEmpty() == false)
               globalStack.push(localStack.pop()); // перемещаем все элементы из локального стека в глобальный
       }
       System.out.println(separator);// подводим черту
   }
   
}

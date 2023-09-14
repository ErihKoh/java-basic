package learning.mylinked.list;


public class LinkedList {
    private class Node {
        private Node next;
        private Integer data;
	
        public Node() {
        }

        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
        public Integer getData() {
            return data;
        }
        public void setData(Integer data) {
            this.data = data;
        }
    }
    
    private Node firstNode;
    private int length;
    
    public LinkedList() {
        firstNode = null;
        length = 0;
    }

    public void add(Integer data) {
        Node newNode = new Node();
        newNode.setData(data);
        
        if (firstNode == null) {
            firstNode = newNode; 
            length += 1;
        }
        else {
            Node currentNode = firstNode;
            while (currentNode.getNext() != null) {
               
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
            
            length += 1;
        }
              
    }

    public Integer get(int index) {
        Node currentNode = firstNode;
        int value = -1;
        if (index == 0 || currentNode == null) {
            return value;
        }
        
        for (int i = 0; i <= index; i += 1) {
            if (i == index) {
                value = currentNode.getData();
            }
            currentNode = currentNode.getNext();
        }
        
        return value;    
    }

    public boolean delete(int index) {
        Node currentNode = firstNode;
        Node deletedNode = null;
        
        if (index == 0) {
            firstNode = null;
            return false;
        }
        else if (index > 0 || index <= length) {
            for (int i = 0; i < length; i += 1) {
                if (i == index) {
                    
                }
                
                currentNode = currentNode.getNext();
            }
        }
        return false;    
    }

    public int size() {

        return length;          
    }
    
    public void printList(LinkedList list) {
        
        int length = list.size();
        
        Node currentNode;
        currentNode = firstNode;
        System.out.println(currentNode.getData());
        if (currentNode.getNext() == null) {
            return;
        }
        
        for (int i = 0; i < length - 1; i++) {
         
            currentNode = currentNode.getNext();
            System.out.println(currentNode.getData());
        }
        
    }
}

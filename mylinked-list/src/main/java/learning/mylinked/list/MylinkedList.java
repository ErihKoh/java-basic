package learning.mylinked.list;

public class MylinkedList {

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
       // вставляем узлы в дерево:
       list.add(6);
       list.add(8);
       list.add(5);
       list.add(4);
       list.add(9);
       list.add(10);
       list.add(24);
       list.add(25);
       
       
       System.out.println(list.size());
       System.out.println("--------------------------------------------");
       list.printList(list);
       
       System.out.println("--------------------------------------------");
       
       System.out.println(list.get(3));
    }
}

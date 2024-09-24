package datastructures;

public class Main {

  public static void main(String[] args) {
    SingleLinkedList linkedList = new SingleLinkedList(0);
    System.out.println(linkedList);

    linkedList.insertHead(1);
    System.out.println(linkedList);

    linkedList.insertTail(2);
    System.out.println(linkedList);

    linkedList.insertAt(1, 3);
    System.out.println(linkedList);

    linkedList.insertAt(0, 4);
    System.out.println(linkedList);

    linkedList.removeAt(1);
    System.out.println(linkedList);
  }

}

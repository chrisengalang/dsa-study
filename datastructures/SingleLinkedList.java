package datastructures;

public class SingleLinkedList {
  private Node head;
  private Node tail;

  public SingleLinkedList(int val) {
    this.head = new Node(val);
    this.tail = head;
  }

  public void removeAt(int index) {
    if (index == 0) {
      this.head = head.next;
    } else {
      Node current = this.head;
      Node previous = null;
      int i = 0;
      while (i < index && current != null) {
        previous = current;
        current = current.next;
        i++;
      }

      previous.next = current.next;
    }
  }

  public void insertAt(int index, int val) {
    if (index == 0) {
      this.head = new Node(val, this.head);
    } else {
      Node current = this.head;
      Node previous = null;
      int i = 0;
      while (i < index && current != null) {
        previous = current;
        current = current.next;
        i++;
      }

      Node newNode = new Node(val, current);
      previous.next = newNode;
    }
  }

  public void insertHead(int val) {
    Node newHead = new Node(val, head);
    this.head = newHead;
  }

  public void insertTail(int val) {
    Node newTail = new Node(val);
    tail.next = newTail;
    this.tail = newTail;
  }

  public String toString() {
    Node current = head;
    StringBuilder builder = new StringBuilder();

    while (current != null) {
      builder.append(current.val);
      current = current.next;
      if (current != null) {
        builder.append(", ");
      }
    }

    return builder.toString();
  }

}

class Node {
  int val;
  Node next;

  public Node(int val) {
    this.val = val;
    this.next = null;
  }

  public Node(int val, Node next) {
    this.val = val;
    this.next = next;
  }
}

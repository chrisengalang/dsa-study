package datastructures;

public class Main {

  public static void main(String[] args) {
    ResizeableArray array = new ResizeableArray(2);

    array.add(0);
    array.add(1);
    array.add(2);
    array.add(3);

    array.set(0, 5);

    System.out.println("Array length: " + array.length());
    System.out.println("Array capacity: " + array.capacity());
    System.out.println(array.toString());
  }

}

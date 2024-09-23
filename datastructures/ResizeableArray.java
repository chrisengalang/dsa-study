package datastructures;

public class ResizeableArray {
  private int[] array;
  private int length;
  private int capacity;

  public ResizeableArray(int capacity) {
    this.length = 0;
    this.capacity = capacity;
    array = new int[capacity];
  }

  public int get(int index) {
    return array[index];
  }

  public int remove(int index) {
    if (index > length) {
      return -1;
    }

    int item = this.get(index);

    for (int i = index; i < this.length; i++) {
      array[i] = array[i + 1];
    }
    length--;

    return item;
  }

  public void add(int value) {
    this.array[length] = value;
    length++;

    if (length == capacity) {
      this.resize();
    }
  }

  public void set(int index, int value) {
    if (index < length) {
      this.array[index] = value;
    }
  }

  public void resize() {
    int newCapacity = this.capacity * 2;

    int[] newArray = new int[newCapacity];

    for (int i = 0; i < array.length; i++) {
      newArray[i] = array[i];
    }

    array = newArray;
    this.capacity = newCapacity;
  }

  public int length() {
    return this.length;
  }

  public int capacity() {
    return this.capacity;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    for (int i = 0; i < length; i++) {
      if (i != 0) {
        sb.append(", ");
      }
      sb.append(array[i]);
    }
    sb.append("]");
    return sb.toString();
  }
}
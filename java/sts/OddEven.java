class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
    this.next = null;
  }
}

class LinkedList{
  Node head;
  public void append(int data){
    Node newNode = new Node(data);
    if(head == null){
      head = newNode;
      return;
    }
    Node current  = head;
    while(current.next != null){
      current = current.next;
    }
    current.next = newNode;
  }
  public void evenOdd(){
    Node evenHead = null; Node evenTail = null;
    Node oddHead = null; Node oddTail = null;
    Node current  = head;
    while(current != null){
      int data = current.data;
      if(data % 2 == 0){
        if(evenHead == null){
          evenHead = evenTail = current;
        }else{
          evenTail.next = current;
          evenTail = current;
        }
      }else{
          if(oddHead == null){
            oddHead = oddTail = current;
          }else{
            oddTail.next = current;
            oddTail = current;
          }
      }
      current = current.next;
    }
    if(evenHead != null){
      evenTail.next = oddHead;
    }
    if(oddHead != null){
      oddTail.next = null;
    }
    head = evenHead != null ? evenHead : oddHead;
  }
  public void print(){
    Node current = head;
    while(current != null){
      System.out.print(current.data+" ");
      current = current.next;
    }
  }
}

public class OddEven{
  public static void main(String[] args){
    LinkedList ll = new LinkedList();
    ll.append(1);
    ll.append(2);
    ll.append(3);
    ll.append(4);
    ll.print();
    ll.evenOdd();
    System.out.println();
    ll.print();
  }
}
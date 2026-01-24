
import java.util.HashSet;

class Node{
  int data;
  Node next;

  Node(int data){
    this.data  = data;
    this.next = null;
  }
}
public class LoopDetection {
    public static boolean floydAlgo(Node head){
      Node slow = head;
      Node fast = head ;
      while(slow.next != null && fast.next != null && fast.next.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(fast == slow){
          return true;
        }
      }
      return false;
    }
    public static boolean detectLoop(Node head){
      HashSet<Node> st = new HashSet<>();
      while(head !=  null){
        if(st.contains(head)){
          return true;
          }
        st.add(head);
        head = head.next;
      }
      return false;

    }
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(4);
        head.next.next.next = head.next; // loop created

        System.out.println(detectLoop(head)); // true
             // TC:O(n) and SC: O(n)

        System.out.println(floydAlgo(head));
        // TC: O(n) and SC : O(1)
    }
}

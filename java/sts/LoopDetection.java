
import java.util.HashSet;

class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

public class LoopDetection {

    public static boolean detectLoop(Node head) {
        HashSet<Node> st = new HashSet<>(); // FIXED HERE

        while (head != null) {
            if (st.contains(head))
                return true;

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
    }
}

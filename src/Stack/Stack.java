package Stack;

public class Stack {
    class Node {
        int data;
        Node next;
        public Node(int item) {
            data = item;
            next = null;
        }
        public Node(int item, Node next) {
            data = item;
            this.next = next;
        }
    }
    Node head;
    public Stack() {
        head = null;
    }
    public void push(int item) {
        if ( head == null) {
            head = new Node(item);
        } else
        {
            head = new Node(item, head);
        }
    }
    public int pop() {
        int item = head.data;
        head = head.next;
        return item;
    }
    public int peek() {
        return head.data;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public int size() {
        int s = 0;
        Node temp = head;
        while ( temp != null ) {
            s++;
            temp = temp.next;
        }
        return s;
    }
    public static void main(String[]args) {
        Stack s = new Stack();
        s.push(10);
        s.push(90);
        s.push(50);
        s.push(30);
        s.push(60);
        s.push(80);
        s.push(20);
        s.push(40);
        s.push(70);
        System.out.println(s.peek());
        System.out.println(s.size());
    }
}


package Queue;

public class Queue {
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
    public Queue() {
        head = null;
    }
    public void push(int item) {
        if ( head == null) {
            head = new Node(item);
        } else {
            Node tail = head;
            while ( tail.next != null ) {
                tail = tail.next;
            }
            tail.next = new Node(item);
        }
    }
    public int pop() {
        if ( head != null ) {
            int item = head.data;
            head = head.next;
            return item;
        }
        return -1;
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
        Queue queue = new Queue();
        queue.push(10);
        queue.push(90);
        queue.push(50);
        queue.push(30);
        queue.push(60);
        queue.push(80);
        queue.push(20);
        queue.push(40);
        queue.push(70);
        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}

package LinkedList;

import Queue.Queue;

public class LinkedList {
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
    public LinkedList() {
        head = null;
    }
    public void add(int item, int option) {
        if ( head == null ) {
            head = new Node(item);
            return;
        }
        switch(option) {
            case 1:
                addAtStarting(item);
                break;
            case 2:
                addInBetween(item, size() / 2);
                break;
            case 3:
                addAtEnding(item);
                break;
        }
    }
    public void addAtStarting (int item) {
        head = new Node(item, head);
    }
    public void addInBetween (int item, int loc) {
        int currLoc = 0;
        Node n = head;
        while ( n.next != null && currLoc < loc ) {
            n = n.next;
            currLoc++;
        }
        n.next = new Node(item, n.next);
    }
    public void addAtEnding (int item) {
        Node end = head;
        while ( end.next != null ) {
            end = end.next;
        }
        end.next = new Node(item);
    }
    public void delete(int option) {
        if ( head == null ) {
            return;
        } else if ( head.next == null ) {
            deleteFromStarting();
            return;
        }
        switch(option) {
            case 1:
                deleteFromStarting();
                break;
            case 2:
                deleteInBetween(size() / 2);
                break;
            case 3:
                deleteFromEnding();
                break;
        }
    }
    public int deleteFromStarting () {
        int item = head.data;
        head = head.next;
        return item;
    }
    public int deleteInBetween (int loc) {
        int currLoc = 0;
        Node n = head, p = head;
        while ( n != null && currLoc < loc-1 ) {
            p = n;
            n = n.next;
            currLoc++;
        }
        if ( currLoc != size() ) {
            assert n != null;
            p.next = n.next;
            return n.data;
        }
        return -1;
    }
    public int deleteFromEnding () {
        Node end = head, prev = head;
        while ( end.next != null ) {
            prev = end;
            end = end.next;
        }
        prev.next = null;
        return end.data;
    }
    public int top() {
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
        LinkedList s = new LinkedList();
        s.add(10, 1);
        s.add(90, 1);
        s.add(50, 2);
        s.add(30, 3);
        s.add(60, 1);
        s.add(80, 1);
        s.add(20, 3);
        s.add(40, 3);
        s.add(70, 2);
        System.out.println(s.top());
        System.out.println(s.size());
    }

}


package linkedlist;

import java.util.LinkedList;

public class SingleLinkedList {

    Node head;
    Node tail;
    int size = 0;
    private class Node{

        int data;

        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void printLinkedList() {
        Node current = head;
        if (head == null) {
            System.out.println("empty list");
            return;
        }

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(5);
        linkedList.addNode(6);
        linkedList.addNode(7);

        LinkedList<Object> linkedList1 = new LinkedList<>();
        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(3);
        linkedList1.add(4);
        linkedList1.add(5);
        linkedList1.add(6);
        linkedList1.add(7);
        linkedList1.add(2,9);
        linkedList1.addFirst(19);
        linkedList1.push(20);
        linkedList1.remove();

        for (int i = 0; i < linkedList1.size(); i++) {
            System.out.println(linkedList1.get(i));
        }

        linkedList.printLinkedList();
    }
}

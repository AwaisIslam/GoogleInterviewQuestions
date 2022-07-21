package linkedlist;

public class SinglyLinkedList {
    // Node of the singly linked list
    private class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    // head and tail of the singly linked list
    Node head = null;
    Node tail = null;
    int size = 0;

    // addAtHead() will add a new node to the head of the linked list
    public void addAtHead(int data) {
        Node node = new Node(data);
        if (size == 0) head = tail = node;
        else {
            node.next = head;
            head = node;
        }
        size++;
    }

    // addAtTail() append a node of value val to the end of the linked list.
    public void addAtTail(int data) {
        Node node = new Node(data);
        if (size == 0) head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    private Node getNode(int index) {
        Node p = head;
        for (int i = 0; i < index; ++i) p = p.next;
        return p;
    }

    // addAtIndex() will add note at a given index
    public void addAtIndex(int index, int data) {
        if (index < 0 || index > size) return;
        if (index == 0) addAtHead(data);
        else if (index == size) addAtTail(data);
        else {
            Node prevNode = getNode(index - 1);
            Node node = new Node(data);
            node.next = prevNode.next;
            prevNode.next = node;
            size++;
        }
    }

    // traverse() will traverse the linked list from left to right
    public void traverse() {
        if (head == null) return;
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // search() will return the index of given node or -1
    public int search(int val) {
        if (head == null) return -1;
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data == val) return index;
            index++;
            current = current.next;
        }
        return -1;
    }

    // deleteAtIndex() method will remove the node from a given index
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node prevNode = getNode(index - 1);
            prevNode.next = prevNode.next.next;
            if (index == size - 1) {
                tail = prevNode;
            }
        }
        size--;
    }

    public void deleteEntireList() {
        head = tail = null;
    }

    // print() will the all the nodes present in the list
    public void print() {
        // initially current point will point to the first node
        Node current = head;

        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        System.out.println("Nodes of the singly linked list:");
        while (current != null) {
            // print node and move current pointer to the next node
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        // Add 1, 2, 3, 4 nodes to the linikedList
        linkedList.addAtHead(1);
        linkedList.addAtHead(0);
        linkedList.addAtTail(4);
        linkedList.addAtIndex(2,2);
        linkedList.addAtIndex(3,3);
        linkedList.addAtTail(5);

        /* 0->1->2->3->4->5->null */
        // linkedList = 0->1->2->3->4->5->null

        // Delete a specific node
        linkedList.deleteAtIndex(3);

        // print the nodes of the linked list
        linkedList.print();
        // output: 0 1 2 3 4 5

        System.out.println("deleteEntireList() Operation:");
        // linkedList = 0->1->2->3->4->5->null
        linkedList.deleteEntireList();
        // after deletion, linkedList = null
        // print the nodes of the linked list
        linkedList.print();
        // output: Linked List is Empty.
    }
}

package org.riv.dsa;

 public class LinkedList {
    
    Node head;

    static class Node {
        
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    
    public static LinkedList insert(LinkedList list, int data) {

        // First is to make a new node containing the data

        Node new_node = new Node(data);

        // Check first if the list head is null or empty meaning
        // that there is no linked list yet.

        // If true then assign new node as the head
        if ( list.head == null ) {
            list.head = new_node;
        } else {
            // Else then iterate through the linked list.
            // Create a new Node object assigning the head
            // so that we can access the linked list.
            Node last = list.head;
            while (last.next != null) {
                // While the next node is not null that means
                // that we are not at the end of the list.
                // Therefore we set last as the next node.
                last = last.next;
            }
            // Once this condition breaks, that means we reached
            // the end of the linked list and now we can insert the data.
            last.next = new_node;
        }   
        return list;
    }

    public static void printList(LinkedList list) {
        
        Node current_node = list.head;

        while (current_node != null) {
            System.out.print(current_node.data);
            if (current_node.next != null) {
                System.out.print(" -> ");
            }
            current_node = current_node.next;
        }

    }

    public static LinkedList delete(LinkedList list, int index) {

        // Create the Node objects

        Node current_node = list.head, prev = null;

        // If index == 0, then set next node as head
        if (index == 0) {
            list.head = current_node.next;
        }

        int counter = 0;
        while (current_node != null) {
            if (counter == index) {
                prev.next = current_node.next;
                break;
            } else {
                prev = current_node;
                current_node = current_node.next;
                counter++;
            }
        }

        if (current_node == null) {
            // this means that the given index is out of bounds
            // of the size of the linked list.
            System.out.printf("Given index (%d) is out of bounds from list size (%d)", index, counter);
        }

        return list;
    }   

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();

        list = insert(list, 165);
        list = insert(list, 232);
        list = insert(list, 542);
        list = insert(list, 236);
        list = insert(list, 365);
        list = insert(list, 456);

        list = delete(list, 2);

        printList(list);

    }
}

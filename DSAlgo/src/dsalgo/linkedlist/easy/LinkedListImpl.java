/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsalgo.linkedlist.easy;

/**
 *
 * @author Hp
 */
public class LinkedListImpl<T> {
    //Leetcode:https://leetcode.com/problems/design-linked-list/
    private Node head;

    class Node {

        private T data;
        private Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }

    }

    //operations on linked list
    //0.add sequentially
    //1. insert at start
    //2. insert at middle
    //3. insert at last
    //4. search
    //5. delete from last
    //6. delete from middle
    //7. delete from start
    //8. traverse optional
    //9. get length optional
    public void add(T data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node headPointer = head;
            //append to next of head
            while (headPointer.next != null) {
                headPointer = headPointer.next;
            }
            headPointer.next = node;
        }
    }

    public void addFirst(T data) {
        Node node = new Node(data);
        if (head != null) {
            node.next = head;
            head = node;
        }
    }

    public void addMiddle(T data, int pos) {
        if (head != null) {
            Node node = new Node(data);
            //50->10->70->20->30->null
            if (pos > 1) {
                int i = 0;
                Node headPointer = head;
                //pos - 2 as we need exact previous node of target position 
                while (i < pos - 2) {
                    headPointer = headPointer.next;
                    i++;
                }
                node.next = headPointer.next;
                headPointer.next = node;
            } else {
                System.out.println("Use Add first method to add node at start.");
            }
        }
    }

    public void addLast(T data) {
        Node node = new Node(data);
        Node headPointer = head;
        while (headPointer.next != null) {
            headPointer = headPointer.next;
        }
        headPointer.next = node;
    }

    public void deleteStart() {
        if (head != null) {
            Node deletedNode = head;
            head = head.next;
            deletedNode = null;
        }
    }

    public void delete(int pos) {
        if (head != null) {
            //50->10->70->20->30->null
            if (pos > 1) {
                int i = 0;
                Node headPointer = head;
                //pos - 2 as we need exact previous node of target position 
                while (i < pos - 2) {
                    headPointer = headPointer.next;
                    i++;
                }
                Node nodeDeleted = headPointer.next;
                headPointer.next = headPointer.next.next;
                nodeDeleted = null;
            } else {
                System.out.println("Use Delete start method to delete node from ist postion.");
            }
        }
    }

    public void traverse() {
        if (head != null) {
            System.out.print(head.data + "->");
        }
        Node headPointer = head;
        while (headPointer.next != null) {
            headPointer = headPointer.next;
            System.out.print(headPointer.data + "->");
        }
        System.out.print("null\n");
    }

    public static void main(String args[]) {
        LinkedListImpl<Integer> linkedList = new LinkedListImpl();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.addFirst(50);
        linkedList.addMiddle(70, 3);
        linkedList.addMiddle(100, 4);
        linkedList.addMiddle(200, 5);
        linkedList.addLast(500);
        linkedList.traverse();
        linkedList.deleteStart();
        linkedList.traverse();
        linkedList.deleteStart();
        linkedList.traverse();
        linkedList.delete(3);
        linkedList.traverse();
    }

}

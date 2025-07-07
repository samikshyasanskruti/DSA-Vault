package assignment6;

import java.util.*;

class Node {
    int info;
    Node next;
}

public class ass6_q2 {
    public static Node top = null;

    public static void push() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to push: ");
        int data = sc.nextInt();
        Node node = new Node();
        node.info = data;
        node.next = top;
        top = node;
    }

    public static void pop() {
        if (top == null) {
            System.out.println("Stack underflow, delete not possible");
        } else {
            Node q = top;
            top = top.next;
            System.out.println("Deleted node info -- data value: " + q.info);
        }
    }

    public static void display() {
        if (top == null) {
            System.out.println("Stack underflow");
        } else {
            Node p = top;
            System.out.println("Stack elements: ");
            while (p != null) {
                System.out.println("  " + p.info);
                p = p.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for stack using linked list");
        while (true) {
            System.out.println("\nMenu for stack operations:");
            System.out.println("Press 0: Exit");
            System.out.println("Press 1: Push");
            System.out.println("Press 2: Pop");
            System.out.println("Press 3: Display");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0: System.exit(0);
                case 1: push(); break;
                case 2: pop(); break;
                case 3: display(); break;
                default: System.out.println("Wrong choice, try again");
            }
        }
    }
}

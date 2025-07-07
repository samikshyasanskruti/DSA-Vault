package assignment7;

import java.util.*;

class Node {
    int info;
    Node next;
}

public class ass7_q2 {
    public static Node front = null, rear = null;

    public static void enqueue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to enqueue: ");
        int data = sc.nextInt();
        Node node = new Node();
        node.info = data;
        node.next = null;
        if (rear == null) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
    }

    public static void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow, delete not possible");
        } else {
            System.out.println("Deleted element is: " + front.info);
            front = front.next;
            if (front == null)
                rear = null;
        }
    }

    public static void display() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            Node p = front;
            System.out.println("Queue elements:");
            while (p != null) {
                System.out.println("  " + p.info);
                p = p.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for queue using linked list");
        while (true) {
            System.out.println("\nMenu for queue operations:");
            System.out.println("Press 0: Exit");
            System.out.println("Press 1: Enqueue");
            System.out.println("Press 2: Dequeue");
            System.out.println("Press 3: Display");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0: System.exit(0);
                case 1: enqueue(); break;
                case 2: dequeue(); break;
                case 3: display(); break;
                default: System.out.println("Wrong choice, try again");
            }
        }
    }
}


package assignment7;

import java.util.*;

public class ass7_q1 {
    public static final int MAX = 5;
    public static int front = -1, rear = -1;
    public static int[] Q = new int[MAX];

    public static void enqueue() {
        Scanner sc = new Scanner(System.in);
        if (rear == MAX - 1) {
            System.out.println("Queue Overflow, insert not possible");
        } else {
            System.out.print("Enter the number to enqueue: ");
            int data = sc.nextInt();
            if (front == -1)
                front = 0;
            Q[++rear] = data;
        }
    }

    public static void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow, delete not possible");
        } else {
            System.out.println("Deleted element is: " + Q[front]);
            front++;
        }
    }

    public static void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements:");
            for (int i = front; i <= rear; i++) {
                System.out.println("  " + Q[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for queue using array");
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

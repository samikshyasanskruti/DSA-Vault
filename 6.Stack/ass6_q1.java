package assignment6;


import java.util.*;

public class ass6_q1 {
    public static final int MAX = 3;
    public static int Top = -1;
    static int[] S = new int[MAX];

    public static void push() {
        Scanner sc = new Scanner(System.in);
        if (isFull()) {
            System.out.println("Stack Overflow, Insert not possible");
        } else {
            System.out.print("Enter a data to add: ");
            S[++Top] = sc.nextInt();
        }
    }

    public static void pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow, delete not possible");
        } else {
            System.out.println("Deleted item is: " + S[Top--]);
        }
    }

    public static void display() {
        if (Top == -1) {
            System.out.println("Empty stack");
        } else {
            System.out.println("Stack elements are: ");
            for (int i = Top; i >= 0; i--) {
                System.out.print(S[i] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isFull() {
        return Top == MAX - 1;
    }

    public static boolean isEmpty() {
        return Top == -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for stack using array");
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

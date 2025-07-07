package assignment5;

import java.util.*;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;
}

public class ass5_q1 {
    static Node start = null;
    static Node end = null;

    public static void Create() {
        Scanner sc = new Scanner(System.in);
        Node p;
        char ch;
        do {
            p = new Node();
            System.out.print("Enter registration number: ");
            p.regd_no = sc.nextInt();
            System.out.print("Enter marks: ");
            p.mark = sc.nextFloat();
            p.next = null;

            if (start == null) {
                start = p;
                end = p;
                p.prev = null;
            } else {
                p.prev = end;
                end.next = p;
                end = p;
            }

            System.out.print("Do you want to create more nodes (y/n)? ");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }

    public static void Display() {
        Node p = start;
        if (start == null) {
            System.out.println("Empty linked list");
        } else {
            System.out.println("******* Node details ********* \nRegd No --- Marks");
            while (p != null) {
                System.out.println(p.regd_no + " --------- " + p.mark);
                p = p.next;
            }
        }
    }

    public static void InsBeg() {
        Scanner sc = new Scanner(System.in);
        Node p = new Node();
        System.out.print("Enter registration number: ");
        p.regd_no = sc.nextInt();
        System.out.print("Enter marks: ");
        p.mark = sc.nextFloat();
        p.prev = null;

        if (start == null) {
            p.next = null;
            start = p;
            end = p;
        } else {
            p.next = start;
            start.prev = p;
            start = p;
        }
    }

    public static void InsEnd() {
        Scanner sc = new Scanner(System.in);
        Node p = new Node();
        System.out.print("Enter registration number: ");
        p.regd_no = sc.nextInt();
        System.out.print("Enter marks: ");
        p.mark = sc.nextFloat();
        p.next = null;

        if (start == null) {
            p.prev = null;
            start = p;
            end = p;
        } else {
            p.prev = end;
            end.next = p;
            end = p;
        }
    }

    public static void InsAny() {
        Scanner sc = new Scanner(System.in);
        Node p = new Node();
        System.out.print("Enter registration number of new node: ");
        p.regd_no = sc.nextInt();
        System.out.print("Enter marks of new node: ");
        p.mark = sc.nextFloat();
        System.out.print("Enter position of new node: ");
        int pos = sc.nextInt();

        if (pos <= 0) {
            System.out.println("Invalid position.");
        } else if (start == null || pos == 1) {
            InsBeg();
        } else {
            Node q = start;
            for (int i = 1; i < pos - 1 && q.next != null; i++) {
                q = q.next;
            }
            p.next = q.next;
            p.prev = q;
            if (q.next != null) {
                q.next.prev = p;
            } else {
                end = p;
            }
            q.next = p;
            System.out.println("New node added at position " + pos);
        }
    }

    public static void DelBeg() {
        if (start == null) {
            System.out.println("Empty linked list");
        } else {
            Node p = start;
            System.out.println("Deleted node: Regd No: " + p.regd_no + ", Marks: " + p.mark);
            start = start.next;
            if (start != null) start.prev = null;
            else end = null;
        }
    }

    public static void DelEnd() {
        if (start == null) {
            System.out.println("Empty linked list");
        } else {
            Node p = end;
            System.out.println("Deleted node: Regd No: " + p.regd_no + ", Marks: " + p.mark);
            end = end.prev;
            if (end != null) end.next = null;
            else start = null;
        }
    }

    public static void DelAny() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position of node to delete: ");
        int pos = sc.nextInt();

        if (start == null) {
            System.out.println("Empty linked list");
        } else if (pos == 1) {
            DelBeg();
        } else {
            Node p = start;
            for (int i = 1; i < pos && p != null; i++) {
                p = p.next;
            }
            if (p == null) {
                System.out.println("Position not found, deletion not possible");
            } else {
                System.out.println("Deleted node: Regd No: " + p.regd_no + ", Marks: " + p.mark);
                if (p.next != null) p.next.prev = p.prev;
                else end = p.prev;

                if (p.prev != null) p.prev.next = p.next;
            }
        }
    }

    public static void Search(int regNo) {
        Scanner sc = new Scanner(System.in);
        if (start == null) {
            System.out.println("Empty linked list");
        } else {
            Node p = start;
            boolean found = false;
            while (p != null) {
                if (p.regd_no == regNo) {
                    System.out.print("Registration found. Enter updated marks: ");
                    p.mark = sc.nextFloat();
                    found = true;
                }
                p = p.next;
            }
            if (found) {
                System.out.println("Marks updated.");
            } else {
                System.out.println("Registration number not found.");
            }
        }
    }

    public static void Count() {
        int c = 0;
        Node q = start;
        while (q != null) {
            c++;
            q = q.next;
        }
        System.out.println("Number of nodes: " + c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n**** MENU *****");
            System.out.println("0: Exit");
            System.out.println("1: Create linked list");
            System.out.println("2: Display list");
            System.out.println("3: Insert at beginning");
            System.out.println("4: Insert at end");
            System.out.println("5: Insert at any position");
            System.out.println("6: Delete from beginning");
            System.out.println("7: Delete from end");
            System.out.println("8: Delete from any position");
            System.out.println("9: Update marks by registration number");
            System.out.println("10: Count nodes");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0: System.exit(0);
                case 1: Create(); break;
                case 2: Display(); break;
                case 3: InsBeg(); break;
                case 4: InsEnd(); break;
                case 5: InsAny(); break;
                case 6: DelBeg(); break;
                case 7: DelEnd(); break;
                case 8: DelAny(); break;
                case 9:
                    System.out.print("Enter registration number: ");
                    int regno = sc.nextInt();
                    Search(regno);
                    break;
                case 10: Count(); break;
                default: System.out.println("Wrong choice");
            }
        }
    }
}

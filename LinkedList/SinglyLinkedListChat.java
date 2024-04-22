import java.util.Scanner;

public class SinglyLinkedListChat {
    // Node inner class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // Method to create the linked list
    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the data:");
            data = sc.nextInt();

            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                // The existing nodes should be linked as the next of the new node
                new_node.next = head;
                // Updating head to the new node
                head = new_node;
            }

            System.out.println("Press 1 to add more data to the list:");
            n = sc.nextInt();
        } while (n == 1);

        sc.close(); // Close the scanner to avoid memory leaks
    }

    // Method to traverse the linked list
    public void traverse() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node temp = head; // Starting from the head
        System.out.println("List elements:");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next; // Move to the next node
        }
        System.out.println(); // Print newline at the end
    }

    public static void main(String[] args) {
        SinglyLinkedListChat list = new SinglyLinkedListChat();
        list.creation();
        list.traverse();
    }
}

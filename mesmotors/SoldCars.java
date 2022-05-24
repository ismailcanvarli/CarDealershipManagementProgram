package mesmotors;

public class SoldCars {

    Node head = null;

    public void push(Car data) {
        Node node = new Node();
        node.data = data;
        Node temp = head;

        head = node;
        node.next = temp;

    }

    void isEmpty() {
        if (head == null) {
            System.out.println("Stack yapisi bostur.");
        } else {
            System.out.println("Stack yapisinda eleman var.");
        }

    }

    void printSoldCars() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data.toString());
            temp = temp.next;
            System.out.println(" ");
        }

    }
}

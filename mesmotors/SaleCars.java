package mesmotors;

public class SaleCars {

    Node head = null;

    public void push(Car data) {
        Node node = new Node();
        node.data = data;
        Node temp = head;

        head = node;
        node.next = temp;
    }
    
    public void isEmpty() {
        if (head == null) {
            System.out.println("Stack yapisi bostur.");
        } else {
            System.out.println("Stack yapisinda eleman var.");
        }

    }
}

package mesmotors;

/**
 * SoldCars sinifi bir stack yapisidir.
 */
public class SoldCars {

    Node head = null;

    /**
     * @param data ismi ile Car nesnesi alinir.
     *             Stack mantigina göre de en öne eklenir.
     */
    public void push(Car data) {
        Node node = new Node();
        node.data = data;
        Node temp = head;

        head = node;
        node.next = temp;

    }


    /**
     * Satilan arabalarin tutuldugu stack yapisinin yazdirilmasi islemini yapar.
     */

    void printSoldCars() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data.toString());
            temp = temp.next;
            System.out.println(" ");
        }

    }
}

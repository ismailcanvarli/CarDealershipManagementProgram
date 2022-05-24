package mesmotors;

public class CarList {

    Node head = null;
    SaleCars saleCars ;

    CarList() {  
    }
    
    CarList(Car data) {
        saleCars = new SaleCars();
        head = new Node();
        head.data = data;
        head.next = null;
    }
    
    public  void createDefaultCar(){
        addCar(new Car("Citroën", "C5", "Blue", 2010, 169000, 239000));
        addCar(new Car("Audi", "A5", "White", 2016, 104000, 1550000));
        addCar(new Car("Chevrolet", "Captiva", "White", 2012, 109000, 375000));
        addCar(new Car("Opel", "Insignia", "Black", 2011, 210000, 269000));
        addCar(new Car("Toyota", "Auris", "Grey", 2013, 110000, 289000));
        addCar(new Car("Opel", "Insignia", "White", 2012, 213000, 259500));
        addCar(new Car("Kia", "Ceed", "Black", 2012, 173000, 339000));
        addCar(new Car("Seat", "Ibiza", "White", 2014, 160000, 315000));
        addCar(new Car("Kia", "Pro Ceed", "White", 2013, 180000, 299000));
        addCar(new Car("Kia", "Picanto", "Black", 2013, 180000, 299000));
    }


    /**
     * Bagli listedeki arabalar yazdirilir
     */
    public void printCarList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data.toString() + " => ");
            temp = temp.next;
            System.out.println(" ");
        }
        System.out.println("Null");

    }

    /**
     * Bu islemde bagli listenin sonuna eleman eklenir
     */
    public void addCar(Car data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        Node temp = head;
        
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public boolean deleteCar(int id) {
        Car car = linearSearchCar(id);
        boolean durum = false;
        Node current = head;
        Node tmp = null;
        if (current.data == car) {
            tmp = current.next;
            head = tmp;
        } else {
            while (current.next != null) {
                if (current.next.data == car) {
                    tmp = current.next;
                    current.next = tmp.next;
                    durum = true;
                    saleCars.push(car);
                    break;
                }
                current = current.next;
            }
        }
        return durum;
    }

    /**
     * Girilen araba idsinin ait oldugu araba , linear search algoritmasi
     * kullanilarak aranip bulunur.
     */
    public Car linearSearchCar(int id) {
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return null;
        } else {
            while (current != null) {

                if (((Car) current.data).getId() == id) {

                    return (Car) current.data;
                }

                current = current.next;
            }
            return null;
        }

    }

    /**
     * Quick sort algoritmasi ile Nodelarda data olarak bulunan arabalarin
     * fiyatlari karsilastirilmis ve sonuc olarak arabalar fiyati düsükten
     * yüksege dogru siralanmistir.
     */
    public void sortIncreasePrice() {
        
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        Node start = head;
        Node end = n;
        sort(start, end);

    }

    public void sortDecreasePrice() {
        
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        Node start = head;
        Node end = n;
        sort_2(start, end);

    }

    Node paritionLast(Node start, Node end) {
        if (start == end || start == null || end == null) {
            return start;
        }

        Node pivot_prev = start;
        Node curr = start;
        Car pivot = (Car) end.data;

        /**
         * Sonuncudan bir öncekine kadar ilerlenir
         */
        while (start != end) {

            if (((Car) (start.data)).price < pivot.price) {
                /**
                 * Son degisen elemena kadar takip eder.
                 *
                 */
                pivot_prev = curr;
                Car temp = (Car) curr.data;
                curr.data = start.data;
                start.data = temp;
                curr = curr.next;
            }
            start = start.next;
        }

        Car temp = (Car) curr.data;
        curr.data = pivot;
        end.data = temp;

        return pivot_prev;
    }

    void sort(Node start, Node end) {
        if (start == null || start == end || start == end.next) {
            return;
        }

        Node pivot_prev = paritionLast(start, end);
        sort(start, pivot_prev);

        if (pivot_prev.data != null && ((Car) pivot_prev.data).price == ((Car) start.data).price) {
            sort(pivot_prev.next, end);
        } else if (pivot_prev.data != null
                && pivot_prev.next.data != null) {
            sort(pivot_prev.next.next, end);
        }
    }

    Node paritionLast_2(Node start, Node end) {
        if (start == end || start == null || end == null) {
            return start;
        }

        Node pivot_prev = start;
        Node curr = start;
        Car pivot = (Car) end.data;

        /**
         * Sonuncudan bir öncekine kadar ilerlenir
         */
        while (start != end) {

            if (-((Car) (start.data)).price < -pivot.price) {
                /**
                 * Son degisen elemena kadar takip eder.
                 *
                 */
                pivot_prev = curr;
                Car temp = (Car) curr.data;
                curr.data = start.data;
                start.data = temp;
                curr = curr.next;
            }
            start = start.next;
        }

        Car temp = (Car) curr.data;
        curr.data = pivot;
        end.data = temp;

        return pivot_prev;
    }

    void sort_2(Node start, Node end) {
        if (start == null || start == end || start == end.next) {
            return;
        }

        Node pivot_prev = paritionLast_2(start, end);
        sort_2(start, pivot_prev);

        if (pivot_prev.data != null && ((Car) pivot_prev.data).price == ((Car) start.data).price) {
            sort_2(pivot_prev.next, end);
        } else if (pivot_prev.data != null
                && pivot_prev.next.data != null) {
            sort_2(pivot_prev.next.next, end);
        }
    }
}

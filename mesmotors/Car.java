package mesmotors;

/**
 * Araba sinifidir.
 */
public class Car {

    private static int nextId = 1;
    private int myId;

    String brandName;
    String model;
    String colour;
    int year;
    int km;
    int price;
    public Car data;

    /**
     * Araba sinifi yapici methodudur.
     */

    public Car(String brandName, String model, String colour, int year, int km, int price) {
        myId = nextId++;
        this.brandName = brandName;
        this.model = model;
        this.colour = colour;
        this.year = year;
        this.km = km;
        this.price = price;
    }

    /**
     * Araba sinifi parametresiz yapici methodudur.
     */
    Car() {

    }

    /**
     * @return int myId adinda arabanin kendisine ait olan idyi döndürür.
     */
    public int getId() {
        return myId;
    }

    /**
     * @return int fiyat bilgisini döndürür.
     */
    public int getPrice() {
        return price;
    }
}

package mesmotors;

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
    
   

    public Car(String brandName, String model, String colour, int year, int km, int price) {
        myId = nextId++;
        this.brandName = brandName;
        this.model = model;
        this.colour = colour;
        this.year = year;
        this.km = km;
        this.price = price;
    }

    Car() {
       
    }

    public int getId() {
        return myId;
    }

    public int getPrice() {
        return price;
    }
}

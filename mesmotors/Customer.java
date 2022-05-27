package mesmotors;

/**
 * Musteri sinifidir.
 */
public class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    /**
     * @return String
     *         Musteri ismi dondurulur.
     */
    public String getName() {
        return name;
    }

    /**
     * @return String
     *         toString() methodu override edilmistir.Nesnenin ismini yazdiracak
     *         sekilde dizayn edilmisitr.
     */
    @Override
    public String toString() {
        return "" + getName();
    }
}

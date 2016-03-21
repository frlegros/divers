package injection.zestedesavoir.domain;

/**
 * Created by franck on 16/03/16.
 */
public class Pizza {

    private final String name;
    private final TypePizza type;
    private final double price;

    public Pizza(String name, TypePizza type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public TypePizza getType() {
        return type;
    }

    public enum TypePizza{
        MARGHERITA, PEPPERONI, AMERICAN_HOT;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                '}';
    }
}

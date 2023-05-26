package solutions.shoppingcarts;

import java.util.List;

public class ShoppingCart {
    private int numberOfItems;
    private double price;
    private String customerId;
    private String weekday;
    private List<String> products;

    public ShoppingCart(int numberOfItems, double price, String customerId, String weekday, List<String> products) {
        this.numberOfItems = numberOfItems;
        this.price = price;
        this.customerId = customerId;
        this.weekday = weekday;
        this.products = products;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public double getPrice() {
        return price;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getWeekday() {
        return weekday;
    }

    public List<String> getProducts() {
        return products;
    }
}
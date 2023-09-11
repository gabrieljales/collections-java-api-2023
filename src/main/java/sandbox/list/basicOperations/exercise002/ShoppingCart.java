package main.java.sandbox.list.basicOperations.exercise002;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> itemList;

    public ShoppingCart() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity) {
        itemList.add(new Item(name, price, quantity));
    }

    public void removeItemByName(String name) {
        itemList.removeIf(item -> item.getName().equals(name));
    }

    public double calculateTotalValue() {
        double total = 0.0;

        for (Item item : itemList) {
            total += item.getPrice() * item.getQuantity();
        }

        return total;
    }

    public void printItems() {
        System.out.println(itemList);
    }
}

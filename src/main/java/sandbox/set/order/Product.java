package main.java.sandbox.set.order;

import java.util.Objects;

public class Product implements Comparable<Product>{
    private String name;
    private long code;
    private double price;
    private int quantity;

    public Product(String name, long code, double price, int quantity) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Product product) {
        return name.compareToIgnoreCase(product.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return code == product.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

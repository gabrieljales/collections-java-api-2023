package main.java.sandbox.generics;

public class Shoes {
    private String name;
    private String brand;
    private String color;
    private int size;

    public Shoes(String name, String brand, String color, int size) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}

package main.java.sandbox.map.search.exercise001;

import java.util.HashMap;
import java.util.Map;

public class ProductStock {
    private Map<Long, Product> productMap;

    public ProductStock() {
        this.productMap = new HashMap<>();
    }

    public void addProduct(long code, String name, int quantity, double price) {
        productMap.put(code, new Product(name, quantity, price));
    }

    public void showAllProducts() {
        System.out.println(productMap);
    }

    public double getStockTotalValue() {
        double stockTotalValue = 0d;

        if (!productMap.isEmpty()) {
            for (Product product : productMap.values()) {
                stockTotalValue = product.getQuantity() * product.getPrice();
            }

            return stockTotalValue;
        } else {
            throw new RuntimeException("O Map está vazio!");
        }
    }

    public Product getMostExpensiveProduct() {
        Product mostExpensiveProduct = null;
        double biggestPrice = Double.MIN_VALUE;

        if (!productMap.isEmpty()) {
            for (Product product : productMap.values()) {
                if (product.getPrice() > biggestPrice) {
                    mostExpensiveProduct = product;
                }
            }

            return mostExpensiveProduct;
        } else {
            throw new RuntimeException("O Map está vazio!");
        }
    }

    public Product getCheapestProduct() {
        Product cheapestProduct = null;
        double cheapesPrice = Double.MAX_VALUE;

        if (!productMap.isEmpty()) {
            for (Product product : productMap.values()) {
                if (product.getPrice() < cheapesPrice) {
                    cheapestProduct = product;
                }
            }

            return cheapestProduct;
        } else {
            throw new RuntimeException("O Map está vazio!");
        }
    }
}

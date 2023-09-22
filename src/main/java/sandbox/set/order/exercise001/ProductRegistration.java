package main.java.sandbox.set.order.exercise001;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegistration {
    private Set<Product> productSet;

    public ProductRegistration() {
        this.productSet = new HashSet<>();
    }

    public void addProduct(String name, long cod, double price, int quantity) {
        productSet.add(new Product(name, cod, price, quantity));
    }

    public Set<Product> getProductsOrderedByNameInDescOrder() {
        if(!productSet.isEmpty()) {
            // O TreeSet permite deixar organizado, ao contrário do HashSet
            Set<Product> productsOrderedByNameInDescOrder = new TreeSet<>(productSet);
            return productsOrderedByNameInDescOrder;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Set<Product> getProductsOrderedByPriceInAscOrder() {
        if(!productSet.isEmpty()) {
            // O TreeSet permite deixar organizado, ao contrário do HashSet
            Set<Product> productsOrderedByPriceInAscOrder = new TreeSet<>(new PriceComparator());
            productsOrderedByPriceInAscOrder.addAll(productSet);
            return productsOrderedByPriceInAscOrder;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }
}

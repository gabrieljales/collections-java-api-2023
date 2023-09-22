package main.java.sandbox.set.order.exercise001;

public class Main {
    public static void main(String[] args) {
        ProductRegistration productRegistration = new ProductRegistration();

        productRegistration.addProduct("Notebook Dell", 1L, 4000, 14);
        productRegistration.addProduct("Smarthphone Xiaomi Redmi Note 12", 2L, 1200, 19);
        productRegistration.addProduct("Notebook Acer", 3L, 3300, 10);

        System.out.println("Produtos ordenados por nome: " + productRegistration.getProductsOrderedByNameInDescOrder());
        System.out.println("Produtos ordenados por preço: " + productRegistration.getProductsOrderedByPriceInAscOrder());
    }
}

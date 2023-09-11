package main.java.sandbox.list.basicOperations.exercise002;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem("Teclado Gamer", 400.0, 1);
        shoppingCart.addItem("Memória RAM 8GB DDR4", 150.0, 2);
        shoppingCart.addItem("Mouse Gamer", 100.0, 1);

        shoppingCart.printItems();

        shoppingCart.removeItemByName("Mouse Gamer");
        shoppingCart.printItems();

        System.out.println(shoppingCart.calculateTotalValue());
    }
}

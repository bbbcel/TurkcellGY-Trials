package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "laptop", 1234.99, 12);
        System.out.println(product.name);

        ProductManager productManager = new ProductManager();
        productManager.add(product);

    }
}
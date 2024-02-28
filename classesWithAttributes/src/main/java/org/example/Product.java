package org.example;

public class Product {
    Product(int id, String n, double p, int sNum){
        System.out.println("We are in ctor");
        _id = id;
        name = n;
        price = p;
        stockNum = sNum;
    }

    private int _id;
    String name;
    double price;
    int stockNum;
    public int getId() {
        return _id;
    }
    public void setId(int id){
        _id = id;
    }
}

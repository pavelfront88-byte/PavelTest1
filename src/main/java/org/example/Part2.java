package org.example;
class Product
{
    private String name;
    public Product(
            String name)
    {
        this.name=name;
    }}
public class Main {
    public static void main(String[] args) {
        Product[] products_Array = new Product[1];
        products_Array[1] = new Product("Bed linen");
        products_Array[2] = new Product("Pillows");
        products_Array[3] = new Product("Curtains");
        products_Array[4] = new Product("Towels");
        products_Array[5] = new Product("Cleaning wipes");
    }}
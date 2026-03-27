package com.oops.learning;

public class Order {
    private MenuItem[] items = new MenuItem[10];
    private int itemCount = 0;

    public void addMenuItem(MenuItem item) {
        if (itemCount < items.length) {
            items[itemCount++] = item;
        } else {
            System.out.println("Order is full!");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getPrice();
        }
        return total;
    }

    public void printReceipt() {
        System.out.println("---- Receipt ----");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i].getName() + " - " + items[i].getPrice());
        }
        System.out.println("Total: " + calculateTotal());
    }
}

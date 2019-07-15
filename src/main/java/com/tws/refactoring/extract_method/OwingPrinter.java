package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {
        Iterator<Order> elements = orders.iterator();
        double outstanding = 0.0;

        // print banner
        printBanner();

        // print owings
        while (elements.hasNext()) {
            Order each = (Order) elements.next();
            outstanding += each.getAmount();
        }

        // print details
        printDetails(name,outstanding);
    }

    private void printDetails(String name,double outstanding){
        print("name: " + name);
        print("amount: " + outstanding);
    }
    private void printBanner() {
        print("*****************************");
        print("****** Customer totals ******");
        print("*****************************");
    }

    private void print(String s) {
        System.out.println(s);
    }
}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

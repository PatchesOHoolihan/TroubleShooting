package edu.cscc;
import java.util.*;

import java.util.Scanner;

// TODO add comments with your name and the purpose of the program
public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String productName;
        int count;
        double productCost, total, average;
        System.out.println("Products that cost $100.00 or more");
        System.out.print("Enter the product ordered - type 'stop' to end: ");
        productName = input.next();
        System.out.print("Enter the cost of the product ordered: ");
        productCost = input.nextDouble();
        input.nextLine();
    }
}


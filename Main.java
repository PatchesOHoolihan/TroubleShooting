package edu.cscc;
import java.util.Scanner;

// Jd King. This program computes a circle's area and perimeter based off the user input of the circle's radius
public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double radius, area, perimeter;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the circle's radius");
        radius = input.nextDouble();
        area = (Math.PI * Math.pow(radius, 2));
         = (2 * Math.PI * radius);
        System.out.println("The area of your circle with radius of" + ""radius"" + "is"" + "area"");


    }
}

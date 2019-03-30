package cscc.edu;
import java.util.Scanner;

// Jd King. This program adds the cost of shipping to the customer's total payment depending one of three shipping options



public class ShippingCost {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)  {
        int shippingType;
        double shippingCost, productCost, totalCost;
        System.out.println("Shipping Costs");
        System.out.print("Enter the cost of the product ordered: ");
        productCost = input.nextDouble();
        System.out.println("Standard shipping (enter 1) for $7.95");
        System.out.println("Express shipping (enter 2) for $13.95");
        System.out.println("Priority shipping (enter 3)for $23.95");
        System.out.print("Enter your choice (1, 2 or 3):");
        shippingType = input.nextInt();
            if (shippingType = 1) {
                shippingCost = 7.95;
                else if (shippingType = 2)
                    shippingCost = 13.95;
                else if (shippingType = 3)
                    shippingCost = 23.95;
            }

    }
}

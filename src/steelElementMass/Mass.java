package steelElementMass;

// create new java class called "Mass" in IntelliJ or Eclipse and compile the following code:

import java.util.Scanner;
import java.text.DecimalFormat;

public class Mass {
    public static void main(String[] args) {

        DecimalFormat df2 = new DecimalFormat("#.##");
        Scanner input = new Scanner(System.in);
        double g = 7.850;

        System.out.println("Specify plate thickness");
        System.out.print("Plate thickness: ");
        int t = input.nextInt();

        System.out.println("Specify dimmensions: ");
        System.out.print("Width [mm]: ");
        int L = input.nextInt();
        System.out.print("Length [mm]: ");
        int H = input.nextInt();
        System.out.println("Specify quantity: ");
        System.out.print("Quantity: ");
        int n = input.nextInt();

        double c = (g * t * L * H) / 1000000;
        double d = c * n;

        System.out.println("Part mass: " + df2.format(c) + " [kg]");
        System.out.println("Mass of all parts: " + df2.format(d) + " [kg]");

    }
}

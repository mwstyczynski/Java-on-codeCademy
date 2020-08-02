package fuelChange;
/*

Hello.
I am Mateusz Styczyński and I have been learning Java for the past few weeks,
as I want to be an automation software tester in the future.
I used to be an engineer in the environment protection sector which is how I came across the idea for the following program.
It calculates coefficients regarding profitability of fuel source change in terms of thermal modernization.
All data was gathered while working as technical advisor in the renewable energy department.

*/

// Importing utilities
import java.util.Scanner;
import java.util.Arrays;

public class FuelChange {

    //    Variables and Arrays prepared for further use
    String[] fuelTypes= new String[5];
    double[] caloricValues= new double[5];
    double[] density = new double[5];

    //    Constructor in which variables are declared.
    public FuelChange(){
        String[] fuelTypes = {"electric", "pellet", "propane", "coal", "wood"};
    }

    //    Methods for setting fuel coefficients accordingly with users fuel



    public static void main(String[] args) {

        System.out.println ("Your current type of energy source will determine the outcome of this calculation");
        System.out.println ("Profitability and percentage values refer to electric energy costs which are the highest " +
                "and it's described as 100%. For example pellet would be described as 16% of ee");

        System.out.println ("Insert 1 for pellet, 2 for coal, 3 for woodbench, 4 for ... ");

        Scanner scan = new Scanner (System.in);
        int usersFuel = scan.nextInt ();

/*
        if (usersFuel=1) {
            String fuelType = fuelTypes[0];
            double caloriesPellet = caloricvalues[0];
            ...
            System.out.println ("Your current energy source is: " + fuelType);
            System.out.println ("It's caloric value is: " + calloriesPellet + "kWh/kg");
        } else if (a=2) {
            ...
        } else if (a=3) {
            ...
        }

        System.out.println ("Your current energy source is: " + fuelType);
        System.out.println ("It's caloric value is: " + calloriesPellet + "kWh/kg");
*/

    }

}

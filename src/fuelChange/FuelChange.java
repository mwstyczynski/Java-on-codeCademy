package fuelChange;

/* Hello.
I am Mateusz Styczyński and I have been learning Java for the past few weeks as I want to be an automation software tester in the future.
I used to be an engineer in the environment protection sector which is how I came across the idea for the following program.
It calculates coefficients regarding profitability of fuel source change in terms of thermal modernization.
All data was gathered while working as technical advisor in the renewable energy department. */

// Importing utilities
import java.util.Scanner;
import java.text.DecimalFormat;

public class FuelChange {
    //    Declare variables required for further calculations and statistics
    protected String fuelName;
    protected double pricePerUnit;
    protected double caloricValue;
    protected double heatSourceEfficient;

    //    Constructor in which variables are declared.
    FuelChange(String name, double price, double cal, double effi) {
        this.fuelName = name;
        this.pricePerUnit = price;
        this.caloricValue = cal;
        this.heatSourceEfficient = effi;
    }

    //    Methods to be called
    public void defineFuel() {
        System.out.println("Current energy source: " + fuelName);
        System.out.println("Caloric value: " + caloricValue + " kWh/kg");
        System.out.println("Average cost: " + pricePerUnit + " PLN per ");
        System.out.println("Common " + fuelName + " heat source efficiency:"  + heatSourceEfficient * 100 + " %");

        DecimalFormat df2 = new DecimalFormat("#.##");
        double pricePerKWH = pricePerUnit / (caloricValue * heatSourceEfficient);
        System.out.println("Price of 1kWh with " + fuelName + " is: " + df2.format(pricePerKWH) + " PLN");

    }


    public static void main(String[] args) {
        // Script description
        System.out.println(" ");
        System.out.println("Your current and planned types of energy source will determine the outcome of this calculation");
        System.out.println("Profitability and percentage values refer to electric energy costs which are the highest " +
                "and it's described as 100% with 0.55zł/kWh");
        System.out.println(" ");
        // User chooses his fuel
        System.out.println("Choose your current energy source by inserting a corresponding number: ");
        System.out.println("natural gas           1 ");
        System.out.println("heating oil           2 ");
        System.out.println("liquid gas            3 ");
        System.out.println("hard coal             4 ");
        System.out.println("coke (chark)          5 ");
        System.out.println("coomb (coal dust)     6 ");
        System.out.println("lumber wood           7 ");
        System.out.println("woodchips - sawdust   8 ");
        System.out.println("pellet                9 ");
        System.out.println("wood waste            10");
        System.out.println("electric energy       11");
        System.out.println("heat pump COP=5.0     12");
        System.out.println("heat pump COP=3.7     13");
        System.out.println(" ");

        Scanner scan = new Scanner(System.in);
        int usersFuel = scan.nextInt();

        if (usersFuel == 1) {
            System.out.println("1");

        } else if (usersFuel == 2) {
            System.out.println("2");

        } else if (usersFuel == 3) {
            System.out.println("3");

        } else if (usersFuel == 4) {
            System.out.println("4");

        } else if (usersFuel == 5) {
            System.out.println("5");

        } else if (usersFuel == 6) {
            System.out.println("6");

        } else if (usersFuel == 7) {
            System.out.println("7");

        } else if (usersFuel == 8) {
            System.out.println("8");

        } else if (usersFuel == 9) {
            FuelChange pellet = new FuelChange("Pellet", 600, 4986.11, 0.93);
            pellet.defineFuel();

        } else if (usersFuel == 10) {
            System.out.println("10");

        } else if (usersFuel == 11) {
            System.out.println("11");

        } else if (usersFuel == 12) {
            System.out.println("12");

        } else if (usersFuel == 13) {
            System.out.println("13");

        }


//        System.out.println ("Your current energy source is: " + usersFuel);
//        System.out.println ("It's caloric value is: " + usersFuel + "kWh/kg");


    }

}

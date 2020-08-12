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
    protected double heatSourceEfficiency;

    //    Methods to be called FROM CHILD (different in every fuel, because of units tonne/m3/kg kWh/kg kWh/tonne, etc - multiple variables)
    //    1. Define fuel
    public void defineFuel() {
        System.out.println("Current energy source                   " + fuelName);
        System.out.println("Caloric value                           " + caloricValue + " kWh/kg");
        System.out.println("Average cost                            " + pricePerUnit + " PLN per tone");
        System.out.println("Common heat source efficiency           " + heatSourceEfficiency * 100 + " %");

        DecimalFormat df2 = new DecimalFormat("#.##");
        double pricePerKWH = pricePerUnit / (caloricValue * heatSourceEfficiency);
        System.out.println("Price of 1kWh                           " + df2.format(pricePerKWH) + " PLN");
    }

    //    2. Comparison of current and planned fuels coefficients
    public void compareFuels() {
        System.out.println("Transition                   " + fuelName + " ---> ");
        // ...

        DecimalFormat df2 = new DecimalFormat("#.##");
        double pricePerKWH = pricePerUnit / (caloricValue * heatSourceEfficiency);
        System.out.println("Price of 1kWh using " + fuelName + "              " + df2.format(pricePerKWH) + " PLN");
    }

    //    3. Percentage calculations of the transition
    public void fuelTransition() {
        System.out.println("Transition                        " + fuelName + " ---> ");
        System.out.println("Caloric value                     " + caloricValue + " ---> ");
        System.out.println("Cost of 1kWh                      " + pricePerUnit + " ---> ");
        System.out.println("Percentage of previous cost       " + "???" + " ---> ");

        DecimalFormat df2 = new DecimalFormat("#.##");
        double pricePerKWH = pricePerUnit / (caloricValue * heatSourceEfficiency);
        System.out.println("Price of 1kWh using " + fuelName + "              " + df2.format(pricePerKWH) + " PLN");
    }


    //    MAIN executable methods
    public static void main(String[] args) {
        // Description
        System.out.println(" ");
        System.out.println("Your current and planned types of energy source will determine the outcome of this calculation");
        System.out.println("Profitability and percentage values refer to electric energy costs which are the highest " +
                "and it's described as 100% with 0.55zł/kWh");
        System.out.println(" ");
        // User chooses current fuel
        System.out.println("Choose your current energy source by inserting a corresponding number: ");
        System.out.println("Natural gas           1 ");
        System.out.println("Heating oil           2 ");
        System.out.println("Liquid gas            3 ");
        System.out.println("Hard coal             4 ");
        System.out.println("Coke (chark)          5 ");
        System.out.println("Coomb (coal dust)     6 ");
        System.out.println("Lumber wood           7 ");
        System.out.println("Woodchips - sawdust   8 ");
        System.out.println("Pellet                9 ");
        System.out.println("Wood waste            10");
        System.out.println("Electric energy       11");
        System.out.println("Heat pump COP=5.0     12");
        System.out.println("Heat pump COP=3.7     13");
        System.out.println(" ");

        Scanner scan = new Scanner(System.in);
        int currentFuel = scan.nextInt();

//  First method     set values inside the if statements and print out data at the end of loop
//  Second method    use constructor for data insertion per fuel inside the loop
//  Third method     set coefficient values for corresponding fuels in Arrays with indexing
//  Forth method     set values in child classes using inheritance and polymorphism for easier code maintenance and readability and set method for calculations.
//                   defineFuel(); method is in main class, but values used come from child classes

        if (currentFuel == 1) {
            CurrentFuel gas = new CurrentFuel("Natural gas", 2.17, 34.40, 1.05);
            gas.defineFuel();
        } else if (currentFuel == 2) {
            CurrentFuel oil = new CurrentFuel("Heating oil", 3.99, 27.20, 0.88);
            oil.defineFuel();
        } else if (currentFuel == 3) {
            CurrentFuel liquidGas = new CurrentFuel("Liquid gas", 2.69, 25.02, 0.88);
            liquidGas.defineFuel();
        } else if (currentFuel == 4) {
            CurrentFuel coal = new CurrentFuel("Hard coal", 690, 7555.56, 0.75);
            coal.defineFuel();
        } else if (currentFuel == 5) {
            CurrentFuel coke = new CurrentFuel("Coke (chark)", 850, 8097.22, 0.75);
            coke.defineFuel();
        } else if (currentFuel == 6) {
            CurrentFuel coomb = new CurrentFuel("Coomb (coal dust)", 500, 6922.22, 0.60);
            coomb.defineFuel();
        } else if (currentFuel == 7) {
            CurrentFuel wood = new CurrentFuel("Lumber wood", 250, 4513.89, 0.93);
            wood.defineFuel();
        } else if (currentFuel == 8) {
            CurrentFuel woodchips = new CurrentFuel("Woodchips - sawdust", 250, 4513.89, 0.93);
            woodchips.defineFuel();
        } else if (currentFuel == 9) {
            CurrentFuel pellet = new CurrentFuel("Pellet", 600, 4986.11, 0.93);
            pellet.defineFuel();
        } else if (currentFuel == 10) {
            CurrentFuel woodWaste = new CurrentFuel("Wood waste", 200, 5000.00, 0.93);
            woodWaste.defineFuel();
        } else if (currentFuel == 11) {
            CurrentFuel electric = new CurrentFuel("Electric energy", 0.55, 1, 1);
            electric.defineFuel();
        } else if (currentFuel == 12) {
            CurrentFuel lowPump = new CurrentFuel("Low temp. heat pump", 0.55, 1, 5);
            lowPump.defineFuel();
        } else if (currentFuel == 13) {
            CurrentFuel pump = new CurrentFuel("Heat pump COP=3.7", 0.55, 1, 3.7);
            pump.defineFuel();

        }

        // User chooses new fuel
        System.out.println(" ");
        System.out.println("Choose your current energy source by inserting a corresponding number from the list above. ");
        System.out.println(" ");

        int plannedFuel = scan.nextInt();

        if (plannedFuel == currentFuel) {
            System.out.println("You have picked the same fuel as your current energy source. Please start over.");

        } else if (plannedFuel == 1) {
            CurrentFuel gas = new CurrentFuel("Natural gas", 2.17, 34.40, 1.05);
            gas.defineFuel();
        } else if (plannedFuel == 2) {
            PlannedFuel oil = new PlannedFuel("Heating oil", 3.99, 27.20, 0.88);
            oil.defineFuel();
        } else if (plannedFuel == 3) {
            PlannedFuel liquidGas = new PlannedFuel("Liquid gas", 2.69, 25.02, 0.88);
            liquidGas.defineFuel();
        } else if (plannedFuel == 4) {
            PlannedFuel coal = new PlannedFuel("Hard coal", 690, 7555.56, 0.75);
            coal.defineFuel();
        } else if (plannedFuel == 5) {
            PlannedFuel coke = new PlannedFuel("Coke (chark)", 850, 8097.22, 0.75);
            coke.defineFuel();
        } else if (plannedFuel == 6) {
            PlannedFuel coomb = new PlannedFuel("Coomb (coal dust)", 500, 6922.22, 0.60);
            coomb.defineFuel();
        } else if (plannedFuel == 7) {
            PlannedFuel wood = new PlannedFuel("Lumber wood", 250, 4513.89, 0.93);
            wood.defineFuel();
        } else if (plannedFuel == 8) {
            PlannedFuel woodChips = new PlannedFuel("Woodchips - sawdust", 250, 4513.89, 0.93);
            woodChips.defineFuel();
        } else if (plannedFuel == 9) {
            PlannedFuel pellet = new PlannedFuel("Pellet", 600, 4986.11, 0.93);
            pellet.defineFuel();
        } else if (plannedFuel == 10) {
            PlannedFuel woodWaste = new PlannedFuel("Wood waste", 200, 5000.00, 0.93);
            woodWaste.defineFuel();
        } else if (plannedFuel == 11) {
            PlannedFuel electric = new PlannedFuel("Electric energy", 0.55, 1, 1);
            electric.defineFuel();
        } else if (plannedFuel == 12) {
            PlannedFuel lowPump = new PlannedFuel("Low temp. heat pump", 0.55, 1, 5);
            lowPump.defineFuel();
        } else if (plannedFuel == 13) {
            PlannedFuel pump = new PlannedFuel("Heat pump COP=3.7", 0.55, 1, 3.7);
            pump.defineFuel();
        }


    }

}

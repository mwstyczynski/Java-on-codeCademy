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

    //    Methods to be called FROM CHILD (different in every fuel, because of units tonne/m3/kg kWh/kg kWh/tonne, etc - multiple variables)
    public void defineFuel() {
        System.out.println("Current energy source                   " + fuelName);
        System.out.println("Caloric value                           " + caloricValue + " kWh/kg");
        System.out.println("Average cost                            " + pricePerUnit + " PLN per ");
        System.out.println("Common " + fuelName + " heat source efficiency    " + heatSourceEfficient * 100 + " %");

        DecimalFormat df2 = new DecimalFormat("#.##");
        double pricePerKWH = pricePerUnit / (caloricValue * heatSourceEfficient);
        System.out.println("Price of 1kWh using " + fuelName + "              " + df2.format(pricePerKWH) + " PLN");
    }

    //    Methods to be called FROM CHILD
    public void fuelTransition(int currentFuel) {
        System.out.println("Transition                   " + fuelName + " ---> ");
        // ...

        DecimalFormat df2 = new DecimalFormat("#.##");
        double pricePerKWH = pricePerUnit / (caloricValue * heatSourceEfficient);
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
        int currentFuel = scan.nextInt();

//  First method     set values inside the if statements and print out data at the end of loop
//  Second method    use constructor for data insertion per fuel inside the loop
//  Third method     set coefficient values for corresponding fuels in Arrays with indexing
//  Forth method     set values in child classes using inheritance and polymorphism for easier code maintenance and readability and set method for calculations.
//                   defineFuel(); method is in main class, but values used come from child classes

        if (currentFuel == 1) {
            System.out.println("1");

        } else if (currentFuel == 2) {
            System.out.println("2");

        } else if (currentFuel == 3) {
            System.out.println("3");

        } else if (currentFuel == 4) {
            System.out.println("4");

        } else if (currentFuel == 5) {
            System.out.println("5");

        } else if (currentFuel == 6) {
            System.out.println("6");

        } else if (currentFuel == 7) {
            System.out.println("7");

        } else if (currentFuel == 8) {
            System.out.println("8");

        } else if (currentFuel == 9) {
            FuelChange pellet = new FuelChange("Pellet", 600, 4986.11, 0.93);
            pellet.defineFuel();

        } else if (currentFuel == 10) {
            System.out.println("10");

        } else if (currentFuel == 11) {
            System.out.println("11");

        } else if (currentFuel == 12) {
            System.out.println("12");

        } else if (currentFuel == 13) {
            System.out.println("13");

        }

//        System.out.println ("Your current energy source is: " + usersFuel);
//        System.out.println ("It's caloric value is: " + usersFuel + "kWh/kg");

        System.out.println(" ");
        System.out.println("Choose your planned energy source by inserting a corresponding number: ");
        System.out.println(" ");

        // User chooses new fuel
        System.out.println("Choose your current energy source by inserting a corresponding number: ");
        System.out.println("natural gas           1 ");
        System.out.println("heating oil           2 ");
        System.out.println("liquid gas            3 ");
        System.out.println("hard coal             4 ");
        System.out.println("coke (chark)          5 ");
        System.out.println("coomb (coal dust)     6 ");
        System.out.println("lumber wood           7 ");
        System.out.println("woodchips, sawdust   8 ");
        System.out.println("pellet                9 ");
        System.out.println("wood waste            10");
        System.out.println("electric energy       11");
        System.out.println("heat pump COP=5.0     12");
        System.out.println("heat pump COP=3.7     13");
        System.out.println(" ");

        int newFuel = scan.nextInt();


        if (newFuel == currentFuel) {
            System.out.println("You have picked the same fuel as your current energy source. Please start over.");
        } else if (newFuel == 1) {
            System.out.println("1");

        } else if (newFuel == 2) {
            FuelChange coal = new FuelChange("Coal", 690, 7555.56, 0.75);
            coal.fuelTransition(currentFuel);

        }

    }

}

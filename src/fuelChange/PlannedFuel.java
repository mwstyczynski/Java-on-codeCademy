package fuelChange;

public class PlannedFuel extends FuelChange {

    PlannedFuel(String name, double price, double cal, double effi) {
        this.fuelName = name;
        this.pricePerUnit = price;
        this.caloricValue = cal;
        this.heatSourceEfficiency = effi;
    }

//    PlannedFuel coal = new PlannedFuel("Coal", 690, 7555.56, 0.75);

}
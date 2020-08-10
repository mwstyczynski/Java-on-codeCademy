package fuelChange;

public class CurrentFuel extends FuelChange {

    CurrentFuel(String name, double price, double cal, double effi) {
        this.fuelName = name;
        this.pricePerUnit = price;
        this.caloricValue = cal;
        this.heatSourceEfficiency = effi;
    }

//    CurrentFuel pellet = new CurrentFuel("Pellet", 600, 4986.11, 0.93);

}




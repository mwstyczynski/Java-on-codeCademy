package noodles;

class Noodle {

    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public String getCookPrep() {
        return "Boil noodle for 7 minutes and add sauce.";
    }


    public static void main(String[] args) {

        Noodle spaghetti, ramen, pho;

        spaghetti = new Spaghetti();
        ramen = new Ramen();
        pho = new Pho();

        Noodle[] allTheNoodles = {spaghetti, ramen, pho};
        for (Noodle Noodle: allTheNoodles) {
            System.out.println(spaghetti.getCookPrep());
            System.out.println(ramen.getCookPrep());
            System.out.println(pho.getCookPrep());
        }

    }

}
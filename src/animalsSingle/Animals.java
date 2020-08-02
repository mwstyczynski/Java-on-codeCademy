package animalsSingle;

public class Animals {
    //    instance Fields
    String animalName;
    String animalSpecies;
    char animalGender;
    int animalAge;

    //    constructor method
    public Animals(String name, String species, char gender, int age) {
        animalName = name;
        animalSpecies = species;
        animalGender = gender;
        animalAge = age;
    }

    // introduce self method
    public void introduceSelf(){
        String introduction = "It's me, " + animalName + ". I am a " + animalGender +
                " specimen of a " + animalSpecies + " and I'm " + animalAge + " years old.";
        System.out.println (introduction);
    }

    // increase age method - for now usable without return
    public void getsOlder(int older){
        int newAge = animalAge + older;
        System.out.println (animalName + " just got older. It's " + newAge + " now.");
    }

    // toString method for printing the objects without stored at *** memory data
    public String toString(){
        return animalName + " is a " + animalSpecies + " at the age of " + animalAge + ".";
    }

    public static void main(String[] args){
        System.out.println ("You just got a new pet!");
        //  create objects of our Animals constructor with introduceSelf() method called out
        Animals cat = new Animals("Luna", "cat", 'F', 5);
        cat.introduceSelf ();
        Animals dog = new Animals ("Korax", "dog", 'M', 8);
        dog.introduceSelf ();
        //  use getsOlder created method on previously created objects
        dog.getsOlder (4);
        //  print object data thanks to toString method
        //  since for learning purposes getsOlder method was introduced as an example, animalAge will not be rite in toString version
        System.out.println (dog);
        System.out.println (cat);

    }
}

package droid;

public class Droid{
    String name;
    int bateryLevel;

    public Droid(String droidName) {
        name = droidName;
        bateryLevel = 100;
    }

    public String toString(){
        return "Hello. I'm the droid: " + name;
    }

    public void performTask(String task, int energyUsed){
        System.out.println(name + "'s energy level: " + bateryLevel);
        System.out.println(name + " is performing: " + task);
        bateryLevel = bateryLevel - energyUsed;
        System.out.println(name + "'s energy level after the task: " + bateryLevel);
    }

    public static void main(String[] args){
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("dancing", 15);
        codey.performTask("making coffee", 10);
        codey.performTask("working as user", 60);
    }
}

package calculatorBasic;

//In the future make a and b integers be defined by the user

public class Calculator {

    public Calculator(){
        int a;
        int b;
    }

    public int add(int a, int b){
        return a + b;
    }

    public int substract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        return a / b;
    }

    public int modulo(int a, int b){
        return a % b;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.substract(45, 11));
    }

}

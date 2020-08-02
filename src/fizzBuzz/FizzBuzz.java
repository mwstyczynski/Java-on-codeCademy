package fizzBuzz;

public class FizzBuzz {

    public static void main(String[] args){

        for (int i=1; i<=100; i++){

            int modulo3 = i % 3;
            int modulo5 = i % 5;

            if(modulo3 == 0 && modulo5 == 0){
                System.out.println("FizzBuzz");
            } else if (modulo3 == 0){
                System.out.println("Fizz");
            } else if(modulo5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }
    }
}

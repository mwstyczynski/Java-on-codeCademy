package dnaSequencing;

public class DNA{
    public static void main(String[] args){
        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        String dna;

        dna = dna2;

        int length = dna.length();
        System.out.println("Length: " + length);
        int start = dna.indexOf("ATG");
        System.out.println("Start: " + start);
        int end = dna.indexOf("TGA");
        System.out.println("Ends: " + end);

        if(start!=-1 && end==(length-3) && (end-start)%3==0){
            String protein = dna.substring(start, end+3);
            System.out.println("It's a protein: " + protein);
        } else {
            System.out.println("It's NOT a protein!");
        }

    }
}
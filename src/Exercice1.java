import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter your age- ");
        int age_kid = sc.nextInt();

        if (age_kid < 7) {
            System.out.println("trop petit");
        } else if (age_kid < 9) {
            System.out.println("Poussin");
        } else if (age_kid < 11) {
            System.out.println("Pupille");
        } else if (age_kid < 13) {
            System.out.println("Benjamin");
        } else if (age_kid < 15) {
            System.out.println("Minime");
        } else if (age_kid < 17) {
            System.out.println("Poussin");
        } else {
            System.out.println("Trop grand");
        }


    }
}

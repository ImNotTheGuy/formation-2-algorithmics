import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter your age- ");
        int ageKid = sc.nextInt();

        if (ageKid < 7) {
            System.out.println("trop petit");
        } else if (ageKid <= 9) {
            System.out.println("Poussin");
        } else if (ageKid <= 11) {
            System.out.println("Pupille");
        } else if (ageKid <= 13) {
            System.out.println("Benjamin");
        } else if (ageKid <= 15) {
            System.out.println("Minime");
        } else if (ageKid <= 17) {
            System.out.println("Cadet");
        } else {
            System.out.println("Trop grand");
        }


    }
}

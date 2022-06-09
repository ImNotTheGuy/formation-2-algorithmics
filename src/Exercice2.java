import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {

        /*Ecrire un programme Java qui demande à l'utilisateur de saisir la valeur du diamètre, et qui ensuite va effectuer le calcul de la surface.

        Surface = Rayon x Rayon x PI;
        Rayon = Diamètre / 2*/

        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first number- ");
        float diametre = sc.nextFloat();

        float rayon = diametre / 2;
        double surface = Math.pow(rayon, 2) * Math.PI;

        System.out.println(surface);


    }
}

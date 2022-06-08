import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        /*E5.
        Ecrivez un programme Age.java qui :
        declare l'âge de l'utilisateur ;
        lit la réponse de l'utilisateur et l'enregistre dans une variable age de type entier ;
        Effectue le calcul de l'année de naissance de l'utilisateur et l'enregistre dans la variable annee de type entier ;
        affiche l'année de naissance ainsi calculée.

        Exemple d'exécution du programme:
        age = 30
        Votre année de naissance est : 1992*/

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Your age: ");
        byte age = sc.nextByte();
        int annee_naissance = 2022 - age;

        System.out.println("You are (probably) born in: " + annee_naissance);
    }
}

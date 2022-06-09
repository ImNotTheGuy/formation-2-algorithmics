import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        /*E3.
        Ecrire un programme Java qui demande à l'utilisateur de saisir son nom,
        prenom et age, et qui ensuite va afficher le message :
        "Vous vous appelez <prenom> <nom>, et vous avez <age> ans"*/

        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Prenom: ");
        String prenom = sc.nextLine();
        System.out.print("Nom: ");
        String nom = sc.nextLine();

        byte age = -1;
        while (age < 0) {
            System.out.print("Age: ");
            age = sc.nextByte();
            if (age < 0) {
                System.out.println("Please specify a positive number");
            } else if (age < 3){
                System.out.println("Can you really write ?");
            }
        }
        System.out.println("Vous vous appelez " + prenom + " " + nom + " et avez " + age + " ans");
    }
}

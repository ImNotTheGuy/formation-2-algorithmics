import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
       /* Ecrire un programme Java qui déclare 3 variables, a,b,c et qui va ensuite effectuer une permutation de ces valeurs :
        Exemple :
        Entrez la première valeur(a) : 51
        Entrez la deuxième valeur(b) : 876
        Entrez la troisième valeur(c) : 235
        Les valeurs entrées sont : a = 51, b = 876 et c = 235
        Permutation: b <== a, c <== b, a <== c
        Les valeurs permutées sont : a = 235, b = 51 et c = 876*/

        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter a:");
        int a, _a = sc.nextInt();
        System.out.print("Enter b:");
        int b, _b = sc.nextInt();
        System.out.print("Enter c:");
        int c, _c = sc.nextInt();

        b = _a;
        c = _b;
        a = _c;

        System.out.println("a " + a + "\n" + "b " + b + "\n" + "c " + c);

    }
}

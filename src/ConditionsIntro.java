public class ConditionsIntro {
    public static void main(String[] args) {

        byte age = 9;

        if (age >= 18) {
            System.out.println("Ok, you may come in.");
        } else {
            System.out.println("Fuck off.");
        }

        String pays = "France";
        
        if (pays == "France"){
            System.out.println("Bonjour");
        } else if (pays == "Allemagne") {
            System.out.println("Gutentag");
        } else if (pays == "Espagne") {
            System.out.println("Hola");
        } else if (pays == "Italy") {
            System.out.println("Buongiorno");
        } else {
            System.out.println("Country note supported in this current version.");
        }

    }
}

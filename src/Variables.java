public class Variables {

    public static void main(String[] args) {

        int a = 5;
        int b = a;
        a = 9;

        System.out.println(b);

        a = 5;
        b = 7;
        int c = (a + b) / 2;
        a = 12;
        b = 12;
        System.out.println(c);

        // calcul somme des nombres

        float flt = 23.2f;

        float distanceParcourue = 12.444f;
        float temps = 1.3456f;
        double offset = 65535 / 2d;
        System.out.println(offset);



    }

}
import java.util.InputMismatchException;
import java.util.Scanner;

public class Java_KaunasCoding_03_22_3uzd_sunk {

    // cia deklaruotas scanner tampa pasiekiamas visur visoje klaseje
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        menu();

        String selection = scanner.nextLine();

        // switch case metodas
        switch(selection){
            case "a":
                // cia staciojo trikampio plotas
                System.out.println("Staciojo trikampio plotas:");
                staciojoTrikapmioPlotas();
                break;
            case "b":
                // staciakampio plotas
                System.out.println("Staciakampio plotas:");
                staciakampioPlotas();
                break;
            case "c":
                // kvadrato plotas
                System.out.println("Kvadrato plotas");
                kvadratoPlotas();
                break;
            case "d":
                // apskritimo plotas
                System.out.println("Apskritimo plotas");
                apskritimoPlotas();
                break;
            default:
                System.out.println("Nieko cia nera");
                break;
        }


    }

    private static void menu(){

        // \n - perkelia i kita eilute
        System.out.println("Pasirinkite ka norite daryti. \n" +
                "a. staciojo trikampio plotas\n" +
                "b.staciakampio plotas\n" +
                "c.Kvadrato plotas\n" +
                "d.Apskritimo plotas");

    }

    // skaiciuoja staciojo trikapmio plotas
    private static void staciojoTrikapmioPlotas(){

        System.out.println("Iveskite a statini");
        double a = getCorrectNumber();
        System.out.println("Iveskite b statini");
        double b = getCorrectNumber();

        double p = (a * b) / 2;
        System.out.println("Staciojo trikampio plotas yra: " + p);
        /*System.out.println("Staciojo trikampio plotas yra:(procentas)d" + p);*/
    }

    private static void staciakampioPlotas(){
        System.out.println("Iveskite a statini");
        double a = getCorrectNumber();
        System.out.println("Iveskite b statini");
        double b = getCorrectNumber();

        double p = a * b;
        System.out.println("Staciakampio plotas yra: " + p);

    }

    private static double getCorrectNumber (){
        double result = 0.0;
                while(true) {
                    try {
                        result = scanner.nextDouble();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Blogas skaicius. Bandykite ivesti dar karta");

                        scanner.nextLine(); // leidzia vartotojui is naujo ivesti norima resultata, nuskaito blogai ivesta kintamaji

                    }
                }

        return result;
    }

    private static void kvadratoPlotas(){
        System.out.println("Iveskite a statini");
        double a = scanner.nextDouble();

        /*double c = a ^ 2;*/ // naudotume jeigu butu int'ai
        // jeigu double rezultatas toks
        double c = Math.pow(a, 2);
        System.out.println("Kvadrato plotas yra: " + c);


    }

    private static void apskritimoPlotas(){
        System.out.println("Iveskite apskritimo spinduli");
        double a = scanner.nextDouble();

        double rezultatas = Math.PI * (Math.pow(a, 2));
        System.out.println("Apskiritimo plotas yra: " + rezultatas);

    }

}

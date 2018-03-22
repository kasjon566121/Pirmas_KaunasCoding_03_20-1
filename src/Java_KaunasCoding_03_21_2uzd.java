import java.util.Scanner;

// 2uzduotis lengvesne
public class Java_KaunasCoding_03_21_2uzd {

    // 100 prilyginmas kaip MAX_NUMB
    private static final int MAX_NUMB = 100;

    // nuo cia pradedamas darbas
    public static void main (String[] args){

        // panasus i C Sharp Console.ReadLine()
        // susikuriame ir naudojame visoje klaseje
        // skirtas nuskaityti reiksmems
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite kiek skaiciu noresite priskirti");

        // ivesto skaiciaus nuskaitymas
        // laukia kol kazkas bus ivesta i konsole
        int kiek = scanner.nextInt();

        // kiek ilgio masyvas
        int[] masyvas = new int[kiek];

        // for ciklas
        for (int i = 0; i < kiek; i++){
            System.out.println("Iveskite " + i + " skaiciu");
            // skaiciu nuskaitymas
            // laukia kol vartotojas kazka ives i konsole
            masyvas[i] = scanner.nextInt();
        }

        // metodo kvieitmas
        // kadangi metodaas buvo static, kvieciame ji tiesiogiai per varda
        printMasyvas(masyvas);
    }

    // naujas metodas
    // spausdina tik tuos elementus kurie yra
    private static void printMasyvas(int[] sk_Mas ){
        // sis for yra atskiram metode, todel naudoja ne tipus, o klases
        // tipas lokalus vardas : kintamasis is masyvo(pirmas, antras...)
        for(Integer sk: sk_Mas){
            // patikriname ar esamas skaicius yra didesnis uz 100
            if(sk >= MAX_NUMB){
                System.out.println(sk + " ");
            }
        }
    }
}

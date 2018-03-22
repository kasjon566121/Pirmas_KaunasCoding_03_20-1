import jdk.internal.util.xml.impl.Input;

// 3 uzduotis lengvesne

// bibliotekos(kaip C Sharp System...)
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Java_KaunasCoding_03_21_3uzd {

    // 3 uzduotis lengvesne
    public static void main(String[] args) {

        // kuriamas scanner objektas, kad nuskaityti kazkokias reiksmes
        // siuo atveju visoje klaseje nuskaitinejame int reiksmes(System.in)
        Scanner sc = new Scanner(System.in);

        // nuskaito ka ivedi i masyva
        // reikia susikurti pries do while, nes jei
        // susikursime do srityje, tada while salygoje jis bus nepasiekiamas
        int sk = 0;

        // kiekio pradine reiksme
        int kiek = 0;

        // sukuriamas tuscias masyvas i kuri veliau
        // pridejinejame elementus
        int[] mas = {};

        // tikrina koda esanti do srityje,
        // tol kol tenkinama while salyga(tol kol while yra true)
        do {

            System.out.println("Veskite tol kol bus ivestas nulis");
            // try catch - try srityje rasome galima klaidos vieta
            // catch srityje - ka isvestu programa i konsole,
            // jeigu rastu klaida
            try {
                // laukiama kol vartotojas ives skaiciu
                sk = sc.nextInt();
                // tarp objekto e saugoma viskas, kas isvesta konsoleje apie klaida
            }catch(InputMismatchException e){

                // Programa isveda teksta, kai randa klaida
                System.out.println("Blogai ivestas skaicius, programa baigia darba");
                sk = 0;

                // nepaisant blogai ivesto skaiciaus
                // programa mums leidzia testi darba
                sc.nextLine();
            }

            // jeigu if salyga yra true
            // i masyva dedame kazkoki elementa
            // ir masyvo ilgi didiname vienetu
            if (mas.length <= kiek) {

                // masyvo prailginimas
                mas = Arrays.copyOf(mas, mas.length + 1);
            }

            // mas priskiriame sk
            // tuo paciu didiname ir kieki
            // su kiekvienu pakartojimu
            mas[kiek++] = sk;

        } while (sk != 0);

        System.out.println("Suma yra: " + masSum(mas));
    }
        // skaiciuoja visu ivestu skaiciu iki 0 suma
        private static int masSum(int[] mas){

            int sum = 0;
            for (Integer m : mas){
                sum += m;
            }

            return sum;
        }



    }


import java.util.Scanner;

// 1 uzdavinys lengvesnis
public class Java_KaunasCoding_03_21 {

    // ctrl + alt + l - formatuoja koda
    public static void main(String[] args){
        // sis objektas padeda nuskaitineti is konsoles
        Scanner sc = new Scanner(System.in);

        // paprasome, kad vartotojas ivestu skaiciu
        System.out.println("Iveskite skaiciu");

        // ivesto skaiciaus nuskaitymas
        int numb = sc.nextInt();

        // tikriname ar lyginis skaicius
        if(numb % 2 == 0) {
            System.out.println(numb + " yra lyginis");
        } else {
                System.out.println(numb + " nelyginis");
            }

    }
}

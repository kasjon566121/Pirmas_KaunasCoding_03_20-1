import java.util.Scanner;

// 4 uzduotis lengvesne
public class Java_KaunasCoding_03_21_4uzd {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] mas = new int[5];

        for (int i = 0; i < mas.length; i++){
            System.out.println("Iveskite " + i + " skaiciu");

            // skaiciu nuskaitymas
            // laukia kol vartotojas kazka ives i konsole
            mas[i] = scanner.nextInt();
        }

        System.out.println("Suma yra: " + skaiciuSuma(mas));
        System.out.println("Visi ivesti skaiciai yra: ");
        visiIvestiSkaiciai(mas);



    }
    private static int skaiciuSuma(int[] masyvas){
        int sum = 0;
        for (Integer m : masyvas){
            sum += m;
        }
        return sum;
    }

    private static void visiIvestiSkaiciai(int[] masyvas){
        System.out.println(masyvas[0]);
        System.out.println(masyvas[1]);
        System.out.println(masyvas[2]);
        System.out.println(masyvas[3]);
        System.out.println(masyvas[4]);
    }


}

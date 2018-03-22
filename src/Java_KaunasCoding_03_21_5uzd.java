import java.util.Scanner;

// 5 uzduotis lengvesne
public class Java_KaunasCoding_03_21_5uzd {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        String[] zodziai = new String[5];


        for (int i = 0; i < zodziai.length; i++){
            System.out.println("Iveskite "+i+" zodi: ");
            zodziai[i] = scanner.nextLine();
        }


        System.out.println("Visi ivesti zodiai yra: ");
        for (int i = 0; i < zodziai.length; i++){
            System.out.println(zodziai[i]);
        }






    }
}

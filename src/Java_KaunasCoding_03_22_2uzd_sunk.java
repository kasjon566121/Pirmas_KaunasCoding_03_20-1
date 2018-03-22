import java.util.Scanner;

public class Java_KaunasCoding_03_22_2uzd_sunk {
    // polindromas - skaitant tiek is vieno galo, tiek is kito bus tas
    // pats zodis

    // string = "aaa aaa";
    //a = a.replaceAll(" ", ""); (skliausteliuose: pirmas - ka norime keisti, antras - su kuo)

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        a = a.replaceAll(" ", "");
        if (isPolindrom(a)){
            System.out.println("Polindromas");
        }else {
            System.out.println("Nu ne");

        }
    }
    // tikrina ar zodyje sutampa raides
    private static boolean isPolindrom(String word){
        boolean result = true;
        for (int i = 0; i < word.length(); i++){
            // po viena raide tikrina is abieju galu
            if (word.charAt(i) == word.charAt(word.length() - 1 - i)){
                result = false;
                break;
            }
        }

        return result;
    }

}

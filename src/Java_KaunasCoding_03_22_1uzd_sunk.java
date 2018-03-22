import java.util.Scanner;

public class Java_KaunasCoding_03_22_1uzd_sunk {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        /*String zodis;*/

        /*do{
            System.out.println("Iveskite kazkoki zodi");
            zodis = scan.nextLine();
            System.out.println("Jusu ivestas zodis yra " + zodis);

        }while(zodis!= pabaiga);*/


        // while suksis amzinai nes visada bus true
        // next - nuskaito iki tarpo
        // nextLine - nuskaito viska
        while(true){
            System.out.println("Iveskite kazkoki zodi, jei norite baigti, iveskite PABAIGA");
            String word = scan.nextLine();

            // toLowerCase - ivesta zodi pavercia mazosiomis raidemis
            // equals - lyginame ivesta zodi su skliausteliuose ivesta reiksme
            if(word.toLowerCase().equals("pabaiga")){
                break;
            }

            if (word.length() % 2 == 0){
                System.out.println("Ivestas zodis " + word + " yra lyginis, jo ilgis yra " + word.length());
            }
            else
                {
                System.out.println("Zodis " + word + " yra nelyginis, jo ilgis " + word.length());
            }
            char letter = 'a';

            System.out.println("Radome " + letter + " raidziu: " + countHowMuchLettersHaveWord(word, letter));



        }
    }
    // Skaiciuoja kiek ivestame zodyje yra a raidziu
    private static int countHowMuchLettersHaveWord(String word, char letter){
        int count = 0; // i si count desime raidziu kieki, po 1

        for (int i = 0; i < word.length(); i++){
            // word.charAt - tikrina kiekviena raide ir tikrina ar rasta raide yra lygi letter letter raidei
            if (word.charAt(i) == letter){
                count++;
            }
        }
        return count;
    }

}

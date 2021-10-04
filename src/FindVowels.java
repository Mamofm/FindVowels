
import java.util.Scanner;
public class FindVowels {
    public static void main(String args[]) {
        Scanner keybd = new Scanner(System.in);
        String phrase = "";
        String vowels = "aeiou";
        int vowelsCount = 0, idx = 0;

        System.out.println("Enter your text string. Type q to quit:");
        phrase = keybd.nextLine().toLowerCase();  // read and convert to lower case
        while (!phrase.equals("q")) {
            while (idx < phrase.length()) {
                // count how many vowels in the phrase
                if (vowels.indexOf(phrase.charAt(idx)) >= 0)
                    vowelsCount++;
                idx++;                                                // decrement hours
            }
            System.out.printf(phrase + " has %2d vowels.", vowelsCount);
            System.out.println("Enter your text string. Type q to quit:");
            phrase = keybd.nextLine().toLowerCase();  // read and convert to lower case
        }
    }
}
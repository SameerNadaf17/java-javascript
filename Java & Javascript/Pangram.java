package application;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Input the sentence
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().toLowerCase();  // Convert to lowercase for case-insensitivity

        // Check if it's a pangram
        boolean isPangram = isPangram(sentence);

        // Output the result
        if (isPangram) 
        {
            System.out.println("The sentence is a pangram.");
        } 
        else 
        {
            System.out.println("The sentence is not a pangram.");
        }
    }

    private static boolean isPangram(String sentence)
    {
        // Set to store unique lowercase letters
        Set<Character> uniqueLetters = new HashSet<>();

        // Iterate through each character in the sentence
        for (char c : sentence.toCharArray())
        {
            if (Character.isLetter(c))
            {
                uniqueLetters.add(c);
            }
        }

        // Check if all letters from 'a' to 'z' are present
        for (char c = 'a'; c <= 'z'; c++) 
        {
            if (!uniqueLetters.contains(c))
            {
                return false;
            }
        }

        return true;


	}

}

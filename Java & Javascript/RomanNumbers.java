package application;
import java.util.HashMap;
import java.util.Scanner;

public class RomanNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Character, Integer> romanValues = new HashMap<>();
	        romanValues.put('I', 1);
	        romanValues.put('V', 5);
	        romanValues.put('X', 10);
	        romanValues.put('L', 50);
	        romanValues.put('C', 100);
	        romanValues.put('D', 500);
	        romanValues.put('M', 1000);

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a Roman numeral: ");
	        String romanNumeral = sc.nextLine().toUpperCase();

	        // Convert Roman numeral to integer
	        int result = 0;
	        int prevValue = 0;

	        for (int i = romanNumeral.length() - 1; i >= 0; i--)
	        {
	            char currentSymbol = romanNumeral.charAt(i);
	            int currentValue = romanValues.get(currentSymbol);

	            if (currentValue < prevValue) 
	            {
	                result -= currentValue;
	            }
	            else
	            {
	                result += currentValue;
	            }

	            prevValue = currentValue;
	        }

	      
	        System.out.println("The integer equivalent is: " + result);

	}

}

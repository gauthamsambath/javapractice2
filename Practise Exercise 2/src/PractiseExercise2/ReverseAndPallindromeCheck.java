package PractiseExercise2;

public class ReverseAndPallindromeCheck
    {
        public String reverseAndPallindromeCheckFunction(String word)
            {
                String reverse=new String();
                int length = word.length();
                for ( int i = length - 1; i >= 0; i-- )
                    reverse = reverse + word.charAt(i);
                if (word.equals(reverse))
                    return ("Entered string/number is a palindrome.");
                else
                    return ("Entered string/number isn't a palindrome.");
            }
    }

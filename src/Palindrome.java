import java.util.*;
class Palindrome
{
    public static void main(String[] args)
    {
        StringBuilder reverse = new StringBuilder();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome: ");
        String original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse.append(original.charAt(i));
        if (original.equals(reverse.toString()))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number is not a palindrome.");
    }
}
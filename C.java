
import java.util.Scanner;

public class C {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the word and i will tell you this is palindrome or no");
        String word = input.nextLine();
        int num = word.length();
        boolean palindrome = true ;
        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == word.charAt(num))
            palindrome = true ;

        else {
          palindrome = false ;
          break; }   
         num-- ;
        }
        if(palindrome)
        System.out.println("this is palindrome ");
        else
        System.out.println("this is not palindrome");

    }
}

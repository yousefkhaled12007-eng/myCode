 import java.util.Scanner ;
public class Main {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in) ;
System.out.println("enter your grade ");
int grade = input.nextInt() ;
if (grade >= 85)
System.out.println("your gpa is A");
else if (grade >= 75)
System.out.println("your gpa is B");
else if (grade >= 65)
System.out.println("your gpa is C");
else if (grade >= 50 )
System.out.println("your gpa is D");
else 
System.out.println("you fail");

}


} 
    


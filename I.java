import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("enter your email no space  ");
        String emial = input.nextLine() ; 
        gmial(emial) ;
        
        
    }

static boolean  gmial (String x){ 
        Scanner input = new Scanner(System.in) ;

if (x.endsWith("@gmail.com")){
System.out.println("email is corect ");
return true ;
}
else{
 System.out.println("emial is not corect do you want try agian ? enter (yes\no) ");
 String choice = input.next() ;
 if (choice.equals("yes")){
 System.out.println("ok enter the email");
 gmial(input.next()) ;}
 

 return false ;

    
} 
}
}
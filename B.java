import java.util.Scanner ;


public class B {

  public static void main (String[] args){
   
   Scanner input = new Scanner(System.in) ;

   String word = input.nextLine() ;
   
   System.out.println(word.toLowerCase());
   System.out.println(word.replaceFirst("hello", "welcom"));
   System.out.println(word.charAt(0));
    if(word.startsWith("hello"))
    System.out.println("yes this start with hello");

}
}  
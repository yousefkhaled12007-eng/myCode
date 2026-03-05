import java.util.Scanner ;
public class G {
 public static void main (String [] args) {

    Scanner input = new Scanner(System.in) ;
int max = 0 ;
int average ;
    int grade [] = new int [10];
for (int i = 0 ; i <10 ; i++){
System.out.println("enter grade " + i +"st  student");
 grade [i] = input.nextInt();}
for (int i = 0 ; i <10 ; i++){
    max += grade[i] ;
}
  average = max / 10 ;
  System.out.println("this is max " + max + "this is average " + average); 

}
    
}

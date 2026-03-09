
import java.util.* ;



public class test {

  static  ArrayList <String> name = new ArrayList() ;
static void names (){
    Scanner input = new Scanner(System.in) ;
    System.out.println("enter the name you want add ");
    String n = input.nextLine() ;
    name.add(n) ;
    System.out.println("do you want add anothar name , (yes/no) ");
    String Choice = input.next().toLowerCase();
    if (Choice.equals("yes")){
    names();} 
    
    else 
    System.out.println("this is your names " + name);}

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("do you want add a name ");

        String Choice = input.next().toLowerCase();
    if (Choice.equals("yes"))
     names() ;

        

    }
}


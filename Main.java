import java.util.Scanner ;
public class Main {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in) ;
System.out.println("enter the num and i will till you the day");
int num = input.nextInt() ;
switch (num) {

    case 1: 
    System.out.println("this is sunday ");
    break;
    case 2:
    System.out.println("this is monday ");
    break;
    
    case 3:
    System.out.println("this is tuesday ");
    break;
    case 4:
    System.out.println("this is  wednesday");
    break;
    case 5:
    System.out.println("this is  thursday");
    break;
    case 6:
    System.out.println("this is friday");
    break;
    case 7:
    System.out.println("this is saturday");
    break;
default:
System.out.println("error");

}

}


}
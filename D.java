
import java.util.Scanner;

public class D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number to know factors ");
        int num = input.nextInt() ;
        if(num == 1)
        System.out.println("1");
        for (int i = 1 ; i<=(int)(.5*num); i++)
        if (num%i == 0 )
        System.out.println(i);
        else 
        continue;

    }
}

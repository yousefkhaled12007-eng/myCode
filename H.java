
import java.util.Scanner;

public class H {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter 5 names");
        String stu[] = new String[5];
        for (int i = 0; i < 5; i++) {
            stu[i] = (input.nextLine()).toUpperCase();

        }
         String search ;
         System.out.println("do you want search about name");
         search = input.nextLine().toLowerCase();
        String name = "" ;
        if (search.equals("yes")){
            System.out.println("what the name you want khnow   ");
             name = (input.nextLine()).toUpperCase();}
            int i = 0 ;
        while (search.equals("yes")) {
              if (i==5){
               System.out.println("no , name not exist");
               break;}
            if (stu[i].equals(name)){
                System.out.println("yes name exist");
                break ;
                 

            }
            
            else{
            i++;
            continue;}
            
        }

        
    }

}

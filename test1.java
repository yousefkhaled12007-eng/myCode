
import java.util.*;

public class test1 {

    static ArrayList<String> name = new ArrayList();

    static void names() {
        
        System.out.println("enter the name you want add ");
        String n = input.nextLine();
        name.add(n);

        System.out.println("do you want add anothar name , (yes/no) ");
        String Choice = input.nextLine().toLowerCase();

        while ((!(Choice.equals("no")))) {
            System.out.println("enter the name you want add ");
            n = input.nextLine();
            name.add(n);

            System.out.println("do you want add anothar name , (yes/no) ");
            Choice = input.nextLine().toLowerCase();
        }
    
        System.out.println(name);
    }
    
    static  Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("do you want add a name (yes/no ");

        String Choice = input.nextLine().toLowerCase();
        if (Choice.equals("yes"))
            names();

    }
}

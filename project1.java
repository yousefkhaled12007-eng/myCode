                                        //version 1.0 
import java.util.*;

class Atm {

    private String pass;    // Personal information for each client (Instance Variables)
    private int id;
    private String name;
    private int amount;
    static ArrayList<Atm> at = new ArrayList<>();   // List to store all accounts

    static void addCleint() {   // Create new accounts and add them to the list

        at.add(new Atm());
    }

    static void serch() {   // The main ATM operations (Withdraw , Deposit )
        String choice = "yes";  
        while (choice.equals("yes")) {
            System.out.println(" enter your id ");
            int x = project1.input.nextInt();
            boolean id_exist = false;
            for (Atm i : at) {
                if (i.getId() == x) {
                    id_exist = true;
                    System.out.println("hello , " + i.getName() + " please enter your pass");
                    String y = project1.input.next();
                    if (i.getPass().equals(y)) {
                        System.out.println("Succsefull , What do you want do ? (take/add) \n you have " + i.amount);
                        String z = project1.input.next();
                        if (z.equals("take")) {
                            i.take();
                            choice = "no" ;
                        } else if (z.equals("add")) {
                            i.add();
                            choice = "no" ;
                        }
                        else{ 
                            System.out.println(" not valid , do you want try again (yes/no) ");
                            choice = project1.input.next();    
                            }
                    }   else {
                        System.out.println("Wrong pass");
                        System.out.println("do you want try again ");
                        choice = project1.input.next();
                    }
                }
            }
            if (id_exist == false) {
                System.out.println("id not exist , do you want try again (yes/no)");
                choice = project1.input.next();
            }

        }
    }

    public Atm() {  // Constructor to initialize a new account
        System.out.println(" enter your name ");
        project1.input.nextLine();
        name = project1.input.nextLine();
        System.out.println(" enter the amount of money you want add ");
        amount = project1.input.nextInt();
        System.out.println(" enter your id ");
        id = project1.input.nextInt();
        
        setPass();
        System.out.println("Ok , succseful log in");
    }

    public void setid() {
        System.out.println("enter your id");
        int id = project1.input.nextInt();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName() {
        System.out.println("enter your name ");
        project1.input.nextLine();
        String name = project1.input.nextLine();
        this.name = name;
    }

    
    
    public String getName() {
        return name;
    }
    
    
    
    public void add() {
        System.out.println("enter the amount you want add");
        int x = project1.input.nextInt();
        amount += x;
        System.out.println("Ok , Succsefull :) \n amount of your money " + amount);
    }

    public void take() {
        
        String choice = "yes" ;
        while (choice.equals("yes")){
        System.out.println("this is your acount balance " + amount);
        System.out.println("enter the amount you want take ");
        int y = project1.input.nextInt();
        if (amount < y) {
            System.out.println("no you can not :( , you have " + amount);
            System.out.println("do you want try again (yes/no)");
            choice = project1.input.next().toLowerCase() ;
            
        } else {
            amount -= y;
            System.out.println("succesfull :)\n your acount balance  : " +amount);
            System.out.println("do you want take another money (yes/no)");
            choice = project1.input.next().toLowerCase() ;
        }
    }
    }
    public void setPass() {
        String choice = "yes" ;
        while (choice.equals("yes")){
        System.out.println("enter your pass , pass must greater than 8  ");
         pass = project1.input.next();
        if (pass.length()<8)
        System.out.println("No , this password is short , try again");
        else{
        this.pass = pass;
        System.out.println("Succsefull :) ");
        choice = "no" ;}}

    }

    public String getPass() {
        return pass;
    }

    public void printInfo() {
        System.out.printf("this is your name %s \n this is your id %d \n this is your amount of your money %d \n ",
                name, id, amount);

    }

}

public class project1 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean contanue = true ;
        while (contanue){ 
        System.out.println(" what do you want ? 1-take  2-add  3-login  ");
        String choice = input.next().toLowerCase();
        if (choice.equals("login")) {
            Atm.addCleint();
            System.out.println("do you want take or add money now after log in ? (add/take) or no ");
            choice = input.next();
            if (choice.equals("take")) {
                Atm.serch();
            } else if (choice.equals("add")) {
                Atm.serch();
            } 
            else if (choice.equals("no"))
                return;

            else {
                System.out.println("not valid");
                System.out.println("do you want try again (yes/no)");
                choice = input.next();
                if (choice.equals("yes")) {
                    contanue = true ;
                } else {
                    System.out.println("Ok , good bye");
                    contanue = false ;
                }
            }
        } else if (choice.equals("take")) {
            Atm.serch();
        } else if (choice.equals("add")) {
            Atm.serch();
        } else {
            System.out.println("not valid");
            System.out.println("do you want try again (yes/no)");
            choice = input.next();
            if (choice.equals("yes")) {
                contanue = true ;
            } else {
                System.out.println("Ok , good bye");
                contanue = false ;
            }}
        }
        System.out.println("see you soon");
    }
}


//project 1 version 2.0
import java.util.*;

class Atm {
    private String name; // Personal information for each client (Instance Variables)
    private int id;
    private String pass;
    private int amount;
    
    
    static Scanner input = new Scanner(System.in);
    static ArrayList<Atm> at = new ArrayList<>(); // List to store all accounts

    public static boolean pass_check(Atm c) { // Check if the entered password matches the client's password
        System.out.println("enter your pass ");
        String x = input.next();
        if (c.getPass().equals(x)) {
            System.out.println("Success :)");
            return true;
        } else
            return false;
    }

    static Atm client;

    public static boolean search() { // Search for a client in the list using ID

        System.out.println("enter your id ");
        int x = input.nextInt();
        for (Atm i : at) {
            if (i.getId() == x) {
                client = i;
                return true;
            }
        }
        return false;

    }

    public static void addClient() { // Create new accounts and add them to the list
        String choice = "yes";
        while (choice.equals("yes")) {
            at.add(new Atm());
            System.out.println("Success :) ");
            System.out.println(" Do you want another Acount (yes.no)");
            choice = input.next().toLowerCase();
        }
    }

    public static void cashProcess() { // The main ATM operations (Withdraw , Deposit , log in)
        String choice_contianu = "yes";

        System.out.println("Hello , Do you have acount (yes/no) ");
        String choice = input.next().toLowerCase();
        if (choice.equals("no"))
            addClient();
        else if (choice.equals("yes")) {

            if (search()) {
                if (pass_check(client)) {
                    String choice_contianu2 = "yes";
                    while (choice_contianu2.equals("yes")) {
                        System.out

                                .println(
                                        "Hello , " + client.getName() + " Do you want take or add money ? (take/add) ");
                        choice = input.next();
                        if (choice.equals("take")) {
                            client.take();

                            System.out.println("Do you want anothar process ");
                            choice_contianu2 = input.next();

                        } else if (choice.equals("add")) {
                            client.add();
                            System.out.println("Do you want anothar process ");
                            choice_contianu2 = input.next();
                        } else {
                            System.out.println("Not valid");
                            System.out.println("Do you want contianue");
                            choice_contianu2 = input.next();
                        }
                    }
                }

            } else {
                System.out.println("Sorry , id not exist ");
                System.out.println("Do you want try again ");
                choice_contianu = input.next();
            }
        } else {
            System.out.println("not valid");
            System.out.println("Do you want try again ");
            choice_contianu = input.next();
        }

    }

    Atm() { // Constructor to initialize a new account
        setName();
        setId();
        setPass();
        setAmount();
    }

    public void setName() {
        input.nextLine();
        System.out.println("enter your name ");
        input.nextLine();
        String name = input.nextLine();
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setId() {
        System.out.println("enter your id ");
        int id = input.nextInt();
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setPass() {
        boolean x = true;
        while (x) {
            System.out.println("enter your pass , the tall of pass must be between (6) and (20)");
            String pass = input.next();
            if (pass.length() < 7)
                System.out.println("NO , this is short pass , try again ");
            else if (pass.length() > 20)
                System.out.println("NO , this is long pass , try again");
            else {
                System.out.println("Success :)");
                this.pass = pass;
                x = false;
            }
        }
    }

    public void setAmount() {
        System.out.println("enter the amount of money you want start with  ");
        int amount = input.nextInt();
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void add() {
        System.out.println("enter the amount of money you want add ");
        int add = input.nextInt();
        amount += add;
    }

    public void take() {
        System.out.println("enter the amount of money you want take ");
        int take = input.nextInt();
        if (take > amount)
            System.out.println("NO you can not :( you have " + amount);
        else {
            System.out.println("Success :)");
            amount -= take;
        }
    }

    public String getPass() {
        return pass;
    }
}

public class project1v2 {
    public static void main(String[] args) {
        while (true) { // loop Keep the program running
            Atm.cashProcess();
        }
    }
}

//  PROJECT: Employee Management System  (Version 1.0)
import java.util.*;

class Empoloyee {
    private String name;
    private int id;
    private int salary ;
    static int idCounteng = 202600; // id for engineers
    static int idCountmang = 102600; // id for manegars

    static ArrayList<Empoloyee> em = new ArrayList(); 
    static Scanner input = new Scanner(System.in);
    static Empoloyee e;

    static void delete() {  // to delete person
        System.out.println("enter the person's id you want delete");
        int iddelete = input.nextInt();
        em.removeIf(emp -> emp.getId() == iddelete);
    }

    static void ubdate() { // to make changes in (person info)
        if (search()) {
            String choice2 = "yes";
            while (choice2.equals("yes")) {
                System.out.println("What do you want ubdate \n 1-change name \n 2-change salary");
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("enter the new name ");
                        input.nextLine();
                        e.setName(input.nextLine());
                        System.out.println("do you want make anothar change else");
                        choice2 = input.next();
                        break;

                    case 2:
                        System.out.println("enter the new salary you want ");
                        e.setSalary(input.nextInt());
                        System.out.println("do you want make anothar change else");
                        choice2 = input.next();
                        break;
                    default:
                        System.out.println("NOt valid , do you want try again ");
                        choice2 = input.next();

                }
            }
        } else
            System.out.println("you can not make any change , you must enter correct id");

    }

    public static boolean search() { 
        String choice = "yes";
        boolean idexist = false;
        while (choice.equals("yes")) {

            System.out.println(" enter your id you want search  ");
            int x = input.nextInt();
            for (Empoloyee i : em) {
                if (i.getId() == x) {
                    e = i;
                    i.display();
                    idexist = true;
                    break;
                }
            }
            if (!idexist) {
                System.out.println(" sorry id not exist ");
                System.out.println("do you want try again ");
                choice = input.next();
            } else {
                System.out.println(" do you want search for anothar person (yes/no)");
                choice = input.next();
            }

            if (!choice.equals("yes")) {
                if (idexist)
                    return true;
            }

        }
        return false;

    }

    static void disPlayAllClient() {
        for (Empoloyee i : em) {
            i.display();
        }
    }

    static void process() { // tha main method in this class
        int continu = 1;
        while (continu == 1) {
            System.out.println(
                    "hello , What do you want \n 1-add person \n 2-search for a person \n 3-ubdate info for a person \n 4-delete person \n 5-print all info for all person \n enter (1,2,3,4,5) ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    addClient();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    ubdate();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    disPlayAllClient();
                    break;
                default:
                    System.out.println(" not valid , try again ");
            }
            boolean notvalid = true;
            while (notvalid) {
                System.out.println("do you want do any something else  1-continue or 2-to exist \n enter (1,2) ");
                continu = input.nextInt();
                if (continu == 2)
                    return;
                else if (continu == 1) {
                    notvalid = false;
                    continue;
                } else
                    System.out.println(" not valid ");
            }

        }

    }

    static void addClient() { // to add person
        boolean errorFlag = false;
        String continu = "yes";
        while (continu.equals("yes")) {
            System.out.println(" who you want add \n 1- engineer \n 2-manegar \n  ");
            int choice = input.nextInt();
            if (choice == 1)
                em.add(new engineer());
            else if (choice == 2)
                em.add(new manegar());

            else {
                System.out.println("not valid");
                errorFlag = true;
            }
            if (errorFlag == false) {
                System.out.println("Do you want add anothar purson ? (yes/no)");
                continu = input.next();
            } else {
                System.out.println("Do you want try again");
                continu = input.next();
            }
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Name :" + name + "\n id :" + id + "\n salary : " + getSalary());
    }
}

class engineer extends Empoloyee { 
    private int overtimehour;

    public engineer() {
        System.out.println("hello engineer");
        System.out.println(" enter your name ");
        input.nextLine();
        setName(input.nextLine());
        setId(++idCounteng);

        System.out.println(" enter your salary ");
        setSalary(input.nextInt());
        display();

    }

    public void workinproject() {
        System.out.println(" the enginner work in new project ");
    }

    public void display() {
        System.out.println("Name :" + getName() + "\n id :" + getId() + "\n salary : " + getSalary() + "\n Engineer");
    }

}

class manegar extends Empoloyee {
    private int bounos;

    public manegar() {
        System.out.println("hello manegar");
        System.out.println("enter your name ");
        input.nextLine();
        setName(input.nextLine());
        setId(++idCountmang);
        System.out.println(" enter your salary ");
        setSalary(input.nextInt());
        display();

    }

    public void display() {
        System.out.println("Name :" + getName() + "\n id :" + getId() + "\n salary : " + getSalary() + "\n manegar");
    }
}

public class project3 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Empoloyee.process();

    }
}
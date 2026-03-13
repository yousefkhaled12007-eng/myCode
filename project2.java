
/*
Student Management System Project
Description: A simple program to manage student data using OOP and ArrayList.
 */
import java.util.*;

class Student {

    // properties
    private int grade;
    private String name;
    private int age;
    private int id;

    public Student(String name, int grade, int age) {

        this.grade = grade;
        this.name = name;
        this.age = age;
    }

    static void serch() { // Function serch for students by id

        boolean exist_id = true;
        String choice = "yes";
        while (choice.equals("yes")) {
            System.out.println("enter your id");
            int idserch = project2.input.nextInt();
            for (Student i : st) {
                if (i.getId() == idserch) {
                    System.out.println("...............");
                    i.display();
                    exist_id = true;
                    System.out.println("...............");
                    break;
                } else {
                    exist_id = false;
                    continue;
                }

            }
            if (exist_id == false)
                System.out.println("soory , this id is not exist ");
            System.out.println("do you want serch about for another student ? (yes/no) ");
            choice = project2.input.next().toLowerCase();
        }
    }

    static ArrayList<Student> st = new ArrayList(); // student's Array

    public static void addstudent() { // function to add students
        String choice = "yes";
        while (choice.equals("yes")) {

            st.add(new Student());
            System.out.println("ok do you want add anothar student (yes/no) ");
            choice = project2.input.next().toLowerCase();
        }
    }

    public static void displayStudent() { // function to print info for all students in array
        System.out.println("this the student");

        for (Student i : st) {
            System.out.println("........................");
            i.display();
            System.out.println("........................");
        }
    }

    public Student() { // constaroctor to add student details

        project2.input.nextLine();
        System.out.println("enter your name ");
        name = project2.input.nextLine();
        System.out.println("enter your age ");
        age = project2.input.nextInt();
        System.out.println("enter your grade ");
        grade = project2.input.nextInt();
        System.out.println("enter your id ");
        id = project2.input.nextInt();

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void display() { // Function to print info
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Grade " + grade);
    }

}

public class project2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("do you want add student ? (yes/no) ");
        String choice = input.next().toLowerCase();
        if (choice.equals("yes")) {
            Student.addstudent();
        }
        System.out.println("do you want print info for all students ? (yes/no) ");
        choice = input.next().toLowerCase();
        if (choice.equals("yes")) {
            Student.displayStudent();
        }
        System.out.println("do you want serch about student ? (yes/no) ");
        choice = input.next().toLowerCase();
        if (choice.equals("yes")) {
            Student.serch();
        }

    }
}

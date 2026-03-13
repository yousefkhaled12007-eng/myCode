
/*
Student Management System Project
Description: A simple program to manage student data using OOP and ArrayList.
*/


  
 

import java.util.*;

class Student {
   
    //properties
    private int grade;
    private String name;
    private int age;

    public Student(String name, int grade, int age) {

        this.grade = grade;
        this.name = name;
        this.age = age;
    }

    static ArrayList<Student> st = new ArrayList(); //student's Array

    public static void addstudent() { //function to add students
        String choice = "yes";
        while (choice.equals("yes")) {

            st.add(new Student());
            System.out.println("ok do you want add anothar student (yes/no) ");
            choice = project2.input.next().toLowerCase();
        }
    }

    public static void displayStudent() { //function to print info for all students in array
        System.out.println("this the student");

        for (Student i : st) {
            System.out.println("........................");
            i.display();
            System.out.println("........................");
        }
    }

    public Student() {  //constaroctor to add student details

        project2.input.nextLine();
        System.out.println("enter your name ");
        name = project2.input.nextLine();
        System.out.println("enter your age ");
        age = project2.input.nextInt();
        System.out.println("enter your grade ");
        grade = project2.input.nextInt();

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

    public void display() { //Function to print info 
        System.out.println("this is your name " + name);
        System.out.println("this is your age " + age);
        System.out.println("this is your grade " + grade);
    }

}

public class project2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("do you want add student ? (yes/no) ");
        String choice = input.next().toLowerCase();
        if (choice.equals("yes"));
        Student.addstudent();
        System.out.println("do you want print info  ? (yes/no) ");
        choice = input.next().toLowerCase();
        if (choice.equals("yes"));
        Student.displayStudent();

    }
}

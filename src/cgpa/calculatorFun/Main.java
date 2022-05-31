package cgpa.calculatorFun;

import java.util.Scanner;


public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello!\nPlease enter the number of courses for which you want to calculate GPA");
        int numOfCourses = input.nextInt();
        Courses courses = new Courses();
        Calculator calculator = Calculator.getInstance();
        try {
            courses.addCourse(numOfCourses);
            System.out.printf("Your GPA is %.2f",calculator.calculateGPA(courses.getCourses()));
        }
        catch (IllegalArgumentException exception)
        {
            System.out.println("Exception thrown: "+exception);
        }
    }
}


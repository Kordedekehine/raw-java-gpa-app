package cgpa.calculatorFun;

import java.util.ArrayList;
import java.util.Scanner;


public class Courses {
    private ArrayList<Course> courses;


    public Courses()
    {
        courses = new ArrayList<>();
    }


    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(int numOfCourses)
    {
        if (numOfCourses > 0) {
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < numOfCourses; i++) {
                System.out.println("Please enter the name of course " + (i + 1));
                String name = input.next();
                System.out.println("Please enter the credit of course " + (i + 1));
                int credit = input.nextInt();
                System.out.println("Please enter the grade you achieved in course " + (i + 1));
                String grade = input.next();
                Course course = new Course(name, credit, grade);
                courses.add(course);
            }
        }
        else
        {
            throw new IllegalArgumentException("Invalid number of courses");
        }
    }
}

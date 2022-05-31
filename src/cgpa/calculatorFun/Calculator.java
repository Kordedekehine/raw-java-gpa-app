package cgpa.calculatorFun;

import java.util.ArrayList;


public class Calculator {
    private static Calculator onlyInstance = null;


    private Calculator() {
    }



    public static Calculator getInstance() //If container is empty accept input//Reach? Then return
    {
        if (onlyInstance == null) {
            onlyInstance = new Calculator();
        }
        return onlyInstance;
    }


    public double calculateGPA(ArrayList<Course> courses)
    {
        int totalCredit = 0;
        double totalGradePoint = 0.0;
        double gpa;
        for(Course i: courses) {
            if (i.getCredit() > 0) {
                totalCredit += i.getCredit();
                switch (i.getGrade()) {
                    case "A+":
                        totalGradePoint += i.getCredit() * 4.3;
                        break;
                    case "A":
                        totalGradePoint += i.getCredit() * 4;
                        break;
                    case "A-":
                        totalGradePoint += i.getCredit() * 3.7;
                        break;
                    case "B+":
                        totalGradePoint += i.getCredit() * 3.3;
                        break;
                    case "B":
                        totalGradePoint += i.getCredit() * 3;
                        break;
                    case "B-":
                        totalGradePoint += i.getCredit() * 2.7;
                        break;
                    case "C+":
                        totalGradePoint += i.getCredit() * 2.3;
                        break;
                    case "C":
                        totalGradePoint += i.getCredit() * 2;
                        break;
                    case "C-":
                        totalGradePoint += i.getCredit() * 1.7;
                        break;
                    case "D+":
                        totalGradePoint += i.getCredit() * 1.3;
                        break;
                    case "D":
                        totalGradePoint += i.getCredit() * 1;
                        break;
                    case "D-":
                        totalGradePoint += i.getCredit() * 0.7;
                        break;
                    case "F":
                        totalGradePoint += i.getCredit() * 0;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid Grade");
                }
            }
            else
            {
                throw new IllegalArgumentException("Invalid Credit");
            }
        }
        gpa = totalGradePoint / totalCredit;
        return gpa;
    }
}

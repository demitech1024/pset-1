// import org.graalvm.compiler.core.common.type.ArithmeticOpTable.UnaryOp.Sqrt;
import java.lang.Math;
//import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.And;

/**
 * Problem Set 1.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 * 
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet1 {
    
    public static void main(String[] args) {
        /*
         * Exercise 1.
         * 
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */
        
        final double inchToMillimeter = 2.54 * 10;
        final double width = 8.5;
        final double length = 11;
        double sheetAreaMillimeter = (width * inchToMillimeter) * (length * inchToMillimeter);
        System.out.printf("\n%,.2f square millimeters.\n", sheetAreaMillimeter);

        
        /*
         * Exercise 2.
         * 
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */
        
        double inchToCentimeter = inchToMillimeter / 10;
        double sheetPerimiter = (width * 2 * inchToCentimeter) + (length * 2 * inchToCentimeter);
        System.out.printf("\n%,.2f centimeters.\n", sheetPerimiter);
;       
        /*
         * Exercise 3.
         * 
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */
        
        double diagonalLength = Math.sqrt((Math.pow(width, 2) + Math.pow(length, 2)));
        System.out.printf("\n%,.2f inches.\n", diagonalLength);

        /*
         * Exercise 4.
         * 
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */
        
        final double quizPercent = 0.35;
        final double testPercent = 0.50;
        final double homeworkPercent = 0.15;
        int homework1 = 88;
        int homework2 = 91;
        int homework3 = 0;
        int quiz1 = 84;
        int quiz2 = 89;
        int quiz3 = 93;
        int test1 = 74;
        int test2 = 87;
        int test3 = 82;
        double testContrib = (testPercent * (((double) (test1 + test2 + test3)) / 3));
        double quizContrib = (quizPercent * (((double) (quiz1 + quiz2 + quiz3)) / 3));
        double homeworkContrib = (homeworkPercent * (((double) (homework1 + homework2 + homework3)) / 3));

        double finalGrade = testContrib + quizContrib + homeworkContrib;
        System.out.printf("\n%,.2f%%.\n", finalGrade);
        
        
        /*
         * Exercise 5.
         * 
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */

        final double hourlyWage = 12.50;
        double totalHours = 7.5 + 8 + 10.5 + 9.5 + 6 + 11.5;
        double moneyMade = totalHours * hourlyWage;
        System.out.printf("\n$%,.2f.\n", moneyMade);
        
        /*
         * Exercise 6.
         * 
         * What is my take-home pay each check?
         */
        
        final double fedIncomeTax = 0.24;
        final double stateIncomeTax = 0.0637;
        final double fourZeroOneKContrTax = 0.07;
        final double salary = 117000.00;
        double fullPaycheck = salary / 24;
    
        double payCheck = fullPaycheck * (1 - fourZeroOneKContrTax) * (1 - stateIncomeTax) * (1 - fedIncomeTax);
        System.out.printf("\n$%,.2f.\n", payCheck);

        
        /*
         * Exercise 7.
         * 
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */
        
        final int numStudents = 273;
        final int numTeachers = 28;
        final int busCapacity = 54;
        int bussesFilled = (int) Math.ceil(((double) (numStudents + numTeachers)) / ((double) busCapacity));
        int leftOver = (int) (((double)(numStudents + numTeachers)) % ((double) busCapacity));
        System.out.printf("\n%d buses are needed, with %d passengers on the last bus.\n", bussesFilled, leftOver);

        /*
         * Exercise 8.
         * 
         * What is the surface area of a standard Cornhole board?
         */
        
        final double length2 = 48;
        final double width2 = 24;
        final double diameter = 6;
        double rectangleArea = length2 * width2;
        double circleArea = Math.PI * Math.pow(diameter / 2, 2);
        double cornholeArea = rectangleArea - circleArea;
        System.out.printf("\n%,.2f square inches.\n", cornholeArea);
        
        /*
         * Exercise 9. 
         * 
         * Are the years 2020, 2100, and 2400 leap years?
         */
        
        int twenty = 2020;
        int oneHundred = 2100;
        int fourHundred = 2400;
        boolean twentyLeap = ((twenty % 4 == 0 && twenty % 100 != 0) || twenty % 400 == 0);
        boolean oneHundredLeap = ((oneHundred % 4 == 0 && oneHundred % 100 != 0) || oneHundred % 400 == 0);
        boolean fourHundredLeap = ((fourHundred % 4 == 0 && fourHundred % 100 != 0) || fourHundred % 400 == 0);
        System.out.printf("\n%d is a leap year..." + twentyLeap + ".\n%d is a leap year..." + oneHundredLeap + ".\n%d is a leap year..." + fourHundredLeap + ".\n", twenty, oneHundred, fourHundred);
    
        
        /*
         * Exercise 10.
         * 
         * What is the wind chill?
         */
        double t = 38.00;
        double v = 14.00;
        double windChill = 35.74 + (0.6215 * t) + (((0.4275 * t) - 35.75) * Math.pow(v, 0.16));
        System.out.printf("\n%.1f degrees.\n\n", windChill);
        
        
    }
}
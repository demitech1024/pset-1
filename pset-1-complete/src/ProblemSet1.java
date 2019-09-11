// import org.graalvm.compiler.core.common.type.ArithmeticOpTable.UnaryOp.Sqrt;
import java.lang.Math;

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
        double inchToCentimeter = 2.54;
        /*
         * Exercise 1.
         * 
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */
        
        double sheetAreaMillimeter = (8.5 * inchToCentimeter * 10) * (11 * inchToCentimeter * 10);
        System.out.printf("The area (in square millimeters) of an 8.5-by-11-inch sheet of paper is %.2f millimeters squared.\n", sheetAreaMillimeter);

        
        /*
         * Exercise 2.
         * 
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */
        
        double sheetPerimiter = (8.5 * 2 * inchToCentimeter) + (11 * 2 * inchToCentimeter);
        System.out.printf("The perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper is %.2fcm.\n", sheetPerimiter);
;        
        /*
         * Exercise 3.
         * 
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */
        
        double diagonalLength = Math.sqrt((Math.pow(8.5, 2) + Math.pow(11, 2)));
        System.out.printf("The length of the diagonal (in inches) between two corners on an 8.5-by-11-inch sheet of paper is %.2f inches.\n", diagonalLength);

        /*
         * Exercise 4.
         * 
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */
        
        double quizPercent = 0.35;
        double testPercent = 0.50;
        double homeworkPercent = 0.15;
        int homework1 = 88;
        int homework2 = 91;
        int homework3 = 0;
        int quiz1 = 84;
        int quiz2 = 89;
        int quiz3 = 93;
        int test1 = 74;
        int test2 = 87;
        int test3 = 82;

        double finalGrade = (testPercent * ((test1 + test2 + test3) / 3)) + (quizPercent * ((quiz1 + quiz2 + quiz3) / 3)) + (homeworkPercent * ((homework1 + homework2 + homework3) / 3));
        System.out.printf("Your marking period grade is : %.2f%%\n", finalGrade);
        
        
        /*
         * Exercise 5.
         * 
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */

        
        
        /*
         * Exercise 6.
         * 
         * What is my take-home pay each check?
         */
        
        
        
        /*
         * Exercise 7.
         * 
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */
        
        
        
        /*
         * Exercise 8.
         * 
         * What is the surface area of a standard Cornhole board?
         */
        
        
        
        /*
         * Exercise 9.
         * 
         * Are the years 2020, 2100, and 2400 leap years?
         */
        
        
        
        /*
         * Exercise 10.
         * 
         * What is the wind chill?
         */
        
        
        
    }
}
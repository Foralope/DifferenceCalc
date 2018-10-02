/*
 * Sum calculator
 * 1/10/18
 */

package inputforcalc;
import java.util.Scanner;
/**
 * @author wizwa9381
 */
public class InputForCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        //Variables
        double number1,number2,answer;
        //Input numbers
        System.out.println("Finding the sum. "); 
        System.out.print("Enter the fist number: ");
        number1 = keyedInput.nextDouble();
        System.out.print("Enter the second number: ");
        number2 = keyedInput.nextDouble();
        //Calculation
        answer = number1 + number2;
        //Show
        System.out.println("The sum is " + answer + ".");
        //Finish
        keyedInput.close();
    }
    
}

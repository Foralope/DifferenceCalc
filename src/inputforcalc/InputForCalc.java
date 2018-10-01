/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inputforcalc;
import java.util.Scanner;
/**
 *
 * @author wizwa9381
 */
public class InputForCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        double number1,number2,answer;
        System.out.println("Finding the difference. "); 
        System.out.print("Enter the fist number: ");
        number1 = keyedInput.nextDouble();
        System.out.print("Enter the second number: ");
        number2 = keyedInput.nextDouble();
        answer = number1 + number2;
        System.out.println("The difference is " + answer + ".");
        keyedInput.close();
        // TODO code application logic here
    }
    
}

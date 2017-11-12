/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_05_08_conversion_program;

import java.util.Scanner;
/**
 *
 * @author bluebackdev
 * Write a program that asks the user to enter a distance in meters. The
 * program will then present the following menu of selections:
 * 
 *      1. Convert to kilometers
 *      2. Convert to inches
 *      3. Convert to feet
 *      4. Quit the program
 * 
 * The program will convert the distance to kilometers, inches, or feet
 * depending on the user's selection. Here are the specific requirements:
 * 
 *      * Write a void method named showKilometers, which accepts a number of
 *      meters as an argument. The method should display the argument
 *      converted to kilometers. Convert the meters to kilometers using the
 *      following formula:
 * 
 *          kilometers = meters * 0.001
 * 
 *      * Write a void method named showInches, which accepts a number of
 *      meters as an argument. The method should display the argument
 *      converted to inches. Convert the meters to inches using the
 *      following formula:
 * 
 *          inches = meters * 39.37
 * 
 *      * Write a void method named showFeet, which accepts a number of
 *      meters as an argument. The method should display the argument
 *      converted to feet. Convert the meters to feet using the
 *      following formula:
 *  
 *          feet = meters * 3.281
 * 
 *      * Write a void method named menu that displays a menu of selections.
 *      This method should not accept any arguments.
 *      
 *      * The program should continue to display the menu until the user enters
 *      4 to quit the program.
 * 
 *      * The program should not accept negative numbers for the distance in
 *      meters.
 * 
 *      * If the user selects an invalid choice from the menu, the program
 *      should display an error message.
 * 
 *      Here is an example session with the program, using console input. The
 *      user's input is shown in bold.
 * 
 *          Enter a distance in meters: 500 [Enter]
 *          1. Convert to kilometers
 *          2. Convert to inches
 *          3. Convert to feet
 *          4. Quit the program
 * 
 *          Enter your choice: 1 [Enter]
 *          500 meters is 0.5 kilometers.
 * 
 *          1. Convert to kilometers
 *          2. Convert to inches
 *          3. Convert to feet
 *          4. Quit the program
 * 
 *          Enter your choice: 3 [Enter]
 *          500 meters is 1640.5 feet.
 * 
 *          1. Convert to kilometers
 *          2. Convert to inches
 *          3. Convert to feet
 *          4. Quit the program
 * 
 *          Enter your choice: 4 [Enter]
 *          Bye!
 *          
 */
public class JAVA_PRG_05_08_Conversion_Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        showMenu();
    }
    
    public static void showMenu()
    {
        int intChoice = -1;
        
        double dblMeters;
        
        Scanner scrKeyboard = new Scanner(System.in);
        
        System.out.print("Enter a distance in meters: ");
        dblMeters = scrKeyboard.nextDouble();
            
        while (intChoice != 4)
        {
            System.out.println("1. Convert to kilometers");
            System.out.println("2. Convert to inches");
            System.out.println("3. Convert to feet");
            System.out.println("4. Quit the program");
            
            intChoice = scrKeyboard.nextInt();
            
            switch(intChoice)
            {
                case 1:
                    showKilometers(dblMeters);
                    break;
                case 2:
                    showInches(dblMeters);
                    break;
                case 3:
                    showFeet(dblMeters);
                    break;
                case 4:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Select from the available options: ");
                    break;
            }
        }
    }
    
    public static void showKilometers(double dblMeters)
    {
        final double DBL_CONVERSION_FACTOR = 0.001;
        
        double dblKilometers;
        
        dblKilometers = DBL_CONVERSION_FACTOR * dblMeters;
        
        System.out.println(dblMeters + " meters is " + dblKilometers +
                " kilometers");
    }
    
    public static void showInches(double dblMeters)
    {
        final double DBL_CONVERSION_FACTOR = 39.37;
        
        double dblInches;
        
        dblInches = DBL_CONVERSION_FACTOR * dblMeters;
        
        System.out.println(dblMeters + " meters is " + dblInches +
                " inches");
    }
    
    public static void showFeet(double dblMeters)
    {
        final double DBL_CONVERSION_FACTOR = 3.281;
        
        double dblFeet;
        
        dblFeet = DBL_CONVERSION_FACTOR * dblMeters;
        
        System.out.println(dblMeters + " meters is " + dblFeet +
                " feet");
    }
}

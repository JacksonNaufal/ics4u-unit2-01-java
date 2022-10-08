/*
* The program gets a input from the user to use
* in the JacksonStacks program.
*
* @author  Jackson Naufal
* @version 1.0
* @since   2020-10-04
*
* This is a JacksonStacks program.
*/

import java.util.Scanner;
/**
 * This is the main function
 * for my program.
 * Class Main.
 */

final class Main {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        // this is a stack program
        final Scanner userInt = new Scanner(System.in);
        final JacksonStacks stackNum = new JacksonStacks();

        // this asks for tyhe input from the user.
        System.out.print("Enter a number!: ");
        final int userInput = userInt.nextInt();
        stackNum.push(userInput);

        stackNum.finishedStack();

        System.out.println("\nDone!");
    }
}

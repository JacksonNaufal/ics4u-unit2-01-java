/*
 * This is a JacksonStacks Class
 *
 * @author Jackson Naufal
 * @version 1.0
 * @since 2022-10-06
 */

import java.util.ArrayList;

/**
 * This is a class for my
 * program.
 * JacksonStacks Class
 */

public class JacksonStacks {

    /**
     * This is my array which is only editable
     * when you are in this class.
     */
    private ArrayList<Integer> stackNum = new ArrayList<Integer>();

    /**
     * This is a function for the pushed item.
     *
     * @param userInt the number thats added to the array.
     *
     */
    public void push(int userInt) {
        stackNum.add(userInt);
    }

    /**
     * This is the function that gets the stack
     * ready to be printed.
     */
    public void finishedStack() {
        System.out.println(stackNum);
    }

}

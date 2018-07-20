/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaVsPython;

/**
 *
 * @author laptop
 */
public class Conditionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        checker();

    }

    /*
        In Java if you want to initialize multiple variables in the same line, 
        you have to do it like such:
         
     */
    static int x = 100, y = 100;

    /*
        In Python, you can do it like so:
        int x, y = 100, 100;
     */
    static void checker() {
        if (x < y) {
            System.out.println("x is less than y");

        } else if (x == y) {
            System.out.println("x is the same as y");

        } else {
            System.out.println("x is greater than y");
        }

    }
    
    /*
    Python doesn't have the concept of a switch statement only if, elif, and else
    */
}

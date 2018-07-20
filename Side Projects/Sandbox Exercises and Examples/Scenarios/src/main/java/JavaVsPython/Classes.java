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
public class Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

//You can have a class within a class
    public class DivideAndMultiply {

        int c;

        public void division(int a, int b) {
            c = a / b;
            System.out.println("Result = " + c);
        }

        public void multiplication(int a, int b) {
            c = a * b;
            System.out.println("Result = " + c);

        }
    }

    public class AddAndSubtract extends DivideAndMultiply {

    }

} //End of "Classes" class

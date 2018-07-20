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
    

//You can have a class within a class no problem (nested classes)
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

    public static class AddAndSubtract extends DivideAndMultiply { //extends means inherits
        
        public void add (int a, int b){
            c = a + b;
            System.out.println("Result = " + c);
        }
        
        public void subtract (int a, int b){
            c = a - b;
            System.out.println("Result = " + c);
        }
        

    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        AddAndSubtract myMath = new AddAndSubtract();
        
        /*
        Since the AddAndSubtract class inherits from the DivideAndMultiply class
        (by way of the extends keyword), AddAndSubtract becomes a child of
        DivideAndMultiply.
        
        Now when i instantiate the AddAndSubtract class (line 54), i have access
        to all the child and parent methods
        */
        myMath.add(5, 10);//Child method
        myMath.subtract(20, 15);//Child method
        myMath.multiplication(25, 4);//Parent method
        myMath.division(15, 5);//Parent method
    }

} //End of "Classes" class


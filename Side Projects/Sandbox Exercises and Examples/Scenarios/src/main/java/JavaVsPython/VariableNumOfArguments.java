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
public class VariableNumOfArguments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Print out all the arguments: "); voidMultiAdd (10, 20, 30, 40);
        
        System.out.println("Add all the arguments: " + intMultiAdd (1, 2, 3, 4, 5));
    }
    
    /*
    This is an example of a method that allows a variable number of parameters
    */
    static void voidMultiAdd (int... args){ //the ... symbolizes passing multiple arguments        
        for (int arg : args) {
            System.out.println(arg);
            
        }
    }
    
    /*
    Same thing but with a return statement
    */
    static int intMultiAdd (int... args){
        int result = 0;
        
        for (int number : args){
            result += number;
        }
        return result;
    }
    
    /*
    In Python this would look like:
    
    def multi_add(*args):
    result = 0
        for x in args:
            result +=x
        return result
    */
    
}

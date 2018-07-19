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
public class FunctionDeclarations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(power(3, 2));

    }
    
    /*
    In Java you cannot give a default value within a method declaration.
    So you can't do for instance int x = 1
    In Python you can do this.
    */

    //Java Syntax:
    static int power(int num, int x) {
        int result = 1;
        for (int i = 0; i < x; i++) {
            result *= num;

        }
        return result;

    }
    
    /*
    So in Python, this is legal below (notice the x=1 within the function):
    
    def power(num, x=1): 
    result = 1
    for i in range(x):
        result = result*num
    return result
    
    */

}

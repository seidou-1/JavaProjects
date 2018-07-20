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
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        In Python, there's not really the concept of an index counter
        that controls the number of iterations in a for loop i.e. int i = 0;
        Python keeps things simpler and doesn't use a variable to count 
        the iterations within the loop. Instead, for loops in Python are 
        iteretors within itself
        
        The above Java for loop looks like this in Python:
        
        for x in range (0, 10):
            print(x)
        */
        
        //Java version:
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            
        }
        
        /*
        Let's say we want to iterate through a collection:
        */
        
        //One way of initializing an array in Java:
        String[] weekends = new String[] {"Saturday", "Sunday"};
        
        //Second way of initializing an array in Java:
        String weekdays[] = {"Monday","Tuesday","Wednesday", "Thursday", "Friday"};
        
        for (String bucket : weekends){
            System.out.println(bucket);
        }
    }
    
}

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
        String[] weekends = new String[]{"Saturday", "Sunday"};

        //Second way of initializing an array in Java:
        String weekdays[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        //Iterating through a collection of things in Java:
        for (String bucket : weekends) {
            System.out.println(bucket);
        }

        /*
        In Python it would look like this:
        
        weekdays = ["Monday","Tuesday","Wednesday", "Thursday", "Friday"]
        
        for d in weekdays:
            print (d)
        
         */
        
        /*
        What if we wanted to break out of a loop following a condition?
        In Java it would look like this:
        */
        
        for (int i = 0; i < 10; i++) {
            
            if (i == 5) {
                break;
            }
            System.out.println(i);
            
        }
        
        /*
        In Python, it would look like this:
        
        for x in range(0, 10):
            print (x)
            if (x==5): break
        */
        
        
        
        /*
        If we wanted to skip certain things within the for loop, we would
        use the continue keyword. The continue keyword is a bit of a misnomer
        because it implies we are continuing regardless; while in fact we are
        actually skipping whichever conditions are applicable. 
        
        This is what the continue keyword looks like in Java:
        */
        
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) { //If we divide i by 2 and that equals zero, skip from printing that number. 
                continue; //In layman's terms this if statement is telling Java to skip all even numbers
            }
            
            System.out.println(i); //otherwise print out i
            
        }
        
        /*
        In Python, the continue statement would look like this:
        
        for x in range(0, 10):    
            if (x % 2 == 0): continue
            print (x)
        */
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsingInterfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author seidou-1
 */
public class ArrayListScenarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<String> myList = new ArrayList<>();
        /*
        The above list interface is a member of the java.util package, hence the import
        Generic notation defines the type of items that will be added between the < >
        This creates an object called myList
         */

        myList.add("Blue");
        myList.add("Green");
        myList.add("Orange");
        myList.add("Red");
        myList.add("Purple");

        System.out.println(myList);//This outputs the entire string object

        myList.add("Yellow"); //I'm adding an additional element to the myList object

        System.out.println(myList);//This updates the print output and displays yellow now
        
        myList.remove(0); //This removes the "Blue" element from the list and pushes every element down one slot
        System.out.println(myList);
        
        String thirdColor = myList.get(2); //This will get the index value of 2 which is red and assign it to "thirdColor"
        System.out.println("The third color is " + thirdColor);
        
        int redPosition = myList.indexOf("Red"); //The indexOf method gets the index slot of my myList object
        System.out.println("The color Red is in the spot position " + redPosition);
    }

}

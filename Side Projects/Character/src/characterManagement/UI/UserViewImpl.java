/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterManagement.UI;

import java.util.Scanner;

public class UserViewImpl implements UserView {

    /*
    Im going to instantiate a scanner here so i can use it to record the user's input
    The purpose of this class is to rinse and reuse. Rather than constantly doing a
    System.out.println(); and have a scanner attached, i can just call one of these methods
    and pass in what i want as variables. The methods will do the displaying for me
    
    Anytime I say "display" or "prompt", i'm calling the CharacterView class
     */
    private Scanner myScanner = new Scanner(System.in);

    @Override
    public String prompt(String takesIn) {
        String result = "";
        while (result == "") {
            result = myScanner.nextLine();
            if (result == "") { //If result is still equal to nothing
                display("input is required");

            }
        }
        return result;

    }

    @Override
    public void display(String takesIn) {

    }

    @Override
    public int promptInt(String takesIn) {
        int result = 0;
        while (result == 0) {
            String userInput = prompt(takesIn); //Creting a variable called userInput and assigning it to call the prompt method
            //The prompt method method takes in what was just passed, and adds a scanner to it
            result = Integer.parseInt(takesIn); //This takes the string the user inputted and parses it to an int

        }
        return result;
    }
    
}
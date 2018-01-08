/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterManagement.UI;

/**
 *
 * @author laptop
 */
public interface UserView {
    /*
    This class and only this class interacts with the user
    This class presents prompts to the user and records their input
    The purpose of this class (and the UserViewImpl class that's implmenenting this class)
    is to not be DRY (Don't Repeat Yourself). Rather than prompting the user, putting a scanner,
    and registering the user's input each time, i can instead put all of those steps
    into a method to automatically do those things and I can just call the method as a
    shortcut and feed the method paramaters. This class will parseInt, format, and do all the 
    things i would otherwise be doing manually for each prompt i have for the user
    */
    
    void display (String takesIn);//This method takes in a String but doesn't return anything
    String prompt (String takesIn);//Takes in a String from the user and returns the same String they inputted
    int promptInt (String takesIn);//Takes in a string from the user and returns what they inputted but as an int instead
}

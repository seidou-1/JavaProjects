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
    */
    
    void display (String takesIn);//This method takes in a String but doesn't return anything
    String prompt (String takesIn);//Takes in a String from the user and returns the same String they inputted
    int promptInt (String takesIn);//Takes in a string from the user and returns what they inputted but as an int instead
}

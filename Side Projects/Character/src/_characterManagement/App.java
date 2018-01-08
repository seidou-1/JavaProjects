/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _characterManagement;

import characterManagement.UI.CharacterView;
import characterManagement.UI.UserView;
import characterManagement.UI.UserViewImpl;
import characterManagement.controller.CharacterController;
import characterManagement.dao.CharacterDAO;
import characterManagement.dao.CharacterDAOFileImpl;
import characterManagement.dao.CharacterDAOInMemoryImpl;

/**
 *
 * @author laptop
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        The reason why im specifying CharacterDAOInMemoryImpl() as the implementation type for "CharacterDAO"
        is because i have flexibility in the future to have multiple interface implementations
        
        This is pretty much saying. anything on the right side of the "=" sign, as long as you implement me (CharacterDAO)
        as an interface, i'll let you be assigned to the variable "myDao".
        
        It doesn't care. As long as it has a way to prompt the user, display a message, and prompt the user for a number 
        (which are all in UserView)
        
        ****As an example, i'll create another implementation called "CharacterDAOFileImpl" which is another flavor of implementation
        */
        CharacterDAO myDao = new CharacterDAOInMemoryImpl(); //Flavor A
//        CharacterDAO myDaoFlavorB = new CharacterDAOFileImpl("Character.csv"); //Flavor B
        
        UserView myView = new UserViewImpl();
        CharacterView myCharacterView = new CharacterView(myView); //A CharacterView depends on a UserView being passed to it. It doesnt
        //really care about which implementation is used, as long as it gets a UserView interface
        
        CharacterController myController = new CharacterController(myDao, myCharacterView);
        
        //Execute and run the program
        myController.run();
    }
    
}

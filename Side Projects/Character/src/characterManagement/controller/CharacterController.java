/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterManagement.controller;

import characterManagement.UI.CharacterView;
import characterManagement.dao.CharacterDAO;
import characterManagement.dto.CharacterDTO;
import java.util.List;

/**
 *
 * @author laptop
 */
public class CharacterController {
    
    CharacterDAO myDao;
//    ClassRosterView myView;
    
    //This is a way of instantiating CharacterView:
    CharacterView myView;

    public CharacterController(CharacterDAO myDao, CharacterView myView) {
        /*
        Creating a constructor here for the Dao and for the view
        */
        this.myDao = myDao;
        this.myView = myView;
    }

    public void run() {
        /*
    The controller should be the class that runs the program
        
    -Display Menu
    -Loop until Exit is chosen
         */
        
        while (true){
             int menuSelection = myView.displayMenuAndGetUserSelection(); //menuSelectio has to have a value before i can use it so i'm setting it to zero here
             boolean keepGoing = true;
             switch (menuSelection){
                 
                 case 1:
                     createCharacter();
                     break;

                 case 2:
                     updateCharacter();
                     break;

                 case 3:
                     displayAllCharacters();
                     break;
                 case 4:
                     displayCharacter();
                     break;
                 case 5:
                     deleteCharacter();
                 case 6:
                     keepGoing = false;
                 default:
                     break;
             }
             //Should have a message here that says Goodbye or something
        }
        
    }
    
    private void createCharacter() {
        
        /*
        -instantiate a character object (from CharacterDTO)
        -prompt the user to get the name, age, hair color, and rank
        -store character in the DAO (that means i need to instantiate a DAO above
        */
        
        CharacterDTO myCharacter = new CharacterDTO(); //instantiated a DTO
        myCharacter = myView.createCharacter();
        myDao.createCharacter(myCharacter); //calling "createCharacter(CharacterDTO characterDataSet)" and passing a CharacterDTO data type called "myCharacter"
        
    }

    private void updateCharacter() {
        /*
        To update a character i need to get a character from the DAO
        */
        
        String placeHolderName = "";
        CharacterDTO myCharacter = myDao.getCharacterByName(placeHolderName);//I'm passing the character object to this dao method. The controller hass to pass to the DAO
        if (myCharacter!=null) { //placeHolderName is the name that the user provides
            //display the character via the View
            myView.displayCharacterInfo(myCharacter);
            //prompt for edits
            myCharacter = myView.updateCharacter(myCharacter);
            myDao.updateCharacter(placeHolderName, myCharacter);
            
        } else{
            //display no character found
        }
    }

    private void displayAllCharacters() {
        /*
        Here i'm going to loop through all the characters using an enhanced for loop and display all
        */
        List <CharacterDTO> myLoopingList = myDao.getAllCharacters();
        for (CharacterDTO anyName : myLoopingList){
            
            //display characters
//            System.out.println("\n" + anyName);
            myView.displayCharacterInfo(anyName);
        } 

    }

    private void displayCharacter() {
        /*
        This method will provide a way to search for a specific character
        */
        String placeHolderName = "";
        CharacterDTO myCharacter = myDao.getCharacterByName(placeHolderName);//I'm passing the character object to this dao method. The controller hass to pass to the DAO
        if (myCharacter!=null) {
            //display the character via the View
                        myView.displayCharacterInfo(myCharacter);

        } else{
            //display no character found
        }

    }
    
    private void deleteCharacter(){
        String placeHolderName = "";
        CharacterDTO myCharacter = myDao.getCharacterByName(placeHolderName);//I'm passing the character object to this dao method. The controller hass to pass to the DAO
        if (myCharacter != null) {
            //Prompt user are you sure?
            //if yes
            myDao.deleteCharacter(placeHolderName);//placeHolderName is the name that the user provides
            
        }
    }


}

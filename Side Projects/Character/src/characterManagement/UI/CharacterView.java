/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterManagement.UI;

import characterManagement.dto.CharacterDTO;

/**
 *
 * @author laptop
 */
public class CharacterView {
    /*
    The purpose of this class is to actually display the menu options to the user
    The purpose of the view is to just format the data and get it back to the controller
    This class will take in the UserView Class
    
    */
    
    UserView view;

    public CharacterView(UserView view) {
        this.view = view;
    }
    
    /*
    Each one of these methods below will display to the user different options.
    It's pretty much interacting with the user. it'll display optiona and then capture
    the user's input.
    After it captures the user's input, this CharacterView class will then pass everything
    back over to the controller
    */
    
    public int displayMenuAndGetUserSelection(){
        view.promptInt("1. Create a Character");
        view.promptInt("2. Update a Character");
        view.promptInt("3. Display all Characters");
        view.promptInt("4. Search for a Character");
        view.promptInt("5. Delete a Character");
        view.promptInt("6. Exit");
        return view.promptInt("Select from one of the above choices");
    }
    
 //DataType I'll return   Method Name     DataType   
    public CharacterDTO createCharacter(){
        //I am calling the UserView class method "prompt" which takes in a String and outputs the same String
        String name = view.prompt("What is your character's name?");
        int age = view.promptInt("What is your character's age?");
        String hairColor = view.prompt("What is your character's hair color?");
        String rank = view.prompt("What is your character's rank?");

//        Since we're creating a character, the DTO (Character) needs
  //      to be instantiated below:
        
        CharacterDTO myCharacter = new CharacterDTO();
        
        //Now i'm putting some small logic here to set the object with the values the user gave me
        myCharacter.setName(name);
        myCharacter.setAge(age);
        myCharacter.setHairColor(hairColor);
        myCharacter.setRank(rank);
        
        //I have to return the myCharacter object (the DTO)
        return myCharacter;
    }
     
    
 //DataType I'll return   Method Name     DataType   
    public CharacterDTO updateCharacter(CharacterDTO myCharacter){
        //I am calling the UserView class method "prompt" which takes in a String and outputs the same String
        String name = view.prompt("What is your character's name?");
        int age = view.promptInt("What is your character's age?");
        String hairColor = view.prompt("What is your character's hair color?");
        String rank = view.prompt("What is your character's rank?");

//      I'm not creating a character here, instead i'm updating my character
//      and so i don't need to instantiate my DTO
        
        //Now i'm putting some small logic here to set the object with the values the user gave me
        myCharacter.setName(name);
        myCharacter.setAge(age);
        myCharacter.setHairColor(hairColor);
        myCharacter.setRank(rank);
        
        //I have to return the myCharacter object (the DTO)
        return myCharacter;
    }
    
// I'm not returning anyhing here      
    public void displayCharacterInfo(CharacterDTO myCharacter){
   
        view.display(myCharacter.getName() + ":" + myCharacter.getAge() + ":" + myCharacter.getHairColor() + ":" + myCharacter.getRank() + "");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterManagement.dao;

import characterManagement.dto.CharacterDTO;
import java.util.List;

/**
 *
 * @author laptop
 */
public interface CharacterDAO {
    
    //Since this is a CRUD based application, it's going to follow the CRUD+ based style
    //The methods below will drive the operations this class interface can perform
    //This is my interface and i will create an implementation of this interface
    
    CharacterDTO createCharacter(CharacterDTO whateverParamName);
    /* createCharacter: CharacterDTO is the data type aka the object i will be working with
    I'm passing it the Character object as a paramater..
    So whoever calls this method, has to supply the Chacacter object
    And in return, this method will pass back to them the character they created
    */
    
    CharacterDTO getCharacterByName (String name);
    /* getCharacterByName: In order to read and return a character, i need to return a List of
    characters. So i'm going to use a hashMap for that - which is the method below.
    */
    
    List<CharacterDTO> getAllCharacters(); //HashMap
    
    void updateCharacter (String name, CharacterDTO whatevaParamName);
    /* updateCharacter: To update a character, i just need to send information to the DAO
    "whatevaParamName" is the information you're looking to save.
    Nothing needs to get returned that's why it's void.
    */
    
    void deleteCharacter(String name);
    /* deleteCharacter: For this method i just need to delete the character by providing the name
    of the character i want deleted so i'll pass it a name paramater of type String
    */
    
}

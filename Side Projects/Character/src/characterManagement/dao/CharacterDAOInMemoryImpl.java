/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterManagement.dao;

import characterManagement.dto.CharacterDTO;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CharacterDAOInMemoryImpl implements CharacterDAO {
    
    /*
    I need a private HashMap since i'll be manipulating the object(s) with the below methods
    So i will instantiate the Map interface with an instance called "myCharacterMap"
    */
    
    //            Key       Value     VariableName  
    private Map <String, CharacterDTO> myCharacterMap = new HashMap <>();
    
    @Override
    public CharacterDTO createCharacter(CharacterDTO characterDataSet) {
        /*
        To create a character i just need to use the HashMap "put" method
        The placeholder for the parmater i pass is called "characterDataSet"
        So whatever value i type in there when i call this method gets passed to 
        the ".put" method. So essentially i am creating an entry into the HashMap with the value i passed
        "characterDataSet.getName()" is the getter from the CharacterDTO class 
        and i am passing the entire Character set of data.
        Since the dataType is "CharacterDTO", that's how it's able to get the getter
        The method on that variable (parameter) .getName(), returns you the string Name stored 
        in the variable which holds character information.
        */
        myCharacterMap.put (characterDataSet.getName(), characterDataSet);
        return characterDataSet;
 
    }

    @Override
    public CharacterDTO getCharacterByName(String name) {
        /*
        Using an if statement here because I want to check to make sure the name
        wasn't changed to something else and inadvertantly create a new record
        */
        if (myCharacterMap.containsKey(name)) {
            return myCharacterMap.get(name);
            
        } 
        return null; //shortcut for an else statement
//
    }

    @Override
    public List<CharacterDTO> getAllCharacters() {
        /*
        This will return the list HashMap
        */
        return (List<CharacterDTO>) myCharacterMap.values();
    }

    @Override
    public void updateCharacter(String name, CharacterDTO characterDataSet) {
        /*Again i'm using an if statement here because I want to check to make sure the name
        wasn't changed to something else and inadvertantly create a new record
        
        */
        if (myCharacterMap.containsKey(name)) {
            myCharacterMap.put(name, characterDataSet);
        }
        
    }

    @Override
    public void deleteCharacter(String name) {
        /*
        Same if statement reason. I want to check to make sure the name
        wasn't changed to something else and inadvertantly create a new record
        */
        
        if (getCharacterByName(name)!= null) {
            myCharacterMap.remove(name);
            
        }
    }
    
}

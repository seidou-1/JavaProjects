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
    So i will instantiate the Map interface with an instance called "myCharacter"
    */
    
    //            Key       Value     VariableName  
    private Map <String, CharacterDTO> myCharacter = new HashMap <>();
    
    @Override
    public CharacterDTO createCharacter(CharacterDTO whateverParamName) {
        /*
        To create a character i just need to use the HashMap "put" method
        The placeholder for the parmater i pass is called "whateverParamName"
        So whatever value i type in there when i call this method gets passed to 
        the ".put" method. So essentially i am creating an entry into the HashMap with the value i passed
        "whateverParamName.getName()" is the getter from the CharacterDTO class
        Since the dataType is "CharacterDTO", that's how it's able to get the getter
        */
        myCharacter.put (whateverParamName.getName(), whateverParamName);
        return whateverParamName;
 
    }

    @Override
    public CharacterDTO getCharacterByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CharacterDTO> getAllCharacters() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCharacter(String name, CharacterDTO whatevaParamName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCharacter(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

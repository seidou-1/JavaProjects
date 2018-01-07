/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterManagement.dto;

/**
 *
 * @author laptop
 */
public class CharacterDTO { //This class is the actual object i'll be working it. The object in this case is a "Character"
    //As such it will be considered to be the DTO
    
    //Below i'm establishing the properties of the object (getters and setters)
    
    private String nameeeee;
    private String age;
    private String hairColor;
    private String rank;

    public String getName() {
        return nameeeee;
    }

    public void setName(String name) {
        this.nameeeee = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
}

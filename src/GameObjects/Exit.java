/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObjects;

import GameEnums.Direction;

/**
 *
 * @author UUAM
 */
public class Exit extends GameObject{
    
    Direction   direction;
    TheRoom     target;
    TheRoom     location;
    
    
    public Exit(Direction direction, TheRoom location, TheRoom target){
        this.direction = direction;
        this.location = location;
        this.target = target;
    }

    @Override
    public String getExamine() {
        return "a door" + " leading " + direction.getDirectionText();
    }

    void setOrigin(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

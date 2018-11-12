package entities;

public class Player extends Character {

    public Player(){
        this.typeName = "player";
        this.description = "this is you, in person";
    }
    
    
    public Room getLocation() {
        return location;
    }

    public void setLocation(Room location) {
        this.location = location;
    }

    
    

    
}

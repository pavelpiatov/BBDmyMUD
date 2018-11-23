package entities;

public class Player extends Creature {

    public Player(Room room, int number){
        this();
        this.location = room;
        this.ingameNumber = number;
    }
    
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

package entities;

public class RoomObject extends GameObject {

    Room location;
    
    public RoomObject(){
        this(null, -1);
    }
    
    public RoomObject(Room room, int number){
        this.location = room;
        this.name = "object";
        this.ingameNumber = number;
    }

    String getDescription() {
        return (name + " " + ingameNumber);
    }
    
    
}

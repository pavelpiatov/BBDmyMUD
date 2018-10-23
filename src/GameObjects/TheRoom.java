package GameObjects;

import GameEnums.Direction;
import GameEnums.Lighting;
import Interfaces.Examinable;

public class TheRoom extends GameObject{
    
    private Exit southExit;
    private Exit westExit;
    private Exit eastExit;
    private Exit northExit;
    private Direction cameFrom;
    
    public TheRoom(){
        this.objectName = "room";
        this.examine = "room you are standing in";
    }

    public TheRoom(String examine){
        this.examine = examine;
    }
    
    public TheRoom(String examine, Direction cameFrom){
        this.cameFrom = cameFrom;
        switch (cameFrom) {
            case EAST: 
                eastExit = new Exit(Direction.EAST, this, null);
                eastExit.setOrigin(true);
                break;
            case NORTH:
                eastExit = new Exit(Direction.EAST, this, null);
                eastExit.setOrigin(true);
                break;
            case SOUTH:
                eastExit = new Exit(Direction.EAST, this, null);
                eastExit.setOrigin(true);
                break;
            case WEST:
                westExit = new Exit(Direction.EAST, this, null);
                westExit.setOrigin(true);
                break;
        }
    }
    

    
}

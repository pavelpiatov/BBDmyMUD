package GameEnums;

public enum Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST,
    NONE;
    
    
    public String getDirectionText(){
        switch(this){
            case NORTH:
                return "north";
            case EAST:
                return "east";
            case SOUTH:
                return "south";
            case WEST:
                return "west";
            case NONE:
                return "nowhere";
            default:
                return "nowhere";
        }
                
    }
    
    
    
    
    
}

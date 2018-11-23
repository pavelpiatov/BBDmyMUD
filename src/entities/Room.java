package entities;

import GameEnums.Direction;
import java.util.ArrayList;

public class Room extends Entity {
    
    
    int x; //ascending to the east, descending to the west
    int y; //ascending to the north, descending to the south
    Door doorN;
    Door doorW;
    Door doorS;
    Door doorE;
    ArrayList<RoomObject> contents;
    ArrayList<Player> players;
    
    public Room(){
        this(-400, -400);
    }
    
    public Room(int x, int y){
        this(x, y, null, null, null, null);
    }
    
    public Room(int x, int y, Door doorN, Door doorW, Door doorS, Door doorE){
        this.x = x;
        this.y = y;
        this.doorN = doorN;
        this.doorW = doorW;
        this.doorS = doorS;
        this.doorE = doorE;
        
        contents = new ArrayList<RoomObject>();
        players = new ArrayList<Player>();
        
        this.typeName = "room";

        this.description = "a dank, stuffy room";
    }

    public String lookAroundTheRoom(){
        StringBuilder lookAroundTheRoom = new StringBuilder();
        lookAroundTheRoom.append("You stand in ");
        lookAroundTheRoom.append(description);
        lookAroundTheRoom.append(String.format(" (%d,%d).", x, y));
        lookAroundTheRoom.append(doorDescription());
        lookAroundTheRoom.append(contentsDescription());
        return lookAroundTheRoom.toString();
    }

    private String doorDescription() {
        StringBuilder doorDescription = new StringBuilder();
        doorDescription.append("You look at the walls. ");
        if (noDoors()){
            doorDescription.append("There are no doors! You are boxed in! ");
        } else {
            if (getDoorE() != null){
                doorDescription.append("There is a door on the East wall. ");
            }
            if (getDoorN() != null){
                doorDescription.append("There is a door on the North wall. ");
            }
            if (getDoorW() != null){
                doorDescription.append("There is a door on the West wall. ");
            }
            if (getDoorS() != null){
                doorDescription.append("There is a door on the South wall. ");
            }
        }
        return doorDescription.toString();
    }
    
    //TODO IDEA - move all SOUTing to GameMaster, make a function that takes care of punctuation.

    private String contentsDescription() {
        if (contents.isEmpty()){
            return "The room is void of content. ";
        } else {
            StringBuilder contentsDescription = new StringBuilder();
            contentsDescription.append("The room contains: ");
            for (RoomObject object : contents){
                contentsDescription.append(object.getDescription() + ", ");
            }
            int lastComma = contentsDescription.lastIndexOf(", ");
            contentsDescription.replace(lastComma, lastComma+2 , ". ");
            return contentsDescription.toString();
        }
    }
    
    public void addPlayer(Player player){
        System.out.println("Add player:");
        if (!players.contains(player)){
            players.add(player);
            System.out.println("Room " + this.x + ", " + this.y + " added player.");
        }
    }
    
    public void removePlayer(Player player){
        System.out.println("Remove player:");
        if (players.contains(player)){
            players.remove(player);
            System.out.println("Player removed.");
        }
    }
    
    public void add(RoomObject object){
        contents.add(object);
    }
    
    public void remove(RoomObject object){
        contents.remove(object);
    }
    












    
    public Door getDoorN() {
        return doorN;
    }

    public void setDoorN(Door doorN) {
        this.doorN = doorN;
    }

    public Door getDoorW() {
        return doorW;
    }

    public void setDoorW(Door doorW) {
        this.doorW = doorW;
    }

    public Door getDoorS() {
        return doorS;
    }

    public void setDoorS(Door doorS) {
        this.doorS = doorS;
    }

    public Door getDoorE() {
        return doorE;
    }

    public void setDoorE(Door doorE) {
        this.doorE = doorE;
    }

    public ArrayList<RoomObject> getContents() {
        return contents;
    }

    public void setContents(ArrayList<RoomObject> contents) {
        this.contents = contents;
    }

    private boolean noDoors() {
        return (doorN == null && doorW == null && doorS == null && doorE == null);
    }

    public Door getDoor(Direction direction) {
        switch (direction){
            case NORTH: return doorN;
            case SOUTH: return doorS;
            case EAST: return doorE;
            case WEST: return doorW;
            default: return null;
        }
    }
    
    @Override
    public String toString(){
        return new StringBuilder().append("room (" + x + "," + y +") ").toString();
    }




}

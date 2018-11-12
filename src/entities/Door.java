package entities;

public class Door extends GameObject {

    Room firstRoom;
    Room secondRoom;
    
    public Door(Room first, Room second){
        this();
        firstRoom = first;
        secondRoom = second;
    }

    public Door() {
        this.typeName = "door";
        this.description = "a door to another room";
    }

    public Room getOtherRoom(Room roomOrigin) {
        System.out.println("Door.getOtherRoom(room1): ");
        if (firstRoom.equals(roomOrigin)){
            System.out.println("FirstRoom fits");
            return secondRoom;
        } 
        else if (secondRoom.equals(roomOrigin)){
            System.out.println("SecondRoom fits");
            return firstRoom;
        }
        System.out.println("nothing fits");
        return null;
    }
    
}

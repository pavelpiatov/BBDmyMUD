package System;

import GameEnums.Direction;
import GameObjects.Exit;
import GameObjects.PlayerCharacter;
import GameObjects.TheRoom;
import entities.Door;
import entities.Player;
import entities.Room;
import java.util.Scanner;

public class GameMaster {

    String userInput;
    private Parser parser;
    private Scanner userInputScanner;
    
    public GameMaster(){
        parser = new Parser(this);
        userInputScanner = new Scanner(System.in);
    }
    
    public void run() throws InterruptedException{
        System.out.println("Hello, world!");
        
        
        
        Room firstRoom = new Room(20, 533);
        Room secondRoom = new Room(20, 534);
        Door doorFirstToSecond = new Door(firstRoom, secondRoom);
        firstRoom.setDoorN(doorFirstToSecond);
        secondRoom.setDoorS(doorFirstToSecond);
        Player pc = new Player();
        
        spawnPlayer(pc, firstRoom);
        
        
        Thread.sleep(1000);
        
        while (true) {
            System.out.println("Your turn");
            userInput = userInputScanner.nextLine();
            System.out.println("You wrote: " + userInput + ".");
            
            consider(pc, userInput);
            
            Thread.sleep(1000);
            
            System.out.println("");
        }

        
        
    }

    private void consider(Player player, String userInput) {
        String[] inputWords = parser.parse(userInput);
        
        commandSwitch(player, inputWords);
    }

    private void commandSwitch(Player player, String[] inputWords) {
        String inputWord = inputWords[0].toLowerCase();
        switch (inputWord){
            case "look":
                look(player, inputWords);
                break;
            case "north":
                move(player, Direction.NORTH);
                break;
            case "south":
                move(player, Direction.SOUTH);
                break;
            case "east":
                move(player, Direction.EAST);
                break;
            case "west":
                move(player, Direction.WEST);
                break;
            case "quit":
            case "exit":
                System.exit(0);
        }
    }

    private void look(Player player, String[] inputWords) {
        System.out.println("You look around");
        System.out.println(player.getLocation().lookAroundTheRoom());
        
    }
    
    private void spawnPlayer(Player player, Room room){
        System.out.println("player location is: " + player.getLocation());
        if (player.getLocation() != null){
            player.getLocation().removePlayer(player);
        } 
        player.setLocation(room);
        room.addPlayer(player);
        System.out.println("player location is: " + player.getLocation());
    }

    private void move(Player player, Direction direction) {
        Room roomOrigin = player.getLocation();
        Door portal = roomOrigin.getDoor(direction);
        if (portal != null){
            Room roomDestination = portal.getOtherRoom(roomOrigin);
            System.out.println(roomDestination);
            roomOrigin.removePlayer(player);
            roomDestination.addPlayer(player);
            player.setLocation(roomDestination);
            
        }
    }
}

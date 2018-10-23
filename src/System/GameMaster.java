package System;

import GameEnums.Direction;
import GameObjects.Exit;
import GameObjects.PlayerCharacter;
import GameObjects.TheRoom;
import java.util.Scanner;

public class GameMaster {

    String userInput;
    
    public void run() throws InterruptedException{
        System.out.println("Hello, world!");
        
        System.out.println(new Exit(Direction.EAST, null, null).getExamine());
        
        TheRoom room0 = new TheRoom();
        
        PlayerCharacter pc = new PlayerCharacter();
        pc.setLocation(room0);
        
        System.out.println(pc.getExamine());
        Scanner userInputScanner = new Scanner(System.in);
        
        System.out.println(room0.getExamine());
        Thread.sleep(1000);
        
        while (true) {
            System.out.println("Your turn");
            userInput = userInputScanner.nextLine();
            System.out.println("You wrote: " + userInput + ".");
            Thread.sleep(1000);
            System.out.println("");
        }

        
        
    }
}

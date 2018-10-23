package System;

public class PiatovMUD {

    static GameMaster gm;
    
    public static void main(String[] args) throws InterruptedException {
        
        gm = new GameMaster();
        gm.run();
        
    
    }
}

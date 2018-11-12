package System;

public class Parser {
    
    GameMaster gm;
    
    Parser(GameMaster gm){
        this.gm = gm;
    }
    
    public String[] parse(String string){
        String[] wordsArray = string.trim().replaceAll("\\s{2,}", " ").split(" ");
        
        int i = 0;
        for (String s : wordsArray){
            System.out.println( ++i + " " + s);
        }
        
        return wordsArray;
    }
    
    
}







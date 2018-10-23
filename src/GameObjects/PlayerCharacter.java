package GameObjects;

public class PlayerCharacter extends LaCreatura {

    private TheRoom location;
    private String name;
    
    
    
    public PlayerCharacter(){
        super("Player", "this is you, the one and only");
        objectID = 1001;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setLocation(TheRoom location){
        this.location = location;
    }


}

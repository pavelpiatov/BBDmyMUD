package GameObjects;

public class LaCreatura extends GameObject {
    
    protected int maxHp = 10;
    protected int currentHp = 10;
    protected int armor = 0;
    protected int regenHp = 0;
    protected int damage = 3;
    
    
    public LaCreatura(){
        objectID = 1;
        examine = "generic creature";
    }
    
    public LaCreatura(String creatureName, String examine){
        objectID = 1;
        this.examine = examine;
        objectName = creatureName;
        
    }

    public LaCreatura(String creatureName, String examine, int maxHp, 
            int currentHp, int armor, int regenHp, int damage){
        this(creatureName, examine);
        this.maxHp = maxHp;
        this.currentHp = currentHp;
        this.damage = damage;
        this.armor = armor;
        this.regenHp = regenHp;
        this.maxHp = maxHp;
    }
    
    
    
}

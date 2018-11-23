package entities;

public abstract class Entity {

    private final int id;
    protected static String typeName = "entity";
    protected String name;
    protected String description;
    protected int ingameNumber;
    
    protected Entity(){
        id = 0; 
    }
    
}

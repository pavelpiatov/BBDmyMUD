package GameObjects;

import GameEnums.Lighting;
import Interfaces.Examinable;

public class GameObject implements Examinable {

    static  protected    int    objectID;
            protected   String  objectName = "object";
            protected   String  examine;

    
    GameObject(){
        objectID = 0;
        examine = "generic object";
    }
    
    public int getObjectID (){
        return objectID;
    }

    @Override
    public String getExamine() {
        return  objectName;
    }

    
}

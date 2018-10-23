/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameEnums;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author UUAM
 */
public enum Lighting {
    NONE(0),
    DIM(1),
    NORMAL(2),
    BRIGHT(3),
    EXTREME(4);
    
    private int value;
    
    private Lighting(int value) {
        this.value = value;
    }
    
    private static Map map = new HashMap<>();

    static {
        for (Lighting light : Lighting.values()) {
//            map.put(Lighting.value, light);
        }
    }

    public static Lighting valueOf(int light) {
        return (Lighting) map.get(light);
    }

    public int getValue() {
        return value;
    }
    
    public String getLightingText(){
        switch(this){
            case NONE:
                return "in complete darkness";
            case DIM:
                return "dimly lit";
            case NORMAL:
                return "has normal lighting";
            case BRIGHT:
                return "brightly lit";
            case EXTREME:
                return "drowning in bright light";
            default:
                return "no lighting";
            }
                
    }

}

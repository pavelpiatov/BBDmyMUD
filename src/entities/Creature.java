package entities;

public class Creature extends RoomObject {

    static final int HP_AT_LEVEL_ONE = 100;
    static final int SANITY_AT_LEVEL_ONE = 20;
    static final int HP_PER_LEVEL = 2;
    static final int SANITY_PER_LEVEL = 1;
    static final int STARTING_LEVEL = 1;
    static final int STARTING_EXP = 0;
    static final int DEFAULT_ACCURACY = 70;
    static final int DEFAULT_EVASION = 10;
    static final int DEFAULT_DAMAGE = 1;
    static final int DEFAULT_ARMOR = 0;
    static final int DEFAULT_DISPOSITION = 0;
    
    protected int hp;
    protected int hpCurrent;
    protected int dmg;
    protected int sanity;
    protected int sanityCurrent;
    protected int accuracy;
    protected int evasion;
    protected int armor;
    protected int disposition; // -20 to -1; 0; 1 to 20;
    protected int level;
    protected int exp;
    
    
    public Creature(){
        this.typeName = "creature";
        this.name = "creature";
        level = STARTING_LEVEL;
        exp = STARTING_EXP;
        hp = HP_AT_LEVEL_ONE;
        hpCurrent = hp;
        sanity = SANITY_AT_LEVEL_ONE;
        sanityCurrent = sanity;
        dmg = DEFAULT_DAMAGE;
        accuracy = DEFAULT_ACCURACY;
        evasion = DEFAULT_EVASION;
        armor = DEFAULT_ARMOR;
        disposition = DEFAULT_DISPOSITION;
    }
    
    public String stats(){
        StringBuilder statsOutput = new StringBuilder();
        statsOutput.append(String.format("%s stats. Level: %d Exp: %d\n ", name, level, exp));
        statsOutput.append(String.format("Hp %d/%d Sanity %d/%d\n", hpCurrent, hp, sanityCurrent, sanity));
        statsOutput.append(String.format("Damage %d Accuracy %d\n", dmg, accuracy));
        statsOutput.append(String.format("Armor %d Evasion %d\n", armor, evasion));
        
        return statsOutput.toString();
    }
    
    public String say(){
        return "this is a robbery";
    }
    

}

package entities;

import java.util.ArrayList;

public class Inventory {

    private final int id;
    private ArrayList<Item> itemList;

    public Inventory(){
        id = -466;
        itemList = new ArrayList<Item>();
    }
    
    public void add (Item item){
        itemList.add(item);
    }
    
    public void delete (Item item){
        itemList.remove(item);
    }
    
    public Item extract(Item item){
        if (itemList.isEmpty() || !itemList.contains(item)){
            return null;
        }
            int itemIndex = itemList.indexOf(item);
            Item extractedItem = itemList.get(itemIndex);
            itemList.remove(itemIndex);
            return extractedItem;
    }
    
}
   
    
    


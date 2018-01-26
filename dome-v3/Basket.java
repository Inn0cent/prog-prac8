import java.util.ArrayList;
/**
 * Write a description of class Basket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Basket
{
    
    public java.util.ArrayList<WholeItem> items;

    /**
     * Constructor for objects of class Basket
     */
    public Basket()
    {
        items = new ArrayList<WholeItem>();
    }

    public void addItem(WholeItem theItem){
        items.add(theItem);
    }
    
    public void list()
    {
        for(WholeItem item : items) {
            item.print();
            System.out.println();   // empty line between items
        }
    }
}

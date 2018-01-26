
/**
 * Write a description of class SellItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WholeItem
{
    
    protected int refID;
    protected String name;
    protected String description;
    protected double VAT;
    protected double pricePerUnit;
    
    /**
     * Constructor for objects of class SellItem
     */
    public WholeItem(int theRefID, String theName, String theDescription, double theVAT, double thePricePerUnit)
    {
        refID = theRefID;
        name = theName;
        description = theDescription;
        VAT = theVAT;
        pricePerUnit = thePricePerUnit;
    }
    
    public int getRefID(){
        return refID;
    }
    
    public double getVAT(){
        return VAT;
    }
    
    public double priceBeforeTax(int units){
        return units*pricePerUnit;
    }
    
    public double priceAfterTax(int units){
        return VAT*priceBeforeTax(units);
    }
    
    public void print(){
        System.out.println("reference ID: " + refID);
        System.out.println("name: " + name);
        System.out.println("description: " + description);
        System.out.println("VAT: " + VAT);
        System.out.println("price per unit: " + pricePerUnit);
    }
}















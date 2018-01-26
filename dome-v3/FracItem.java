
/**
 * Write a description of class FracItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FracItem extends WholeItem
{
    
    private String unitMeasure;

    /**
     * Constructor for objects of class FracItem
     */
    public FracItem(int theRefID, String theName, String theDescription, double theVAT, double thePricePerUnit, String theUnitMeasure)
    {
        super(theRefID, theName, theDescription, theVAT, thePricePerUnit);
        unitMeasure = theUnitMeasure;
    }
    
    public String getunitMeasure(){return unitMeasure;}
    
    public double priceBeforeTax(double units){
        return units*pricePerUnit;
    }
    
    public double priceAfterTax(double units){
        return VAT*priceBeforeTax(units);
    }
    
    public void print(){
        super.print();
        System.out.println("unit measure: " + unitMeasure);
    }
}

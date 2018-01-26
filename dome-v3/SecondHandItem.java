
/**
 * Write a description of class SecondHandItme here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SecondHandItem extends WholeItem
{
    
    private int grade;

    /**
     * Constructor for objects of class SecondHandItme
     */
    public SecondHandItem(int theRefID, String theName, String theDescription, double theVAT, double thePricePerUnit, int theGrade)
    {
        super(theRefID, theName, theDescription, theVAT, thePricePerUnit);
        grade = theGrade;
    }
    
    public double cost(int units){
        switch (grade){
            case 1: return super.priceAfterTax(units)*0.9;
            case 2: return super.priceAfterTax(units)*0.8;
            case 3: return super.priceAfterTax(units)*0.7;
            case 4: return super.priceAfterTax(units)*0.5;
            case 5: return super.priceAfterTax(units)*0.3;
            default: return super.priceAfterTax(units);
        }
    }
    
    public void print(){
        super.print();
        System.out.println("grade: " + grade);
    }
}

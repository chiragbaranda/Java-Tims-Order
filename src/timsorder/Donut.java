/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timsorder;

/**
 *
 * @author CHIRAG BARANDA 000759867
 */
public class Donut extends TimsProduct implements Consumable //donut class that extends the tims products and consumable interface, which implemts all the methods form the interface and class inherite the property of the parent class
       
{
    private String description; //donut decrption
    private int CalorieCount; //donut calories

    public Donut(String description, int CalorieCount, String name, double cost, double price) { //donut constructor
        super(name, cost, price);
        this.description = description;
        this.CalorieCount = CalorieCount;
    }
   
    public Donut create() //create method for donut
    {
        return null;
    }

    public String getDescription() {
        return description;
    }

    

    @Override
    public String toString() {
        
        return super.toString()+ "Donut{" + "description=" + description + ", CalorieCount=" + CalorieCount + '}';
    }

    @Override
    public int getCalorieCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getConsumptionMethod() 
    {
        System.out.println("Eat this!!");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

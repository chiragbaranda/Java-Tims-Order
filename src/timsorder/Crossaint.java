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
public class Crossaint extends TimsProduct implements Consumable
{

    public Crossaint(String name, double cost, double price) {
        super(name, cost, price);
    }

    @Override
    public int getCalorieCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getConsumptionMethod() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

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
public class TimsProduct implements Commodity
{
         private String name;
         private double cost;
         private double price;

    public TimsProduct(String name, double cost, double price) {
        this.name = name;
        this.cost = cost;
        this.price = price;
    }

    public String getName() {
        return name;
    }

   /* public double getProductionCost() {
        return cost;
    }

    public double getRetailPrice() {
        return price;
    }*/

    @Override
    public String toString() {
        return "TimsProduct{" + "name=" + name + ", cost=" + cost + ", price=" + price + '}';
    }

    @Override
    public double getProductionCost() {
        return cost;
    }

    @Override
    public double getRetailPrice() {
        return price;
    }
         
    
    
}

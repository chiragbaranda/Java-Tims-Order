/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timsorder;

import java.awt.Color;
import java.util.Scanner;

/**
 *
 * @author CHIRAG BARANDA 000759867
 */
public class TimsOrder {

    /**
     * @param args the command line arguments
     */
    private static int size; //size of the order
    private static String name; // name of the customer
    static TimsProduct[] tp; //array of timsproudct to store the order detail

    private TimsOrder(int size, String name) { //constrctor for the timorder,private
        this.size = size;
        this.name = name;
        
    }

    public static TimsOrder create() { //create method to create an order for customer
        Scanner sc = new Scanner(System.in); //scanner object
        System.out.println("Name and How Many items: "); 
        System.out.print("Name of customer: ");
        name = sc.nextLine(); //input for user's name
        System.out.print("\n#items: ");
        size = sc.nextInt(); //input for the size of the order
        tp = new TimsProduct[size]; //inialtize the tp
        int[] order = new int[size]; //making interger array for the order numebers
        double cost, retail; //cost and retail proce variable
        int cal; //calaries variable
        String desc; //desc of the item
        System.out.println("Choose your order!! \n 1.Mug 2. Donut 3.Crossaint");
        for (int i = 0; i < size; i++) { //for loop untill order size
            System.out.print("order item : " + (i+1) + "=> " ); order[i] = sc.nextInt();
            
            switch (order[i]) {
                case 1: //if order is MUG, it will ask for info and create mug object
                    sc.nextLine();
                    System.out.print("COST:");
                    cost = sc.nextDouble();
                    System.out.print("RETAIL PRICE:");
                    retail = sc.nextDouble();
                    tp[i] = new Mug(Color.BLACK, "Official Tim's Mug", cost, retail);
                    break;
                case 2: //order for the donut
                    sc.nextLine();
                    System.out.print("DESCRPTION: ");desc = sc.nextLine();
                    System.out.print("CALARIES: "); cal = sc.nextInt();
                    System.out.print("COST: ");          cost = sc.nextDouble();
                    System.out.print("RETAIL PRICE: ");  retail = sc.nextDouble();
                    
                    tp[i] = new Donut(desc, cal, "Donut", cost, retail);
                    break;
                    
                case 3: //order for crossiant
                    sc.nextLine();
                    System.out.print("DESCRPTION: ");   desc = sc.nextLine();
                    System.out.print("CALARIES: ");     cal = sc.nextInt();
                    System.out.print("COST: ");          cost = sc.nextDouble();
                    System.out.print("RETAIL PRICE: ");  retail = sc.nextDouble();
                    tp[i] = new Crossaint(name, cost, cost);
                    break;
        }
        /*for (int i = 0; i < tp.length; i++) {
            tp[i].toString();
        }*/
        }
        return null;
    }
    

    public double getAmountDue() //return the user gow much ammount due for the order payment
    {
        double total = 0.0; //total of order
        for (TimsProduct tp1 : tp) 
        {
            total += tp1.getRetailPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order for " + name + super.toString() ; //"TimsOrder{" + "size=" + size + ", name=" + name + '}';
    }

}

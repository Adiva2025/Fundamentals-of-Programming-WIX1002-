package lab;
import java.util.*;

class BurgerStall{
    private String name;
    private int sales ;
    private static int totalSales = 0;

    public BurgerStall(){
        this.name = null;
        this.sales = 0;
    }
    public int getSales(){
        return this.sales;
    }
    public void setSales(int sales){
        this.sales = sales;
    }
    public BurgerStall(String name){
        this.name = name;
    }
    public void sellBurger(int qty){
        this.sales += qty;
        totalSales += qty;
        System.out.println(qty + " burgers sold at " + this.name);
    }
    public static int getTotalSales(){
        return totalSales;
    }
}
public class L8Q6 {
    public static void main(String[] args) {
        BurgerStall stall1 = new BurgerStall("Burger King");
        BurgerStall stall2 = new BurgerStall("McDonald's");
        stall1.sellBurger(5);
        stall2.sellBurger(8);

        System.out.println("Total burgers sold in all stalls: " + BurgerStall.getTotalSales());
    }
    
}

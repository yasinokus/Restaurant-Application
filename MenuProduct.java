package OZU_Restaurant;

import java.util.ArrayList;
import java.util.List;

public class MenuProduct extends Product {
    ArrayList<Product> products = new ArrayList<Product>();
    public MenuProduct(String name, ArrayList<Product> products) {
        super(name);
        this.products=products;
        this.setPurchasePrice(calculateSellingPrice());
    }
    public double calculateExpense(){
    double sum=0;
    for(Product p:products){
        sum+=p.calculateExpense();
    }
    return sum;
    }
    private double calculateSellingPrice(){
    double sum=0;
    for(Product p:products){
           if(p instanceof MainDish)
               sum+=p.getPurchasePrice()*0.9;  //  10% discount is applied to main dishes
           else if(p instanceof Beverage)
               sum+=p.getPurchasePrice()*0.5;  //   50% discount to beverages.
           else if(p instanceof Dessert)
               sum+=p.getPurchasePrice()*0.8;  //  20% discount is applied to desserts
           else
               sum+=p.getPurchasePrice();
    }
    return sum;
    }
}

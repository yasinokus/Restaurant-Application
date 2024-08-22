package OZU_Restaurant;

import java.util.ArrayList;

public class Order  {
    ArrayList<Product> products = new ArrayList<Product>();
    public Order(){

    }
    public void addProduct(Product product){ //method is used to add a product to the order. 
    products.add(product);
    }
    public void listOrder(){ // method displays the ordered products.
        if(products.size()!=0){
            for(Product p:products){
                System.out.println(p.toString());
            }
        }
        else{
            System.out.println("You have not ordered anything yet!");
        }
    }
    public ArrayList<Product> getOrderedProducts(){ //  method returns the list of ordered products.
    return products;
    }
    public double calculateTotalPrice(){ // method calculates the total selling price of the order by iterating over products.
    double sum=0;
    for(Product p:products){
        sum+=p.getUtilityCost();
    }
    return sum;
    }

}

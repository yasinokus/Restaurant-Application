package OZU_Restaurant;



import java.util.ArrayList;

public class Waiter extends Employee {
    ArrayList<Order> Orders = new ArrayList<Order>();
     Waiter(int id, String name) {
        super(id, name);
    }
    public double calculateExpense(){
        double expense=0;
         for(Order o:Orders){
            //expense+=o.calculateTotalPrice()*0.1;
            for(Product p:o.products){
                expense+=p.getPurchasePrice()*0.1;
            }
        }
         return expense;
    }
     void createOrder(Order order){
    Orders.add(order);
    }
    public ArrayList<Order> getOrdersReceived(){
        return Orders;
    }
}

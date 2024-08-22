package OZU_Restaurant;

import java.util.ArrayList;
import java.util.Random;

public class Restaurant {

    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Product> products = new ArrayList<>();
    static int ID;
    public Restaurant() {
        initEmployees();
        initProducts();
        ID = employees.size();
    }

    private void initEmployees() {
        addCook("Monica", 100);
        addWaiter("Ross");
        addWaiter("Phobe");
        addWaiter("Rachel");
    }
    public void addWaiter(String name){ // method adds a waiter to the restaurant. It takes the name of the waiter.
        employees.add(new Waiter(ID+1,name));
        ID++;
    }
    public void addCook(String name,double salary){  // method adds a cook to the restaurant. It takes the name and salary of the cook
        employees.add(new Cook(ID+1,name,salary));
        ID++;
    }
    public void listEmployees(){                   // method prints out all employees.
        for(Employee e:employees){                  // looking objects of employees
            System.out.println(e.toString());
        }
    }
    public Waiter assignWaiter(){                      // method randomly selects a waiter and returns it.
        int r;
        while(true){
            r =new Random().nextInt(employees.size());
            if((employees.get(r) instanceof Waiter))
                break;
        }
        return (Waiter)employees.get(r);
    }
    public double calculateExpenses(){                    // method calculates the employee expenses and order expenses and returns the sum.
        double employesExpense=0,orderExpense=0;
        for(Employee e:employees){                        
            employesExpense+=e.calculateExpense();
            if(e instanceof Waiter){                     //  checking if a reference variable is containing a given type of object reference or not.
                for(Order o:((Waiter) e).Orders){
                    for(Product p:o.products){
                        orderExpense+=p.calculateExpense();
                    }
                }
            }
        }
        System.out.println("Employee Expense: "+employesExpense);

        System.out.println("Order Expense: "+orderExpense);
        return employesExpense+orderExpense;
    }
    public double calculateRevenue(){  // method calculates the revenue (earned money) from orders. This is not the profit. Profit is the Revenue – Expenses.
        double revenue=0;
        for(Employee e:employees){
            if(e instanceof Waiter){
                for(Order o:((Waiter) e).Orders){
                    for(Product p:o.products){
                        revenue+=p.getPurchasePrice();
                    }
                }
            }
        }
        return revenue;
    }
    public ArrayList<Product>getProducts(){
        return products;
    }
    private void initProducts() {

        // Parameters for Product Constructor:
        // Product Name, Selling Price, Purchase Price and Utility Cost

        products.add(new MainDish("Pizza", 6, 2, 2));
        products.add(new MainDish("Burger", 5, 1.5, 2));

        products.add(new Beverage("Coke", 2, 0.5));
        products.add(new Beverage("Lemonade", 2, 0.3));

        products.add(new Dessert("Tiramusu", 4, 1, 1));
        products.add(new Dessert("Cake", 3, 0.5, 1));
        products.add(new Dessert("Ice Cream", 3, 0.5, 0.5));

        ArrayList<Product> HGproducts = new ArrayList<>();
        HGproducts.add(new MainDish("Pizza", 6, 2, 2));
        HGproducts.add(new Beverage("Coke", 2, 0.5));
        HGproducts.add(new Dessert("Tiramusu", 4, 1, 1));
        products.add(new MenuProduct("Hunger Games Menu", HGproducts));

        ArrayList<Product> Kidsproducts = new ArrayList<>();
        Kidsproducts.add(new MainDish("Burger", 5, 1.5, 2));
        Kidsproducts.add(new Beverage("Lemonade", 2, 0.3));
        Kidsproducts.add(new Dessert("Ice Cream", 3, 0.5, 0.5));
        products.add(new MenuProduct("Kids Menu", Kidsproducts));
    }



    // Implement the rest of the class

}

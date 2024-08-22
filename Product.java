package OZU_Restaurant;

public class Product implements Expense{
    private String name;
    private double purchasePrice;
    private double sellingPrice;
    private double utilityCost;
    public Product(String name,double purchasePrice,double sellingPrice,double utilityCost){
    this.setName(name);
    this.setPurchasePrice(purchasePrice);
    this.setSellingPrice(sellingPrice);
    this.setUtilityCost(utilityCost);
    }
    public Product(String name){
        this.setName(name);
    }
    public String toString(){
        return this.getName()+": Price:"+getPurchasePrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getUtilityCost() {
        return utilityCost;
    }

    public void setUtilityCost(double utilityCost) {
        this.utilityCost = utilityCost;
    }

    public double calculateExpense() {
        return 0;
    }
}

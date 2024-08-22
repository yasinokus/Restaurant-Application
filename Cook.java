package OZU_Restaurant;

public class Cook extends Employee {
    private double salary;
    private double taxRate;
    public Cook(int id, String name,double salary) {
        super(id, name);
        this.setSalary(salary);
        this.taxRate=0.18;
    }
    public double calculateExpense(){
    double sum = (salary)+(salary * taxRate);
    return sum;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
}

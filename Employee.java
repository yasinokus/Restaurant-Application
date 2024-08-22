package OZU_Restaurant;

public class Employee implements Expense{ // so we are using expense interface in this class.
    private int id;
    private String name;
    public Employee(int id,String name){
        this.id=id;
        this.setName(name);
    }
    public String toString(){
        return "Employee "+this.id+": "+this.name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double calculateExpense() {
        return 0;
    }
}

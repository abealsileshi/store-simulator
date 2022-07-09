package fgls;
import java.lang.*;

public abstract class Employee {
    public String name;
    public Employee(String name){
        this.name = name;
    }
    public void order(Store store){
        this.announce();

    }
    public void announce(){
        System.out.println(this.name + ", Arrived to the store on day "+ Simulator.day);
    }


}

class Cashier extends Employee{
    int day = 0;
    public Cashier(String name){
        super(name);
    }

}

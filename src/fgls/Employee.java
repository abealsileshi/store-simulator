package fgls;
import java.lang.*;

public abstract class Employee {
    Store store = new Store();
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

class Bart extends Employee{
    int day = 0;
    public Bart(String name){
        super(name);
    }

}

package fgls;
import java.lang.*;

public abstract class Employee {
    public String name;
    Employee(String name){
        this.name = name;
    }
    public abstract void announce();
    public void order(){
        this.announce();
    }


}

class Bart extends Employee{
    public void announce(){

    }
}

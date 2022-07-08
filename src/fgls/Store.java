package fgls;
import java.util.*;

public class Store {
    public static ArrayList<Game> shelf = new ArrayList<Game>();
    public static ArrayList<Game> damagedShelf = new ArrayList<Game>();
    private int cashRegister = 0;

    public Store(){

    }
    public void addFunds(int money){
        this.cashRegister += money;
    }
    public void takeFunds(int money){
        this.cashRegister -= money;
    }

    //This is to initialize the shelf with games
    public void initShelf(){
        shelf.add(new Candyland());
    }

}

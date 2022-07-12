package fgls;
import java.util.*;

public class Store {
    public static ArrayList<Game> shelf = new ArrayList<Game>();
    public static ArrayList<Game> damagedShelf = new ArrayList<Game>();
    private int cashRegister;

    public Store(){
        this.cashRegister = 0;
    }
    public void addFunds(int money){
        this.cashRegister += money;
    }
    public void takeFunds(int money){
        this.cashRegister -= money;
    }

    //This is to initialize the shelf with games
    public void initShelf(){
        System.out.println("initShelf running....");
        shelf.add(new Family("Monopoly"));
        shelf.add(new Family("Clue"));
        shelf.add(new Family("Life"));
        shelf.add(new Kids("Mousetrap"));
        shelf.add(new Kids("Candyland"));
        shelf.add(new Kids("ConnectFour"));
        shelf.add(new Card("Magic"));
        shelf.add(new Card("Pokemon"));
        shelf.add(new Card("Netrunner"));
        shelf.add(new Board("Catan"));
        shelf.add(new Family("Risk"));
        shelf.add(new Family("Gloomhaven"));
    }
//Ernie - shortest to tallest height
//Ernie - widest games to most narrow


    public void stackByWidth(Employee e){
        if(e.name != "Ernie"){
            System.out.println("THIS PERSON DOESN'T STACK BY WIDTH");
            return;
        }
        ArrayList<Game> temp = new ArrayList<Game>();
        //Bubble sort below
//        boolean sorted = false;
//        while(!sorted) {
//
//        }

        Collections.sort(shelf, new Stack());

//        System.out.println(Arrays.asList(books));
        for(Game obj: shelf){
            System.out.println(obj.name);
        }
    }
}

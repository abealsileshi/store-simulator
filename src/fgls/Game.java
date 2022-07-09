package fgls;
import java.util.*;

public class Game implements Utility{
    String name;
    public int price;
    public int height;
    public int width;
    public int length;
    public int count = 3;
    public int shelfPos;

    public Game(String name){
        this.name = name;
    }
}

//Monopoly, Clue, Life
class Family extends Game{
    public Family(String name){
        super(name);
        this.price = Utility.rndFromRange(5,100);
        this.height = Utility.rndFromRange(3,10);
        this.width =  Utility.rndFromRange(3,10);
        this.length = Utility.rndFromRange(3,10);
    }
}

//Mousetrap, Candyland, Connect Four
class Kids extends Game{
    public Kids(String name){
        super(name);
        this.price = Utility.rndFromRange(5,100);
        this.height = Utility.rndFromRange(3,10);
        this.width =  Utility.rndFromRange(3,10);
        this.length = Utility.rndFromRange(3,10);
    }
}

//Magic, Pokémon, Netrunner
class Card extends Game{
    public Card(String name){
        super(name);
        this.price = Utility.rndFromRange(5,100);
        this.height = Utility.rndFromRange(3,10);
        this.width =  Utility.rndFromRange(3,10);
        this.length = Utility.rndFromRange(3,10);
    }
}

//Catan, Risk, Gloomhaven
class Board extends Game{
    public Board(String name){
        super(name);
        this.price = Utility.rndFromRange(5,100);
        this.height = Utility.rndFromRange(3,10);
        this.width =  Utility.rndFromRange(3,10);
        this.length = Utility.rndFromRange(3,10);
    }
}
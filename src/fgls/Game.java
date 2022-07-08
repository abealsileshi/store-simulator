package fgls;

public class Game {
    private int price;
    private int height;
    private int width;
    private int length;
    private int count = 3;
    public int shelfPos;

    public Game(int p, int h, int w, int len){
        this.price = p;
        this.height = h;
        this.width =  w;
        this.length = len;
    }
    public void incrCount(){
        count = count +1;
    }
    public void decrCount(){
        count = count - 1;
    }

}

class Family extends Game{
    super();
}
class Kids extends Game{
    super();
}
class Card extends Game{
    super();
}
class Board extends Game{
    super();
}
class Monopoly extends Family{
    super();
}
class Clue extends Family{
    super();
}
class Life extends Family{
    super();
}
class Mousetrap extends Kids{
    super();
}
class Candyland extends Kids{
    super();
}
class ConnectFour extends Kids{
    super();
}
class Magic extends Card{
    super();
}
class Pokemon extends Card{
    super();
}
class Netrunner extends Card{
    super();
}
class Netrunner extends Card{
    super();
}
class Catan extends Board{
    super();
}
class Risk extends Board{
    super();
}
class Gloomhaven extends Board{
    super();
}
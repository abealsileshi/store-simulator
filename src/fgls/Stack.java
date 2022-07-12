package fgls;

import java.util.Comparator;

public class Stack implements Comparator<Game> {
    int compare(Game a, Game b)
    {
        if(a.width < b.width){
            return 1;
        }
        return -1;
        //return a.width - b.width;
    }
}

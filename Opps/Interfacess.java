package Opps;

public class Interfacess {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        Beer b = new Beer();
        b.eat();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
     public void moves(){
        System.out.println("up down left right deagonal");
    }
}

class Root  implements ChessPlayer{
     public void moves(){
        System.out.println("up down left right ");
    }
}

class King implements ChessPlayer{
     public void moves(){
        System.out.println("up down left right deagonal in all direction");
    }
}

interface Hervibore{
    void eat();
}
interface Carvibore{
    void eat();
}

class Beer implements Hervibore,Carvibore{
    public void eat(){
        System.out.println("Eating grass and meat");
    }
}

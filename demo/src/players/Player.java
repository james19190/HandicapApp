package src.players;

public class Player {

    // class variables
    private String name;
    private int ghinHandi;

    public Player(String name, int ghinHandi){
        this.name = name;
        this.ghinHandi = ghinHandi;
    }

    public String getName(){
        return name;
    }

    public int getGhinHandi(){
        return ghinHandi;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGhinHandi(int ghinHandi){
        this.ghinHandi = ghinHandi;
    }

    public void printPlayer(){
        System.out.println("Name: " + name + " Handicap: " + ghinHandi);
    }
    
}

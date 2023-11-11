public class Defender extends Player {
    private int defendingMoves;

    public Defender(int defendingMoves, String name, Double transferfee, String nationality, int shirtNumber){
        super(name, transferfee, nationality, shirtNumber);
        this.defendingMoves = defendingMoves;
        
    }
    public void setDefendingMoves(){
        this.defendingMoves = defendingMoves;
    }
    
    public int getDefendingMoves(){
        this.defendingMoves = defendingMoves;
        return this.defendingMoves;
    }
    public String getDetails(){
        return super.toString() + "Defender {" + "Defending moves = " + defendingMoves + "}";        
    }
}
   


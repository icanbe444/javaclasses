public class Midfielder extends Player{
    private int importantMoves;
    private int goalScrored;

    public Midfielder(int importantMoves, int goalScrored, String name, Double transferfee, String nationality, int shirtNumber){
        super(name, transferfee, nationality, shirtNumber);
        this.importantMoves = importantMoves;
        this.goalScrored = goalScrored;
     
    }
    public void setmidFielder(){
        this.importantMoves = importantMoves;

    }

    public void setgoalScored(){
        this.goalScrored = goalScrored;
    }

    public int getgoalScored(){
        return goalScrored;
    }
    public int getimportantMoves(){
        return importantMoves;
    }

    public String getDetails(){
        return super.toString() + "Midfielder  {" + "important Moves =" + importantMoves + '}';
    }
}

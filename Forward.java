public class Forward  extends Player{
    private int goalsScored;

    public Forward(String name, double transferfee, String nationality, int shirtNumber, int goalsScored){
        super(name, transferfee, nationality, shirtNumber);
        this.goalsScored = goalsScored;
    }

    public int getGoalsScored(){
        return goalsScored;
    }

    public void setGoalScored(int goalsSaved){
        this.goalsScored = goalsSaved;
    }

    public String toString(){
        return super.toString() + " Midfielder  { " + " important Moves = " + goalsScored + '}';
        
    }
}
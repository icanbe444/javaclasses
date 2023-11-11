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
        return "Player {" + "Name = " + getName(null) + ", Positions = " + getShirtNumber(10) + ", TransferFee = $" + getTransferfee(null) + "}"; 
        
    }
    public String getDetails(){
        return super.toString() + "Forwarder  {" + "important Moves =" + goalsScored + '}';
    }
}
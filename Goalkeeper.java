public class Goalkeeper extends Player{
    public int goalsSaved;
    public Goalkeeper(int goalsSaved, String name, Double transferfee, String nationality, int shirtNumber){
        super(name, transferfee, nationality, shirtNumber);
        this.goalsSaved = goalsSaved;
    }
    

    public void setgoalSaved(int goalsSaved){
        this.goalsSaved = goalsSaved;
    }
    
    public int getgoalSaved(){
        return goalsSaved;
    }

    public String tosString(){
        return "Player {" + "Name = " + getName(null) + ", Positions = " + getShirtNumber(10) + ", TransferFee = $" + getTransferfee(null) + "}"; 
        // return "goal saved = " + goalsSaved;    
    }

}
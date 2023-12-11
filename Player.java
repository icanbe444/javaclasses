public class Player {
    private String name;
    private Double transferfee;
    private String nationality;
    private int shirtNumber;
    // create the Constructor
    public Player(String name, Double transferfee, String nationality, int shirtNumber){
        this.name = name;
        this.transferfee = transferfee;
        this.nationality = nationality;
        this.shirtNumber = shirtNumber;
        
    }
    // Create my set method
    public void setName(String name){
        this.name = name;
    }
    public void setShirtNumber(int shirtNumber){
        this.shirtNumber = shirtNumber;
    }
    public void setTransferfee(Double transferfee){
        this.transferfee = transferfee;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    // create my get method
    public String getName(){
        this.name = name;
        return this.name;
    }
    public int getShirtNumber(){
        this.shirtNumber = shirtNumber;
        return this.shirtNumber;
    }
    public Double getTransferfee(){
        this.transferfee = transferfee;
        return this.transferfee;
    }
    public String getNationality(){
        this.nationality = nationality;
        return this.nationality;
    }
    // create my string method
    public String toString(){
        String st = "\n";
        st += "Name: ";
        st += this.name;

        st += " - Transfer Fee: ";
        st += this.transferfee;

        st += "Nationality: ";
        st += this.nationality;

        st += "Shirt Number: ";
        st += this.shirtNumber; 

        return st;

    }


    
}



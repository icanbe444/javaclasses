import java.util.ArrayList;


public class FootballTeams {
    ArrayList<Player> team;
    private String teamName;
    private String manager;
    

    public FootballTeams(String teamName, String manager){
        this.teamName = teamName;
        this.manager = manager;
        this.team = new ArrayList<>();
    }

    public String getTeamName(){
        return teamName;
    }
    public String getManager(){
        return manager;
    }

    public double getTotalClubFee(){
        double totalfee = 0;
        for (Player player: team){
            totalfee += player.getTransferfee();
        }
        return totalfee;

    }
    public String getPlayerList(){
        String output = "";
        for(Player player: team){
            
            output += "Player: {" + "Name: "+  player.getName()+  " Transfer Fee: "+player.getTransferfee()+ " Nationality: " + player.getNationality() + " ShirtName: " +player.getShirtNumber();
        }
        return output;

    }
    public void getPlayerall(){
        for(Player player: team){
            if (player instanceof Defender){
                Defender defender = (Defender)player;
                System.out.println(player.toString());
            }else if(player instanceof Midfielder){
                Midfielder midfielder = (Midfielder)player;
                System.out.println(midfielder.toString());

            }else if(player instanceof Forward){
                Forward forward = (Forward) player;
                System.out.println(forward.toString());
            
            }else if(player instanceof Goalkeeper){
                Goalkeeper goalkeeper = (Goalkeeper)player;
                System.out.println();
            }
            
        }


       
       

       }

    }
    public void addPlayer(Player player){
        team.add(player);
    }
    public void removePlayer(Player player){
        team.remove(player);
    }


   
}

}

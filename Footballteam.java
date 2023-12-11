import java.util.ArrayList;

public class FootballTeams{
    ArrayList<Player>team;
    private String teamName;
    private String teammanager;

    public FootballTeams(String teamName, String teamManager){
        this.teamName = teamName;
        this.teamManager = teamManager;
        this.team = new ArrayList<>();
    }

    public String getManager(){
        return this.teamManager;
    }
    public String getTeamName(){
        return this.teamName;
    }

    public double getTotalClubFee(){
        for (Player player: team){
            totalfee += player.getTransferfee();
        }
        return totalfee;
    }

    public String getPlayer(){
        for(Player player: team){
            String output = "\n"
            output += player.getName() "transfer fee" + " " + player.getTransferfee() + "
            Shirt Number " + player.getShirtNumber; 
            return output;
        }

    }
    public void getPlayerall(){
        for(Player player: team){
            if(player instanceof Defender){
                Defender defender = (Defender)player;
                System.out.println(player.toString());
            }
        }
    }

    public void addPlayer(Player player){
        team.addPlayer(player);
    }

    public void removePlayer(Player player){
        team.removePlayer(player)
;    }


}

import java.util.ArrayList;

public class Footballteam {
    private ArrayList<Player>team;
    private String teamName;
    private String manager;

    // Constructor
    public Footballteam(String name, String Manager){
        this.team = new ArrayList<>();
        this.teamName = name;
        this.manager = Manager;
    }

    public void setTeamName(String teamName){
        this.teamName = teamName;
    }
    public void setManager(String manager){
        this.manager = manager;
    }

    public String getTeamName(String teamName){
        return teamName;
    }
    public String getManager(){
        return manager;

    }
    public double getTotalClubFees(){
        double totalfees = 0.0;
        double transferefee = 0.0;
        for (Player player: team){
            transferefee = player.getTransferfee(null);
            totalfees += transferefee;
        }
        return totalfees;
    }

    public String getPlayerList(){
        String output = " ";
        for(Player player: team){
            output += player.getName() + "(Nationality: " + player.getNationality() + "Transfer Fee: " + player.getTransferfee(null) +")" + "\n";
            
        }
        return output;
    }

    public void displayAllPlayerDetails(){
        for(Player player: team){
            if (player instanceof Defender){
                Defender defender = (Defender) player;
                System.out.println(defender.getDetails());
            }else if (player instanceof Goalkeeper) {
                Goalkeeper goalkeeper = (Goalkeeper) player;
                System.out.println(goalkeeper.getDetails());
            }else if (player instanceof Forward){
                Forward forward = (Forward) player;
                System.out.println(forward.getDetails());
            }else if (player instanceof Midfielder){
                Midfielder midfielder = (Midfielder) player;
                System.out.println(midfielder.getDetails());
            }
           
        }
    }
  
}

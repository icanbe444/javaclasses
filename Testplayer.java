public class Testplayer {
    
    public static void main(String[] args) {
        Player myPlayer = new  Player("Okocha", 50000.98, "Nigerian", 10);
        Goalkeeper myGoalkeeper = new Goalkeeper(20, "Peter Crouch", 500000.00, "English", 1);
        Defender myDefender = new Defender(10, "John Terry", 30000.00, "English", 22);
        Midfielder myMidfielder = new Midfielder(5, 10, "Dulla", 20000.00, "Ghanian", 10);
        Forward myForward = new Forward("Akanbi", 1.1, "Nigerian", 20, 20);
        System.out.println(myPlayer.toString());
        System.out.println(myGoalkeeper.toString());
        System.out.println(myDefender.toString());
        System.out.println(myMidfielder.toString());
        System.out.println(myForward.toString());
    }
    
}
